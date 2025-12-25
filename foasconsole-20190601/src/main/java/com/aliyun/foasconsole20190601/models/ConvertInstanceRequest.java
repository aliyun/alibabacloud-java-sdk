// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ConvertInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
         * <p>sc_flinkserverlesspost_public_cn-*******</p>
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
        public java.util.List<ConvertInstanceRequestConvertPostpayInstanceRequestNamespaceResourceSpecs> namespaceResourceSpecs;

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
