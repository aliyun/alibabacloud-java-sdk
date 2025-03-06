// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyNamespaceSpecV2Request extends TeaModel {
    @NameInMap("ElasticResourceSpec")
    public ModifyNamespaceSpecV2RequestElasticResourceSpec elasticResourceSpec;

    @NameInMap("GuaranteedResourceSpec")
    public ModifyNamespaceSpecV2RequestGuaranteedResourceSpec guaranteedResourceSpec;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Ha")
    public Boolean ha;

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
     * <p>di-593439443804417</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    public static ModifyNamespaceSpecV2Request build(java.util.Map<String, ?> map) throws Exception {
        ModifyNamespaceSpecV2Request self = new ModifyNamespaceSpecV2Request();
        return TeaModel.build(map, self);
    }

    public ModifyNamespaceSpecV2Request setElasticResourceSpec(ModifyNamespaceSpecV2RequestElasticResourceSpec elasticResourceSpec) {
        this.elasticResourceSpec = elasticResourceSpec;
        return this;
    }
    public ModifyNamespaceSpecV2RequestElasticResourceSpec getElasticResourceSpec() {
        return this.elasticResourceSpec;
    }

    public ModifyNamespaceSpecV2Request setGuaranteedResourceSpec(ModifyNamespaceSpecV2RequestGuaranteedResourceSpec guaranteedResourceSpec) {
        this.guaranteedResourceSpec = guaranteedResourceSpec;
        return this;
    }
    public ModifyNamespaceSpecV2RequestGuaranteedResourceSpec getGuaranteedResourceSpec() {
        return this.guaranteedResourceSpec;
    }

    public ModifyNamespaceSpecV2Request setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public ModifyNamespaceSpecV2Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyNamespaceSpecV2Request setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyNamespaceSpecV2Request setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public static class ModifyNamespaceSpecV2RequestElasticResourceSpec extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>52</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ModifyNamespaceSpecV2RequestElasticResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyNamespaceSpecV2RequestElasticResourceSpec self = new ModifyNamespaceSpecV2RequestElasticResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyNamespaceSpecV2RequestElasticResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyNamespaceSpecV2RequestElasticResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class ModifyNamespaceSpecV2RequestGuaranteedResourceSpec extends TeaModel {
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

        public static ModifyNamespaceSpecV2RequestGuaranteedResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyNamespaceSpecV2RequestGuaranteedResourceSpec self = new ModifyNamespaceSpecV2RequestGuaranteedResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyNamespaceSpecV2RequestGuaranteedResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyNamespaceSpecV2RequestGuaranteedResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

}
