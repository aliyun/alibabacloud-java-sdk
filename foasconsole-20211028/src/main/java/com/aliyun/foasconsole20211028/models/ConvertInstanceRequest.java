// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertInstanceRequest extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    @NameInMap("NamespaceResourceSpecs")
    public java.util.List<ConvertInstanceRequestNamespaceResourceSpecs> namespaceResourceSpecs;

    @NameInMap("PricingCycle")
    public String pricingCycle;

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
        @NameInMap("Cpu")
        public Integer cpu;

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
        @NameInMap("Namespace")
        public String namespace;

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
