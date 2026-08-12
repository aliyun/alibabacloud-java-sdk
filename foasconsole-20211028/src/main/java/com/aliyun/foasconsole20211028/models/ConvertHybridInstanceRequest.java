// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertHybridInstanceRequest extends TeaModel {
    /**
     * <p>The order instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sc_flinkserverless_public_cn-7e22*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The maximum resource specifications available for the pay-as-you-go portion of hybrid billing.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSpec")
    public ConvertHybridInstanceRequestResourceSpec resourceSpec;

    public static ConvertHybridInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertHybridInstanceRequest self = new ConvertHybridInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConvertHybridInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConvertHybridInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ConvertHybridInstanceRequest setResourceSpec(ConvertHybridInstanceRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public ConvertHybridInstanceRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public static class ConvertHybridInstanceRequestResourceSpec extends TeaModel {
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
         * <p>The memory size. Unit: GB.</p>
         * <blockquote>
         * <p>The memory size must be 4 times the number of CPUs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40GB</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ConvertHybridInstanceRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ConvertHybridInstanceRequestResourceSpec self = new ConvertHybridInstanceRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public ConvertHybridInstanceRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ConvertHybridInstanceRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

}
