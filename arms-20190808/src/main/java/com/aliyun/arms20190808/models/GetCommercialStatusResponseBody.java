// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetCommercialStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserAndCommodityStatus")
    public GetCommercialStatusResponseBodyUserAndCommodityStatus userAndCommodityStatus;

    public static GetCommercialStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommercialStatusResponseBody self = new GetCommercialStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommercialStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCommercialStatusResponseBody setUserAndCommodityStatus(GetCommercialStatusResponseBodyUserAndCommodityStatus userAndCommodityStatus) {
        this.userAndCommodityStatus = userAndCommodityStatus;
        return this;
    }
    public GetCommercialStatusResponseBodyUserAndCommodityStatus getUserAndCommodityStatus() {
        return this.userAndCommodityStatus;
    }

    public static class GetCommercialStatusResponseBodyUserAndCommodityStatus extends TeaModel {
        @NameInMap("Basic")
        public Boolean basic;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        @NameInMap("FreeDays")
        public Long freeDays;

        @NameInMap("Lable")
        public String lable;

        @NameInMap("Status")
        public String status;

        public static GetCommercialStatusResponseBodyUserAndCommodityStatus build(java.util.Map<String, ?> map) throws Exception {
            GetCommercialStatusResponseBodyUserAndCommodityStatus self = new GetCommercialStatusResponseBodyUserAndCommodityStatus();
            return TeaModel.build(map, self);
        }

        public GetCommercialStatusResponseBodyUserAndCommodityStatus setBasic(Boolean basic) {
            this.basic = basic;
            return this;
        }
        public Boolean getBasic() {
            return this.basic;
        }

        public GetCommercialStatusResponseBodyUserAndCommodityStatus setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetCommercialStatusResponseBodyUserAndCommodityStatus setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetCommercialStatusResponseBodyUserAndCommodityStatus setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public GetCommercialStatusResponseBodyUserAndCommodityStatus setFreeDays(Long freeDays) {
            this.freeDays = freeDays;
            return this;
        }
        public Long getFreeDays() {
            return this.freeDays;
        }

        public GetCommercialStatusResponseBodyUserAndCommodityStatus setLable(String lable) {
            this.lable = lable;
            return this;
        }
        public String getLable() {
            return this.lable;
        }

        public GetCommercialStatusResponseBodyUserAndCommodityStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
