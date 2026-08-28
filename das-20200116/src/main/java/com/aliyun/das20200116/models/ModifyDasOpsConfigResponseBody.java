// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyDasOpsConfigResponseBody extends TeaModel {
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
    public ModifyDasOpsConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
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
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifyDasOpsConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDasOpsConfigResponseBody self = new ModifyDasOpsConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDasOpsConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyDasOpsConfigResponseBody setData(ModifyDasOpsConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDasOpsConfigResponseBodyData getData() {
        return this.data;
    }

    public ModifyDasOpsConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyDasOpsConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDasOpsConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ModifyDasOpsConfigResponseBodyData extends TeaModel {
        /**
         * <p>The payment method.</p>
         * 
         * <strong>example:</strong>
         * <p>prepay</p>
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
         * <p>true</p>
         */
        @NameInMap("EcoEnable")
        public Boolean ecoEnable;

        /**
         * <p>Indicates whether the Alibaba Cloud Managed Services feature is enabled (including DAS Economy Edition).</p>
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
         * <p>Indicates whether Alibaba Cloud Managed Services is enabled.</p>
         */
        @NameInMap("OpsEnable")
        public Boolean opsEnable;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>285412912420536</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: Pending scheduling.</li>
         * <li><strong>RUNNING</strong>: Running.</li>
         * <li><strong>FAILED</strong>: Failed.</li>
         * <li><strong>CANCELED</strong>: Canceled.</li>
         * <li><strong>COMPLETED</strong>: Completed.</li>
         * </ul>
         * <blockquote>
         * <p>When the task is in the <strong>COMPLETED</strong> state, you can view the task result.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        public static ModifyDasOpsConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDasOpsConfigResponseBodyData self = new ModifyDasOpsConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDasOpsConfigResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ModifyDasOpsConfigResponseBodyData setCommodityInstanceId(String commodityInstanceId) {
            this.commodityInstanceId = commodityInstanceId;
            return this;
        }
        public String getCommodityInstanceId() {
            return this.commodityInstanceId;
        }

        public ModifyDasOpsConfigResponseBodyData setEcoEnable(Boolean ecoEnable) {
            this.ecoEnable = ecoEnable;
            return this;
        }
        public Boolean getEcoEnable() {
            return this.ecoEnable;
        }

        public ModifyDasOpsConfigResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyDasOpsConfigResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ModifyDasOpsConfigResponseBodyData setOpsEnable(Boolean opsEnable) {
            this.opsEnable = opsEnable;
            return this;
        }
        public Boolean getOpsEnable() {
            return this.opsEnable;
        }

        public ModifyDasOpsConfigResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ModifyDasOpsConfigResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ModifyDasOpsConfigResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
