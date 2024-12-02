// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecRequest extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Ha")
    public Boolean ha;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaResourceSpec")
    public ModifyPrepayInstanceSpecRequestHaResourceSpec haResourceSpec;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaVSwitchIds")
    public java.util.List<String> haVSwitchIds;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaZoneId")
    public String haZoneId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-cn-wwo36qj4g06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSpec")
    public ModifyPrepayInstanceSpecRequestResourceSpec resourceSpec;

    public static ModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecRequest self = new ModifyPrepayInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public ModifyPrepayInstanceSpecRequest setHaResourceSpec(ModifyPrepayInstanceSpecRequestHaResourceSpec haResourceSpec) {
        this.haResourceSpec = haResourceSpec;
        return this;
    }
    public ModifyPrepayInstanceSpecRequestHaResourceSpec getHaResourceSpec() {
        return this.haResourceSpec;
    }

    public ModifyPrepayInstanceSpecRequest setHaVSwitchIds(java.util.List<String> haVSwitchIds) {
        this.haVSwitchIds = haVSwitchIds;
        return this;
    }
    public java.util.List<String> getHaVSwitchIds() {
        return this.haVSwitchIds;
    }

    public ModifyPrepayInstanceSpecRequest setHaZoneId(String haZoneId) {
        this.haZoneId = haZoneId;
        return this;
    }
    public String getHaZoneId() {
        return this.haZoneId;
    }

    public ModifyPrepayInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPrepayInstanceSpecRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyPrepayInstanceSpecRequest setResourceSpec(ModifyPrepayInstanceSpecRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public ModifyPrepayInstanceSpecRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public static class ModifyPrepayInstanceSpecRequestHaResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ModifyPrepayInstanceSpecRequestHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestHaResourceSpec self = new ModifyPrepayInstanceSpecRequestHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayInstanceSpecRequestHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyPrepayInstanceSpecRequestHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class ModifyPrepayInstanceSpecRequestResourceSpec extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ModifyPrepayInstanceSpecRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestResourceSpec self = new ModifyPrepayInstanceSpecRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayInstanceSpecRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyPrepayInstanceSpecRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

}
