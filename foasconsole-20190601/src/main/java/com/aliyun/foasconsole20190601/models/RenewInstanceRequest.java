// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class RenewInstanceRequest extends TeaModel {
    @NameInMap("RenewInstanceRequest")
    public RenewInstanceRequestRenewInstanceRequest renewInstanceRequest;

    public static RenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceRequest self = new RenewInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewInstanceRequest setRenewInstanceRequest(RenewInstanceRequestRenewInstanceRequest renewInstanceRequest) {
        this.renewInstanceRequest = renewInstanceRequest;
        return this;
    }
    public RenewInstanceRequestRenewInstanceRequest getRenewInstanceRequest() {
        return this.renewInstanceRequest;
    }

    public static class RenewInstanceRequestRenewInstanceRequest extends TeaModel {
        // 地域id
        @NameInMap("Region")
        public String region;

        // 实例id
        @NameInMap("InstanceId")
        public String instanceId;

        // 订购周期数量
        @NameInMap("Duration")
        public Integer duration;

        // 订购周期
        @NameInMap("PricingCycle")
        public String pricingCycle;

        public static RenewInstanceRequestRenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            RenewInstanceRequestRenewInstanceRequest self = new RenewInstanceRequestRenewInstanceRequest();
            return TeaModel.build(map, self);
        }

        public RenewInstanceRequestRenewInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public RenewInstanceRequestRenewInstanceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenewInstanceRequestRenewInstanceRequest setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public RenewInstanceRequestRenewInstanceRequest setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

    }

}
