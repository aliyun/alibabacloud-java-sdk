// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryConvertInstancePriceRequest extends TeaModel {
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
    public java.util.List<QueryConvertInstancePriceRequestNamespaceResourceSpecs> namespaceResourceSpecs;

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

    public static QueryConvertInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConvertInstancePriceRequest self = new QueryConvertInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryConvertInstancePriceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public QueryConvertInstancePriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryConvertInstancePriceRequest setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public QueryConvertInstancePriceRequest setNamespaceResourceSpecs(java.util.List<QueryConvertInstancePriceRequestNamespaceResourceSpecs> namespaceResourceSpecs) {
        this.namespaceResourceSpecs = namespaceResourceSpecs;
        return this;
    }
    public java.util.List<QueryConvertInstancePriceRequestNamespaceResourceSpecs> getNamespaceResourceSpecs() {
        return this.namespaceResourceSpecs;
    }

    public QueryConvertInstancePriceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public QueryConvertInstancePriceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public static class QueryConvertInstancePriceRequestNamespaceResourceSpecsResourceSpec extends TeaModel {
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
         * <p>24</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static QueryConvertInstancePriceRequestNamespaceResourceSpecsResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertInstancePriceRequestNamespaceResourceSpecsResourceSpec self = new QueryConvertInstancePriceRequestNamespaceResourceSpecsResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryConvertInstancePriceRequestNamespaceResourceSpecsResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryConvertInstancePriceRequestNamespaceResourceSpecsResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class QueryConvertInstancePriceRequestNamespaceResourceSpecs extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lm-test-default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceSpec")
        public QueryConvertInstancePriceRequestNamespaceResourceSpecsResourceSpec resourceSpec;

        public static QueryConvertInstancePriceRequestNamespaceResourceSpecs build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertInstancePriceRequestNamespaceResourceSpecs self = new QueryConvertInstancePriceRequestNamespaceResourceSpecs();
            return TeaModel.build(map, self);
        }

        public QueryConvertInstancePriceRequestNamespaceResourceSpecs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryConvertInstancePriceRequestNamespaceResourceSpecs setResourceSpec(QueryConvertInstancePriceRequestNamespaceResourceSpecsResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public QueryConvertInstancePriceRequestNamespaceResourceSpecsResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

}
