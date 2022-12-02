// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateResourceInformationRequest extends TeaModel {
    @NameInMap("Information")
    public java.util.List<UpdateResourceInformationRequestInformation> information;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceAttribute")
    public String resourceAttribute;

    @NameInMap("ResourceInformationId")
    public String resourceInformationId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static UpdateResourceInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInformationRequest self = new UpdateResourceInformationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInformationRequest setInformation(java.util.List<UpdateResourceInformationRequestInformation> information) {
        this.information = information;
        return this;
    }
    public java.util.List<UpdateResourceInformationRequestInformation> getInformation() {
        return this.information;
    }

    public UpdateResourceInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateResourceInformationRequest setResourceAttribute(String resourceAttribute) {
        this.resourceAttribute = resourceAttribute;
        return this;
    }
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    public UpdateResourceInformationRequest setResourceInformationId(String resourceInformationId) {
        this.resourceInformationId = resourceInformationId;
        return this;
    }
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    public UpdateResourceInformationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public static class UpdateResourceInformationRequestInformation extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("KeyAction")
        public String keyAction;

        @NameInMap("KeyAttribute")
        public String keyAttribute;

        @NameInMap("KeyDescription")
        public String keyDescription;

        @NameInMap("SetupProjectId")
        public String setupProjectId;

        public static UpdateResourceInformationRequestInformation build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceInformationRequestInformation self = new UpdateResourceInformationRequestInformation();
            return TeaModel.build(map, self);
        }

        public UpdateResourceInformationRequestInformation setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateResourceInformationRequestInformation setKeyAction(String keyAction) {
            this.keyAction = keyAction;
            return this;
        }
        public String getKeyAction() {
            return this.keyAction;
        }

        public UpdateResourceInformationRequestInformation setKeyAttribute(String keyAttribute) {
            this.keyAttribute = keyAttribute;
            return this;
        }
        public String getKeyAttribute() {
            return this.keyAttribute;
        }

        public UpdateResourceInformationRequestInformation setKeyDescription(String keyDescription) {
            this.keyDescription = keyDescription;
            return this;
        }
        public String getKeyDescription() {
            return this.keyDescription;
        }

        public UpdateResourceInformationRequestInformation setSetupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

    }

}
