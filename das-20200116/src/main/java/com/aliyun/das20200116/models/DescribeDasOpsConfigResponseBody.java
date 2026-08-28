// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeDasOpsConfigResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>SqlLogConfig</p>
     */
    @NameInMap("Data")
    public DescribeDasOpsConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D00DB161-FEF6-5428-B37A-8D29A4C2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeDasOpsConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDasOpsConfigResponseBody self = new DescribeDasOpsConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDasOpsConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDasOpsConfigResponseBody setData(DescribeDasOpsConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDasOpsConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeDasOpsConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDasOpsConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDasOpsConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeDasOpsConfigResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Auto-renewal is enabled.</li>
         * <li><strong>false</strong> (default): Auto-renewal is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The payment method.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://prodpopscanGGfYbZif.302prod.xaliyun.com">http://prodpopscanGGfYbZif.302prod.xaliyun.com</a></p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The Alibaba Cloud Managed Services instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2zelo5v5u0678jx04</p>
         */
        @NameInMap("CommodityInstanceId")
        public String commodityInstanceId;

        /**
         * <p>Indicates whether DAS Economy Edition is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EcoEnable")
        public Boolean ecoEnable;

        /**
         * <p>Indicates whether the Alibaba Cloud Managed Services is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The end time. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Indicates whether the Alibaba Cloud Managed Services is enabled.</p>
         */
        @NameInMap("OpsEnable")
        public Boolean opsEnable;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>275772887390786</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The start time. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeDasOpsConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDasOpsConfigResponseBodyData self = new DescribeDasOpsConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDasOpsConfigResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeDasOpsConfigResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDasOpsConfigResponseBodyData setCommodityInstanceId(String commodityInstanceId) {
            this.commodityInstanceId = commodityInstanceId;
            return this;
        }
        public String getCommodityInstanceId() {
            return this.commodityInstanceId;
        }

        public DescribeDasOpsConfigResponseBodyData setEcoEnable(Boolean ecoEnable) {
            this.ecoEnable = ecoEnable;
            return this;
        }
        public Boolean getEcoEnable() {
            return this.ecoEnable;
        }

        public DescribeDasOpsConfigResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeDasOpsConfigResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDasOpsConfigResponseBodyData setOpsEnable(Boolean opsEnable) {
            this.opsEnable = opsEnable;
            return this;
        }
        public Boolean getOpsEnable() {
            return this.opsEnable;
        }

        public DescribeDasOpsConfigResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public DescribeDasOpsConfigResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
