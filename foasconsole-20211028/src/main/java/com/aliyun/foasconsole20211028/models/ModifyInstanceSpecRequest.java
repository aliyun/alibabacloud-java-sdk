// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether the workspace has zone-disaster recovery resources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ha")
    public Boolean ha;

    /**
     * <p>The zone-disaster recovery resource specifications.</p>
     */
    @NameInMap("HaResourceSpec")
    public ModifyInstanceSpecRequestHaResourceSpec haResourceSpec;

    /**
     * <p>The vSwitch group in the secondary zone for zone-disaster recovery.</p>
     */
    @NameInMap("HaVSwitchIds")
    public java.util.List<String> haVSwitchIds;

    /**
     * <p>The order instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-cn-wwo36qj4g06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource specifications.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSpec")
    public ModifyInstanceSpecRequestResourceSpec resourceSpec;

    @NameInMap("UsePromotionCode")
    public Boolean usePromotionCode;

    public static ModifyInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecRequest self = new ModifyInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public ModifyInstanceSpecRequest setHaResourceSpec(ModifyInstanceSpecRequestHaResourceSpec haResourceSpec) {
        this.haResourceSpec = haResourceSpec;
        return this;
    }
    public ModifyInstanceSpecRequestHaResourceSpec getHaResourceSpec() {
        return this.haResourceSpec;
    }

    public ModifyInstanceSpecRequest setHaVSwitchIds(java.util.List<String> haVSwitchIds) {
        this.haVSwitchIds = haVSwitchIds;
        return this;
    }
    public java.util.List<String> getHaVSwitchIds() {
        return this.haVSwitchIds;
    }

    public ModifyInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceSpecRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public ModifyInstanceSpecRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyInstanceSpecRequest setResourceSpec(ModifyInstanceSpecRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public ModifyInstanceSpecRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public ModifyInstanceSpecRequest setUsePromotionCode(Boolean usePromotionCode) {
        this.usePromotionCode = usePromotionCode;
        return this;
    }
    public Boolean getUsePromotionCode() {
        return this.usePromotionCode;
    }

    public static class ModifyInstanceSpecRequestHaResourceSpec extends TeaModel {
        /**
         * <p>The number of CPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The memory size.</p>
         * <blockquote>
         * <p>The memory size must be 4 times the number of CPUs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ModifyInstanceSpecRequestHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecRequestHaResourceSpec self = new ModifyInstanceSpecRequestHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecRequestHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyInstanceSpecRequestHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class ModifyInstanceSpecRequestResourceSpec extends TeaModel {
        /**
         * <p>The number of CPUs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The memory size.</p>
         * <blockquote>
         * <p>The memory size must be 4 times the number of CPUs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ModifyInstanceSpecRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecRequestResourceSpec self = new ModifyInstanceSpecRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyInstanceSpecRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

}
