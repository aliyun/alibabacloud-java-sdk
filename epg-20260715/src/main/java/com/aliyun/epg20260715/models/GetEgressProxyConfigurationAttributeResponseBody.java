// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyConfigurationAttributeResponseBody extends TeaModel {
    /**
     * <p>The creation time of the egress proxy configuration. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-02T02:20:24Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The default actions executed in each effective phase (PreDns, PreRequest, and PostResponse) when traffic does not match any rules.</p>
     */
    @NameInMap("DefaultRulePhaseActions")
    public GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions defaultRulePhaseActions;

    /**
     * <p>The description of the egress proxy configuration. The description must be 2 to 256 characters in length and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the egress proxy configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>epc-uf609a6a8fdf9f4d****</p>
     */
    @NameInMap("EgressProxyConfigurationId")
    public String egressProxyConfigurationId;

    /**
     * <p>The name of the egress proxy configuration. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyConfigurationName")
    public String egressProxyConfigurationName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C79118A9-CA6D-5359-B53E-111BE8A03DCF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzorljcazp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of egress rule group references associated with the egress proxy configuration.</p>
     */
    @NameInMap("RuleGroups")
    public java.util.List<GetEgressProxyConfigurationAttributeResponseBodyRuleGroups> ruleGroups;

    /**
     * <p>The status of the egress proxy configuration. Valid values:</p>
     * <ul>
     * <li><p><strong>Provisioning</strong>: The configuration is being created.</p>
     * </li>
     * <li><p><strong>Available</strong>: The configuration is available.</p>
     * </li>
     * <li><p><strong>Configuring</strong>: The configuration is being modified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetEgressProxyConfigurationAttributeResponseBodyTags> tags;

    public static GetEgressProxyConfigurationAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyConfigurationAttributeResponseBody self = new GetEgressProxyConfigurationAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyConfigurationAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetEgressProxyConfigurationAttributeResponseBody setDefaultRulePhaseActions(GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions defaultRulePhaseActions) {
        this.defaultRulePhaseActions = defaultRulePhaseActions;
        return this;
    }
    public GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions getDefaultRulePhaseActions() {
        return this.defaultRulePhaseActions;
    }

    public GetEgressProxyConfigurationAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetEgressProxyConfigurationAttributeResponseBody setEgressProxyConfigurationId(String egressProxyConfigurationId) {
        this.egressProxyConfigurationId = egressProxyConfigurationId;
        return this;
    }
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    public GetEgressProxyConfigurationAttributeResponseBody setEgressProxyConfigurationName(String egressProxyConfigurationName) {
        this.egressProxyConfigurationName = egressProxyConfigurationName;
        return this;
    }
    public String getEgressProxyConfigurationName() {
        return this.egressProxyConfigurationName;
    }

    public GetEgressProxyConfigurationAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEgressProxyConfigurationAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetEgressProxyConfigurationAttributeResponseBody setRuleGroups(java.util.List<GetEgressProxyConfigurationAttributeResponseBodyRuleGroups> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }
    public java.util.List<GetEgressProxyConfigurationAttributeResponseBodyRuleGroups> getRuleGroups() {
        return this.ruleGroups;
    }

    public GetEgressProxyConfigurationAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEgressProxyConfigurationAttributeResponseBody setTags(java.util.List<GetEgressProxyConfigurationAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetEgressProxyConfigurationAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions extends TeaModel {
        /**
         * <p>The default action executed in the PostResponse phase (after a response is returned) when traffic does not match any rules. This phase only supports the value <strong>Allow</strong> (default), which indicates that the traffic is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PostResponse")
        public String postResponse;

        /**
         * <p>The default action executed in the PreDns phase (before DNS resolution) when traffic does not match any rules. Valid values:</p>
         * <ul>
         * <li><p><strong>Allow</strong> (default): allows the traffic.</p>
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
         * <p>The default action executed in the PreRequest phase (before a request is forwarded) when traffic does not match any rules. Valid values:</p>
         * <ul>
         * <li><p><strong>Allow</strong> (default): allows the traffic.</p>
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

        public static GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions self = new GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions setPostResponse(String postResponse) {
            this.postResponse = postResponse;
            return this;
        }
        public String getPostResponse() {
            return this.postResponse;
        }

        public GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions setPreDns(String preDns) {
            this.preDns = preDns;
            return this;
        }
        public String getPreDns() {
            return this.preDns;
        }

        public GetEgressProxyConfigurationAttributeResponseBodyDefaultRulePhaseActions setPreRequest(String preRequest) {
            this.preRequest = preRequest;
            return this;
        }
        public String getPreRequest() {
            return this.preRequest;
        }

    }

    public static class GetEgressProxyConfigurationAttributeResponseBodyRuleGroups extends TeaModel {
        /**
         * <p>The ID of the egress rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>eprg-uf60966a9633667c****</p>
         */
        @NameInMap("EgressProxyRuleGroupId")
        public String egressProxyRuleGroupId;

        /**
         * <p>The priority of the egress rule group in the egress proxy configuration. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static GetEgressProxyConfigurationAttributeResponseBodyRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyConfigurationAttributeResponseBodyRuleGroups self = new GetEgressProxyConfigurationAttributeResponseBodyRuleGroups();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyConfigurationAttributeResponseBodyRuleGroups setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }
        public String getEgressProxyRuleGroupId() {
            return this.egressProxyRuleGroupId;
        }

        public GetEgressProxyConfigurationAttributeResponseBodyRuleGroups setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class GetEgressProxyConfigurationAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEgressProxyConfigurationAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyConfigurationAttributeResponseBodyTags self = new GetEgressProxyConfigurationAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyConfigurationAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetEgressProxyConfigurationAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
