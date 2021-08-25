// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class TransferResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("TokenConflicted")
    public Boolean tokenConflicted;

    @NameInMap("Data")
    public TransferResourceResponseBodyData data;

    public static TransferResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferResourceResponseBody self = new TransferResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransferResourceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public TransferResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TransferResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TransferResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TransferResourceResponseBody setTokenConflicted(Boolean tokenConflicted) {
        this.tokenConflicted = tokenConflicted;
        return this;
    }
    public Boolean getTokenConflicted() {
        return this.tokenConflicted;
    }

    public TransferResourceResponseBody setData(TransferResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TransferResourceResponseBodyData getData() {
        return this.data;
    }

    public static class TransferResourceResponseBodyData extends TeaModel {
        @NameInMap("RefundOrderId")
        public Long refundOrderId;

        @NameInMap("BuyOrderId")
        public Long buyOrderId;

        public static TransferResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TransferResourceResponseBodyData self = new TransferResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TransferResourceResponseBodyData setRefundOrderId(Long refundOrderId) {
            this.refundOrderId = refundOrderId;
            return this;
        }
        public Long getRefundOrderId() {
            return this.refundOrderId;
        }

        public TransferResourceResponseBodyData setBuyOrderId(Long buyOrderId) {
            this.buyOrderId = buyOrderId;
            return this;
        }
        public Long getBuyOrderId() {
            return this.buyOrderId;
        }

    }

}
