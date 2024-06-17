// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateExpressConnectRouterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>45104</p>
     */
    @NameInMap("AlibabaSideAsn")
    public Long alibabaSideAsn;

    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmvvajg5q****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<CreateExpressConnectRouterRequestTags> tags;

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

    public CreateExpressConnectRouterRequest setTags(java.util.List<CreateExpressConnectRouterRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateExpressConnectRouterRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateExpressConnectRouterRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateExpressConnectRouterRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateExpressConnectRouterRequestTags self = new CreateExpressConnectRouterRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateExpressConnectRouterRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateExpressConnectRouterRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
