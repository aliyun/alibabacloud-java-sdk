// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyManagedInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Instance")
    @Validation(required = true)
    public ModifyManagedInstanceResponseInstance instance;

    public static ModifyManagedInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyManagedInstanceResponse self = new ModifyManagedInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyManagedInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyManagedInstanceResponse setInstance(ModifyManagedInstanceResponseInstance instance) {
        this.instance = instance;
        return this;
    }
    public ModifyManagedInstanceResponseInstance getInstance() {
        return this.instance;
    }

    public static class ModifyManagedInstanceResponseInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        public static ModifyManagedInstanceResponseInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyManagedInstanceResponseInstance self = new ModifyManagedInstanceResponseInstance();
            return TeaModel.build(map, self);
        }

        public ModifyManagedInstanceResponseInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyManagedInstanceResponseInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
