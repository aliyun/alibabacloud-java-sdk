// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateResourceInformationRequest extends TeaModel {
    @NameInMap("ArchitectureId")
    public String architectureId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Information")
    public java.util.List<CreateResourceInformationRequestInformation> information;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceAttribute")
    public String resourceAttribute;

    @NameInMap("ResourceType")
    public String resourceType;

    public static CreateResourceInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceInformationRequest self = new CreateResourceInformationRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceInformationRequest setArchitectureId(String architectureId) {
        this.architectureId = architectureId;
        return this;
    }
    public String getArchitectureId() {
        return this.architectureId;
    }

    public CreateResourceInformationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateResourceInformationRequest setInformation(java.util.List<CreateResourceInformationRequestInformation> information) {
        this.information = information;
        return this;
    }
    public java.util.List<CreateResourceInformationRequestInformation> getInformation() {
        return this.information;
    }

    public CreateResourceInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateResourceInformationRequest setResourceAttribute(String resourceAttribute) {
        this.resourceAttribute = resourceAttribute;
        return this;
    }
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    public CreateResourceInformationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public static class CreateResourceInformationRequestInformation extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("KeyAction")
        public String keyAction;

        @NameInMap("KeyAttribute")
        public String keyAttribute;

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

        public CreateResourceInformationRequestInformation setKeyAction(String keyAction) {
            this.keyAction = keyAction;
            return this;
        }
        public String getKeyAction() {
            return this.keyAction;
        }

        public CreateResourceInformationRequestInformation setKeyAttribute(String keyAttribute) {
            this.keyAttribute = keyAttribute;
            return this;
        }
        public String getKeyAttribute() {
            return this.keyAttribute;
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
