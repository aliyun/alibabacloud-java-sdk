// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7***B-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public EntElementVerifyResponseBodyResult result;

    public static EntElementVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyResponseBody self = new EntElementVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EntElementVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EntElementVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EntElementVerifyResponseBody setResult(EntElementVerifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EntElementVerifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class EntElementVerifyResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("OpenTime")
        public String openTime;

        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("ReasonDetail")
        public String reasonDetail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        public static EntElementVerifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EntElementVerifyResponseBodyResult self = new EntElementVerifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EntElementVerifyResponseBodyResult setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public EntElementVerifyResponseBodyResult setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public EntElementVerifyResponseBodyResult setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public EntElementVerifyResponseBodyResult setReasonDetail(String reasonDetail) {
            this.reasonDetail = reasonDetail;
            return this;
        }
        public String getReasonDetail() {
            return this.reasonDetail;
        }

        public EntElementVerifyResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
