// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyElasticResourceSpecRequest extends TeaModel {
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
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSpec")
    public ModifyElasticResourceSpecRequestResourceSpec resourceSpec;

    public static ModifyElasticResourceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticResourceSpecRequest self = new ModifyElasticResourceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticResourceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyElasticResourceSpecRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyElasticResourceSpecRequest setResourceSpec(ModifyElasticResourceSpecRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public ModifyElasticResourceSpecRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public static class ModifyElasticResourceSpecRequestResourceSpec extends TeaModel {
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

        public static ModifyElasticResourceSpecRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyElasticResourceSpecRequestResourceSpec self = new ModifyElasticResourceSpecRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyElasticResourceSpecRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyElasticResourceSpecRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

}
