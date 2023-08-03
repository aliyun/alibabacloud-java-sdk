// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryConvertInstancePriceRequest extends TeaModel {
    @NameInMap("ConvertPostpayInstanceRequest")
    public QueryConvertInstancePriceRequestConvertPostpayInstanceRequest convertPostpayInstanceRequest;

    public static QueryConvertInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConvertInstancePriceRequest self = new QueryConvertInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryConvertInstancePriceRequest setConvertPostpayInstanceRequest(QueryConvertInstancePriceRequestConvertPostpayInstanceRequest convertPostpayInstanceRequest) {
        this.convertPostpayInstanceRequest = convertPostpayInstanceRequest;
        return this;
    }
    public QueryConvertInstancePriceRequestConvertPostpayInstanceRequest getConvertPostpayInstanceRequest() {
        return this.convertPostpayInstanceRequest;
    }

    public static class QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec self = new QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs extends TeaModel {
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ResourceSpec")
        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec resourceSpec;

        public static QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs self = new QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs();
            return TeaModel.build(map, self);
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs setResourceSpec(QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecsResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

    public static class QueryConvertInstancePriceRequestConvertPostpayInstanceRequest extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsAutoRenew")
        public Boolean isAutoRenew;

        @NameInMap("NamespaceResourceSpecs")
        public java.util.List<QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs> namespaceResourceSpecs;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("Region")
        public String region;

        public static QueryConvertInstancePriceRequestConvertPostpayInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertInstancePriceRequestConvertPostpayInstanceRequest self = new QueryConvertInstancePriceRequestConvertPostpayInstanceRequest();
            return TeaModel.build(map, self);
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequest setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequest setIsAutoRenew(Boolean isAutoRenew) {
            this.isAutoRenew = isAutoRenew;
            return this;
        }
        public Boolean getIsAutoRenew() {
            return this.isAutoRenew;
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequest setNamespaceResourceSpecs(java.util.List<QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs> namespaceResourceSpecs) {
            this.namespaceResourceSpecs = namespaceResourceSpecs;
            return this;
        }
        public java.util.List<QueryConvertInstancePriceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs> getNamespaceResourceSpecs() {
            return this.namespaceResourceSpecs;
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequest setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public QueryConvertInstancePriceRequestConvertPostpayInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
