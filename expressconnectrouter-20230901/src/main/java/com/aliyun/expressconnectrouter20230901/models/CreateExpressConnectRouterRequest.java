// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateExpressConnectRouterRequest extends TeaModel {
    /**
     * <p>The Autonomous System Number (ASN) of the Express Connect Router (ECR) instance. Valid values: 45104 (default), 64512 to 65534, and 4200000000 to 4294967294. The value 65025 is reserved by Alibaba Cloud.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>45104</p>
     */
    @NameInMap("AlibabaSideAsn")
    public Long alibabaSideAsn;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the token from your client to ensure that the token is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Express Connect Router (ECR) instance.</p>
     * <blockquote>
     * <p>The description can be empty or 0 to 256 characters in length, and cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether it is only a dry run for this request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Sends a check request without modifying service resources.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the Express Connect Router (ECR) instance.</p>
     * <blockquote>
     * <p>The name can be empty or 0 to 128 characters in length, and cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the resource group to which the Express Connect Router (ECR) instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmvvajg5q****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateExpressConnectRouterRequestTag> tag;

    @NameInMap("Version")
    public String version;

    public static CreateExpressConnectRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectRouterRequest self = new CreateExpressConnectRouterRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectRouterRequest setAlibabaSideAsn(Long alibabaSideAsn) {
        this.alibabaSideAsn = alibabaSideAsn;
        return this;
    }
    public Long getAlibabaSideAsn() {
        return this.alibabaSideAsn;
    }

    public CreateExpressConnectRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateExpressConnectRouterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExpressConnectRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateExpressConnectRouterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExpressConnectRouterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateExpressConnectRouterRequest setTag(java.util.List<CreateExpressConnectRouterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateExpressConnectRouterRequestTag> getTag() {
        return this.tag;
    }

    public CreateExpressConnectRouterRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class CreateExpressConnectRouterRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the listener. Valid values of N: <strong>1</strong> to <strong>20</strong>. If specified, the value can be an empty string. The value can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateExpressConnectRouterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateExpressConnectRouterRequestTag self = new CreateExpressConnectRouterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateExpressConnectRouterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateExpressConnectRouterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
