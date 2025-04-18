// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyManagedInstanceResponseBody extends TeaModel {
    /**
     * <p>The name of the managed instance.</p>
     */
    @NameInMap("Instance")
    public ModifyManagedInstanceResponseBodyInstance instance;

    /**
     * <p>Details of the managed instance.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyManagedInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyManagedInstanceResponseBody self = new ModifyManagedInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyManagedInstanceResponseBody setInstance(ModifyManagedInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public ModifyManagedInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public ModifyManagedInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyManagedInstanceResponseBodyInstance extends TeaModel {
        /**
         * <p>The managed instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mi-hz01nmcf****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the managed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testInstanceName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static ModifyManagedInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyManagedInstanceResponseBodyInstance self = new ModifyManagedInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public ModifyManagedInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyManagedInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
