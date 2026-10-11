// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyConfigurationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The default actions to be performed in each effective phase (PreDns, PreRequest, and PostResponse) when traffic does not match any rules.</p>
     */
    @NameInMap("DefaultRulePhaseActions")
    public CreateEgressProxyConfigurationRequestDefaultRulePhaseActions defaultRulePhaseActions;

    /**
     * <p>The description of the egress proxy configuration. The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run of the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run and does not create the egress proxy configuration. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, the corresponding error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the egress proxy configuration. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyConfigurationName")
    public String egressProxyConfigurationName;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4jcyx5e****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEgressProxyConfigurationRequestTag> tag;

    public static CreateEgressProxyConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyConfigurationRequest self = new CreateEgressProxyConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyConfigurationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEgressProxyConfigurationRequest setDefaultRulePhaseActions(CreateEgressProxyConfigurationRequestDefaultRulePhaseActions defaultRulePhaseActions) {
        this.defaultRulePhaseActions = defaultRulePhaseActions;
        return this;
    }
    public CreateEgressProxyConfigurationRequestDefaultRulePhaseActions getDefaultRulePhaseActions() {
        return this.defaultRulePhaseActions;
    }

    public CreateEgressProxyConfigurationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEgressProxyConfigurationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateEgressProxyConfigurationRequest setEgressProxyConfigurationName(String egressProxyConfigurationName) {
        this.egressProxyConfigurationName = egressProxyConfigurationName;
        return this;
    }
    public String getEgressProxyConfigurationName() {
        return this.egressProxyConfigurationName;
    }

    public CreateEgressProxyConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEgressProxyConfigurationRequest setTag(java.util.List<CreateEgressProxyConfigurationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEgressProxyConfigurationRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateEgressProxyConfigurationRequestDefaultRulePhaseActions extends TeaModel {
        /**
         * <p>The default action to be performed in the PostResponse phase (after the response is returned) when traffic does not match any rules. This phase supports only the <strong>Allow</strong> value (default), which allows the traffic to pass through.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PostResponse")
        public String postResponse;

        /**
         * <p>The default action to be performed in the PreDns phase (before DNS resolution) when traffic does not match any rules. Valid values:</p>
         * <ul>
         * <li><p><strong>Allow</strong> (default): allows the traffic to pass through.</p>
         * </li>
         * <li><p><strong>Deny</strong>: denies the traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PreDns")
        public String preDns;

        /**
         * <p>The default action to be performed in the PreRequest phase (before the request is forwarded) when traffic does not match any rules. Valid values:</p>
         * <ul>
         * <li><p><strong>Allow</strong> (default): allows the traffic to pass through.</p>
         * </li>
         * <li><p><strong>Deny</strong>: denies the traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PreRequest")
        public String preRequest;

        public static CreateEgressProxyConfigurationRequestDefaultRulePhaseActions build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyConfigurationRequestDefaultRulePhaseActions self = new CreateEgressProxyConfigurationRequestDefaultRulePhaseActions();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyConfigurationRequestDefaultRulePhaseActions setPostResponse(String postResponse) {
            this.postResponse = postResponse;
            return this;
        }
        public String getPostResponse() {
            return this.postResponse;
        }

        public CreateEgressProxyConfigurationRequestDefaultRulePhaseActions setPreDns(String preDns) {
            this.preDns = preDns;
            return this;
        }
        public String getPreDns() {
            return this.preDns;
        }

        public CreateEgressProxyConfigurationRequestDefaultRulePhaseActions setPreRequest(String preRequest) {
            this.preRequest = preRequest;
            return this;
        }
        public String getPreRequest() {
            return this.preRequest;
        }

    }

    public static class CreateEgressProxyConfigurationRequestTag extends TeaModel {
        /**
         * <p>The tag key. The key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 256 characters in length, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEgressProxyConfigurationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyConfigurationRequestTag self = new CreateEgressProxyConfigurationRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyConfigurationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEgressProxyConfigurationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
