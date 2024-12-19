// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyRefundResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RefundApplicationData")
    public ModifyRefundResponseBodyRefundApplicationData refundApplicationData;

    /**
     * <strong>example:</strong>
     * <p>A7BE4356-7F92-533E-A31B-****2D67</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefundResponseBody self = new ModifyRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRefundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyRefundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyRefundResponseBody setRefundApplicationData(ModifyRefundResponseBodyRefundApplicationData refundApplicationData) {
        this.refundApplicationData = refundApplicationData;
        return this;
    }
    public ModifyRefundResponseBodyRefundApplicationData getRefundApplicationData() {
        return this.refundApplicationData;
    }

    public ModifyRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyRefundResponseBodyRefundApplicationData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DisputeType")
        public Integer disputeType;

        /**
         * <strong>example:</strong>
         * <p>37******31</p>
         */
        @NameInMap("SubLmOrderId")
        public String subLmOrderId;

        public static ModifyRefundResponseBodyRefundApplicationData build(java.util.Map<String, ?> map) throws Exception {
            ModifyRefundResponseBodyRefundApplicationData self = new ModifyRefundResponseBodyRefundApplicationData();
            return TeaModel.build(map, self);
        }

        public ModifyRefundResponseBodyRefundApplicationData setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public ModifyRefundResponseBodyRefundApplicationData setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public ModifyRefundResponseBodyRefundApplicationData setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

    }

}
