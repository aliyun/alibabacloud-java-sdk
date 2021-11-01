// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ConvertInstanceRequest extends TeaModel {
    @NameInMap("ConvertPostpayInstanceRequest")
    public ConvertInstanceRequestConvertPostpayInstanceRequest convertPostpayInstanceRequest;

    public static ConvertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceRequest self = new ConvertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceRequest setConvertPostpayInstanceRequest(ConvertInstanceRequestConvertPostpayInstanceRequest convertPostpayInstanceRequest) {
        this.convertPostpayInstanceRequest = convertPostpayInstanceRequest;
        return this;
    }
    public ConvertInstanceRequestConvertPostpayInstanceRequest getConvertPostpayInstanceRequest() {
        return this.convertPostpayInstanceRequest;
    }

    public static class ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec extends TeaModel {
        // cpu数量。
        @NameInMap("Cpu")
        public Integer cpu;

        // 内存大小。
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec self = new ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec();
            return TeaModel.build(map, self);
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs extends TeaModel {
        // namespace名称，
        @NameInMap("Namespace")
        public String namespace;

        // 资源规格。
        @NameInMap("ResourceSpec")
        public ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec resourceSpec;

        public static ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs build(java.util.Map<String, ?> map) throws Exception {
            ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs self = new ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs();
            return TeaModel.build(map, self);
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs setResourceSpec(ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

    public static class ConvertInstanceRequestConvertPostpayInstanceRequest extends TeaModel {
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
        public java.util.List<ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs> namespaceResourceSpecs;

        // 订购周期
        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("Region")
        public String region;

        public static ConvertInstanceRequestConvertPostpayInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            ConvertInstanceRequestConvertPostpayInstanceRequest self = new ConvertInstanceRequestConvertPostpayInstanceRequest();
            return TeaModel.build(map, self);
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequest setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequest setIsAutoRenew(Boolean isAutoRenew) {
            this.isAutoRenew = isAutoRenew;
            return this;
        }
        public Boolean getIsAutoRenew() {
            return this.isAutoRenew;
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequest setNamespaceResourceSpecs(java.util.List<ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs> namespaceResourceSpecs) {
            this.namespaceResourceSpecs = namespaceResourceSpecs;
            return this;
        }
        public java.util.List<ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs> getNamespaceResourceSpecs() {
            return this.namespaceResourceSpecs;
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequest setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public ConvertInstanceRequestConvertPostpayInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
