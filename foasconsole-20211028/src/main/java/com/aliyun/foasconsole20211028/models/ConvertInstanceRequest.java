// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

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
     * <p>true</p>
     */
    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NamespaceResourceSpecs")
    public java.util.List<ConvertInstanceRequestNamespaceResourceSpecs> namespaceResourceSpecs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    public static ConvertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceRequest self = new ConvertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ConvertInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConvertInstanceRequest setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public ConvertInstanceRequest setNamespaceResourceSpecs(java.util.List<ConvertInstanceRequestNamespaceResourceSpecs> namespaceResourceSpecs) {
        this.namespaceResourceSpecs = namespaceResourceSpecs;
        return this;
    }
    public java.util.List<ConvertInstanceRequestNamespaceResourceSpecs> getNamespaceResourceSpecs() {
        return this.namespaceResourceSpecs;
    }

    public ConvertInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public ConvertInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public static class ConvertInstanceRequestNamespaceResourceSpecsResourceSpec extends TeaModel {
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

        public static ConvertInstanceRequestNamespaceResourceSpecsResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ConvertInstanceRequestNamespaceResourceSpecsResourceSpec self = new ConvertInstanceRequestNamespaceResourceSpecsResourceSpec();
            return TeaModel.build(map, self);
        }

        public ConvertInstanceRequestNamespaceResourceSpecsResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ConvertInstanceRequestNamespaceResourceSpecsResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class ConvertInstanceRequestNamespaceResourceSpecs extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns-1</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceSpec")
        public ConvertInstanceRequestNamespaceResourceSpecsResourceSpec resourceSpec;

        public static ConvertInstanceRequestNamespaceResourceSpecs build(java.util.Map<String, ?> map) throws Exception {
            ConvertInstanceRequestNamespaceResourceSpecs self = new ConvertInstanceRequestNamespaceResourceSpecs();
            return TeaModel.build(map, self);
        }

        public ConvertInstanceRequestNamespaceResourceSpecs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ConvertInstanceRequestNamespaceResourceSpecs setResourceSpec(ConvertInstanceRequestNamespaceResourceSpecsResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public ConvertInstanceRequestNamespaceResourceSpecsResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

}
