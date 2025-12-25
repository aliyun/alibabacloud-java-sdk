// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class RenewInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
         * <p>sc_flinkserverless_public_cn-7e22ae5****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

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

        public static RenewInstanceRequestRenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            RenewInstanceRequestRenewInstanceRequest self = new RenewInstanceRequestRenewInstanceRequest();
            return TeaModel.build(map, self);
        }

        public RenewInstanceRequestRenewInstanceRequest setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public RenewInstanceRequestRenewInstanceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenewInstanceRequestRenewInstanceRequest setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public RenewInstanceRequestRenewInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
