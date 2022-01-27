// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryRenewInstancePriceRequest extends TeaModel {
    @NameInMap("RenewInstanceRequest")
    public QueryRenewInstancePriceRequestRenewInstanceRequest renewInstanceRequest;

    public static QueryRenewInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewInstancePriceRequest self = new QueryRenewInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRenewInstancePriceRequest setRenewInstanceRequest(QueryRenewInstancePriceRequestRenewInstanceRequest renewInstanceRequest) {
        this.renewInstanceRequest = renewInstanceRequest;
        return this;
    }
    public QueryRenewInstancePriceRequestRenewInstanceRequest getRenewInstanceRequest() {
        return this.renewInstanceRequest;
    }

    public static class QueryRenewInstancePriceRequestRenewInstanceRequest extends TeaModel {
        // 订购周期数量
        @NameInMap("Duration")
        public Integer duration;

        // 实例id
        @NameInMap("InstanceId")
        public String instanceId;

        // 订购周期
        @NameInMap("PricingCycle")
        public String pricingCycle;

        // 地域id
        @NameInMap("Region")
        public String region;

        public static QueryRenewInstancePriceRequestRenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewInstancePriceRequestRenewInstanceRequest self = new QueryRenewInstancePriceRequestRenewInstanceRequest();
            return TeaModel.build(map, self);
        }

        public QueryRenewInstancePriceRequestRenewInstanceRequest setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QueryRenewInstancePriceRequestRenewInstanceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryRenewInstancePriceRequestRenewInstanceRequest setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public QueryRenewInstancePriceRequestRenewInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
