// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyManagedInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Instance")
    public ModifyManagedInstanceResponseBodyInstance instance;

    public static ModifyManagedInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyManagedInstanceResponseBody self = new ModifyManagedInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyManagedInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyManagedInstanceResponseBody setInstance(ModifyManagedInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public ModifyManagedInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public static class ModifyManagedInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifyManagedInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyManagedInstanceResponseBodyInstance self = new ModifyManagedInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public ModifyManagedInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ModifyManagedInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
