// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateExpressConnectRouterRequest extends TeaModel {
    /**
     * <p>The autonomous system number (ASN) of the ECR. Valid values: 45104, 64512 to 65534, and 4200000000 to 4294967294. Default value: 45104. The value 65025 is reserved by Alibaba Cloud.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>45104</p>
     */
    @NameInMap("AlibabaSideAsn")
    public Long alibabaSideAsn;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the ECR.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the ECR.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the resource group to which the ECR belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmvvajg5q****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The information about the tags.</p>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateExpressConnectRouterRequestTag> tag;

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

    public static class CreateExpressConnectRouterRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
