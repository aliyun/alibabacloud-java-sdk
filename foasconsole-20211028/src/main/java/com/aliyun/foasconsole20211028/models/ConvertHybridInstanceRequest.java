// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertHybridInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sc_flinkserverless_public_cn-7e22ae5sess</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("Region")
    public String region;

    /**
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
