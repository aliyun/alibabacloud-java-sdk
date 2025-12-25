// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModifyPrepayInstanceSpecRequest")
    public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest;

    public static ModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecRequest self = new ModifyPrepayInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecRequest setModifyPrepayInstanceSpecRequest(ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest) {
        this.modifyPrepayInstanceSpecRequest = modifyPrepayInstanceSpecRequest;
        return this;
    }
    public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest getModifyPrepayInstanceSpecRequest() {
        return this.modifyPrepayInstanceSpecRequest;
    }

    public static class ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestHaResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestHaResourceSpec self = new ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec self = new ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest extends TeaModel {
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
        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestHaResourceSpec haResourceSpec;

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
         * <p>sc_flinkserverlesspost_public_cn-0ju2bj2i104</p>
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
        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec resourceSpec;

        public static ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest self = new ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setHa(Boolean ha) {
            this.ha = ha;
            return this;
        }
        public Boolean getHa() {
            return this.ha;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setHaResourceSpec(ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestHaResourceSpec haResourceSpec) {
            this.haResourceSpec = haResourceSpec;
            return this;
        }
        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestHaResourceSpec getHaResourceSpec() {
            return this.haResourceSpec;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setHaVSwitchIds(java.util.List<String> haVSwitchIds) {
            this.haVSwitchIds = haVSwitchIds;
            return this;
        }
        public java.util.List<String> getHaVSwitchIds() {
            return this.haVSwitchIds;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setHaZoneId(String haZoneId) {
            this.haZoneId = haZoneId;
            return this;
        }
        public String getHaZoneId() {
            return this.haZoneId;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setResourceSpec(ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

}
