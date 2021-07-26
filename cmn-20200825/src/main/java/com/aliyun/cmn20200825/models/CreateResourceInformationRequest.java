// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateResourceInformationRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源类型
    @NameInMap("ResourceType")
    public String resourceType;

    // 资源属性
    @NameInMap("ResourceAttribute")
    public String resourceAttribute;

    // 架构id
    @NameInMap("ArchitectureId")
    public String architectureId;

    // 信息
    @NameInMap("Information")
    public java.util.List<CreateResourceInformationRequestInformation> information;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateResourceInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceInformationRequest self = new CreateResourceInformationRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateResourceInformationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateResourceInformationRequest setResourceAttribute(String resourceAttribute) {
        this.resourceAttribute = resourceAttribute;
        return this;
    }
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    public CreateResourceInformationRequest setArchitectureId(String architectureId) {
        this.architectureId = architectureId;
        return this;
    }
    public String getArchitectureId() {
        return this.architectureId;
    }

    public CreateResourceInformationRequest setInformation(java.util.List<CreateResourceInformationRequestInformation> information) {
        this.information = information;
        return this;
    }
    public java.util.List<CreateResourceInformationRequestInformation> getInformation() {
        return this.information;
    }

    public CreateResourceInformationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateResourceInformationRequestInformation extends TeaModel {
        // 键
        @NameInMap("Key")
        public String key;

        // 键属性
        @NameInMap("KeyAttribute")
        public String keyAttribute;

        // 键动作
        @NameInMap("KeyAction")
        public String keyAction;

        // 键描述
        @NameInMap("KeyDescription")
        public String keyDescription;

        public static CreateResourceInformationRequestInformation build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceInformationRequestInformation self = new CreateResourceInformationRequestInformation();
            return TeaModel.build(map, self);
        }

        public CreateResourceInformationRequestInformation setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResourceInformationRequestInformation setKeyAttribute(String keyAttribute) {
            this.keyAttribute = keyAttribute;
            return this;
        }
        public String getKeyAttribute() {
            return this.keyAttribute;
        }

        public CreateResourceInformationRequestInformation setKeyAction(String keyAction) {
            this.keyAction = keyAction;
            return this;
        }
        public String getKeyAction() {
            return this.keyAction;
        }

        public CreateResourceInformationRequestInformation setKeyDescription(String keyDescription) {
            this.keyDescription = keyDescription;
            return this;
        }
        public String getKeyDescription() {
            return this.keyDescription;
        }

    }

}
