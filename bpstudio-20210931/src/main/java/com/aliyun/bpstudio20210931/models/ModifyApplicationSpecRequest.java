// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ModifyApplicationSpecRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>02S7UU41WKJL7ERR</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("InstanceSpec")
    public java.util.List<ModifyApplicationSpecRequestInstanceSpec> instanceSpec;

    public static ModifyApplicationSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationSpecRequest self = new ModifyApplicationSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationSpecRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationSpecRequest setInstanceSpec(java.util.List<ModifyApplicationSpecRequestInstanceSpec> instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public java.util.List<ModifyApplicationSpecRequestInstanceSpec> getInstanceSpec() {
        return this.instanceSpec;
    }

    public static class ModifyApplicationSpecRequestInstanceSpec extends TeaModel {
        @NameInMap("Configuration")
        public java.util.Map<String, ?> configuration;

        /**
         * <strong>example:</strong>
         * <p>rm-2ze8f4ah378a*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifyApplicationSpecRequestInstanceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyApplicationSpecRequestInstanceSpec self = new ModifyApplicationSpecRequestInstanceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyApplicationSpecRequestInstanceSpec setConfiguration(java.util.Map<String, ?> configuration) {
            this.configuration = configuration;
            return this;
        }
        public java.util.Map<String, ?> getConfiguration() {
            return this.configuration;
        }

        public ModifyApplicationSpecRequestInstanceSpec setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
