// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertInstanceRequest extends TeaModel {
    // 订购周期数量
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    // 是否自动续费
    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    // 项目空间资源规格。
    @NameInMap("NamespaceResourceSpecs")
    public java.util.List<ConvertInstanceRequestNamespaceResourceSpecs> namespaceResourceSpecs;

    // 订购周期
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
        // cpu数量。
        @NameInMap("Cpu")
        public Integer cpu;

        // 内存大小。
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
        // namespace名称，
        @NameInMap("Namespace")
        public String namespace;

        // 资源规格。
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
