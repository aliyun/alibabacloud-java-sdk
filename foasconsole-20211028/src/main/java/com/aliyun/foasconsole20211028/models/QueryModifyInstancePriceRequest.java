// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryModifyInstancePriceRequest extends TeaModel {
    /**
     * <p>Specifies whether to select zone-disaster recovery resources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ha")
    public Boolean ha;

    /**
     * <p>The zone-disaster recovery resource description.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaResourceSpec")
    public QueryModifyInstancePriceRequestHaResourceSpec haResourceSpec;

    /**
     * <p>The vSwitch group for the zone-disaster recovery secondary zone.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HaVSwitchIds")
    public java.util.List<String> haVSwitchIds;

    /**
     * <p>The order instance ID.</p>
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
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource specifications.</p>
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
        /**
         * <p>The number of CPUs for zone-disaster recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The memory size for zone-disaster recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
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
         * <p>The number of CPUs after the specification change.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The memory size after the specification change.</p>
         * <blockquote>
         * <p>The memory size must be 4 times the number of CPUs.</p>
         * </blockquote>
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
