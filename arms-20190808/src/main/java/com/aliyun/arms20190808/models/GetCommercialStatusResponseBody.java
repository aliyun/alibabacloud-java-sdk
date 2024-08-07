// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetCommercialStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49C82193-E991-5F6A-AF3E-1664D8D05CA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The commercialization status of the service.</p>
     */
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
        /**
         * <p>Indicates whether you are using the Basic Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Basic")
        public Boolean basic;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>Indicates whether the service is activated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("ExtraInfo")
        public java.util.Map<String, ?> extraInfo;

        /**
         * <p>The number of days during which the service is free of charge.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FreeDays")
        public Long freeDays;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>NEW</p>
         */
        @NameInMap("Lable")
        public String lable;

        /**
         * <p>The commercialization status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Normal: The service is activated.</li>
         * <li>Abnormal: An exception occurs during activation.</li>
         * <li>Free: The service is not activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
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
