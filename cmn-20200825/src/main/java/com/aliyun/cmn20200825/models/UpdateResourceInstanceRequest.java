// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceInformation")
    public java.util.List<UpdateResourceInstanceRequestResourceInformation> resourceInformation;

    @NameInMap("ResourceInformationId")
    public String resourceInformationId;

    @NameInMap("SetupProjectId")
    public String setupProjectId;

    public static UpdateResourceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceRequest self = new UpdateResourceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateResourceInstanceRequest setResourceInformation(java.util.List<UpdateResourceInstanceRequestResourceInformation> resourceInformation) {
        this.resourceInformation = resourceInformation;
        return this;
    }
    public java.util.List<UpdateResourceInstanceRequestResourceInformation> getResourceInformation() {
        return this.resourceInformation;
    }

    public UpdateResourceInstanceRequest setResourceInformationId(String resourceInformationId) {
        this.resourceInformationId = resourceInformationId;
        return this;
    }
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    public UpdateResourceInstanceRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public static class UpdateResourceInstanceRequestResourceInformation extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateResourceInstanceRequestResourceInformation build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceInstanceRequestResourceInformation self = new UpdateResourceInstanceRequestResourceInformation();
            return TeaModel.build(map, self);
        }

        public UpdateResourceInstanceRequestResourceInformation setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateResourceInstanceRequestResourceInformation setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
