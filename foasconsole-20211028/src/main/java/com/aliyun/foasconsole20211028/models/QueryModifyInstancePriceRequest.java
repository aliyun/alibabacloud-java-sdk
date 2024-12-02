// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryModifyInstancePriceRequest extends TeaModel {
    @NameInMap("Ha")
    public Boolean ha;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaResourceSpec")
    public QueryModifyInstancePriceRequestHaResourceSpec haResourceSpec;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaVSwitchIds")
    public java.util.List<String> haVSwitchIds;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaZoneId")
    public String haZoneId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-cn-wwo36qj4g06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PromotionCode")
    public String promotionCode;

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
    public QueryModifyInstancePriceRequestResourceSpec resourceSpec;

    @NameInMap("UsePromotionCode")
    public Boolean usePromotionCode;

    public static QueryModifyInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyInstancePriceRequest self = new QueryModifyInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryModifyInstancePriceRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public QueryModifyInstancePriceRequest setHaResourceSpec(QueryModifyInstancePriceRequestHaResourceSpec haResourceSpec) {
        this.haResourceSpec = haResourceSpec;
        return this;
    }
    public QueryModifyInstancePriceRequestHaResourceSpec getHaResourceSpec() {
        return this.haResourceSpec;
    }

    public QueryModifyInstancePriceRequest setHaVSwitchIds(java.util.List<String> haVSwitchIds) {
        this.haVSwitchIds = haVSwitchIds;
        return this;
    }
    public java.util.List<String> getHaVSwitchIds() {
        return this.haVSwitchIds;
    }

    public QueryModifyInstancePriceRequest setHaZoneId(String haZoneId) {
        this.haZoneId = haZoneId;
        return this;
    }
    public String getHaZoneId() {
        return this.haZoneId;
    }

    public QueryModifyInstancePriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryModifyInstancePriceRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public QueryModifyInstancePriceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryModifyInstancePriceRequest setResourceSpec(QueryModifyInstancePriceRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public QueryModifyInstancePriceRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public QueryModifyInstancePriceRequest setUsePromotionCode(Boolean usePromotionCode) {
        this.usePromotionCode = usePromotionCode;
        return this;
    }
    public Boolean getUsePromotionCode() {
        return this.usePromotionCode;
    }

    public static class QueryModifyInstancePriceRequestHaResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static QueryModifyInstancePriceRequestHaResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyInstancePriceRequestHaResourceSpec self = new QueryModifyInstancePriceRequestHaResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryModifyInstancePriceRequestHaResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryModifyInstancePriceRequestHaResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class QueryModifyInstancePriceRequestResourceSpec extends TeaModel {
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

        public static QueryModifyInstancePriceRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyInstancePriceRequestResourceSpec self = new QueryModifyInstancePriceRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public QueryModifyInstancePriceRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryModifyInstancePriceRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

}
