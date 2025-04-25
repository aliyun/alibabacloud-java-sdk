// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateVscRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <strong>example:</strong>
     * <p>rg-aek2xdkc6icwfha</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<CreateVscRequestTag> tag;

    /**
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("VscName")
    public String vscName;

    /**
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("VscType")
    public String vscType;

    public static CreateVscRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVscRequest self = new CreateVscRequest();
        return TeaModel.build(map, self);
    }

    public CreateVscRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVscRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateVscRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVscRequest setTag(java.util.List<CreateVscRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVscRequestTag> getTag() {
        return this.tag;
    }

    public CreateVscRequest setVscName(String vscName) {
        this.vscName = vscName;
        return this;
    }
    public String getVscName() {
        return this.vscName;
    }

    public CreateVscRequest setVscType(String vscType) {
        this.vscType = vscType;
        return this;
    }
    public String getVscType() {
        return this.vscType;
    }

    public static class CreateVscRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key001</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value001</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVscRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVscRequestTag self = new CreateVscRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVscRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVscRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
