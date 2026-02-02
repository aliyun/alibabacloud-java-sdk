// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyPROResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public EntElementVerifyPROResponseBodyResult result;

    public static EntElementVerifyPROResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyPROResponseBody self = new EntElementVerifyPROResponseBody();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyPROResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EntElementVerifyPROResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EntElementVerifyPROResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EntElementVerifyPROResponseBody setResult(EntElementVerifyPROResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EntElementVerifyPROResponseBodyResult getResult() {
        return this.result;
    }

    public static class EntElementVerifyPROResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>2018-09-25/9999-09-09</p>
         */
        @NameInMap("OpenTime")
        public String openTime;

        /**
         * <strong>example:</strong>
         * <p>LegalPersonNameFlag,LegalPersonCertNoFlag</p>
         */
        @NameInMap("ReasonDetail")
        public String reasonDetail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        public static EntElementVerifyPROResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EntElementVerifyPROResponseBodyResult self = new EntElementVerifyPROResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EntElementVerifyPROResponseBodyResult setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public EntElementVerifyPROResponseBodyResult setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public EntElementVerifyPROResponseBodyResult setReasonDetail(String reasonDetail) {
            this.reasonDetail = reasonDetail;
            return this;
        }
        public String getReasonDetail() {
            return this.reasonDetail;
        }

        public EntElementVerifyPROResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
