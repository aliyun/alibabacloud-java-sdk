// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7***B-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result</p>
     */
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
         * <p>Verification result code.</p>
         * <ul>
         * <li>1: Verification consistent</li>
         * <li>2: Verification inconsistent</li>
         * <li>3: Not found</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Operating period: start and end time of operations.</p>
         * <ul>
         * <li>Format: yyyy-MM-dd/yyyy-MM-dd.</li>
         * <li>Example: 2018-09-25/9999-09-09.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2018-09-25/9999-09-09</p>
         */
        @NameInMap("OpenTime")
        public String openTime;

        /**
         * <p>ReasonCode explanation:</p>
         * <ul>
         * <li><p>100: Verification consistent</p>
         * </li>
         * <li><p>201: Inconsistent between person and enterprise</p>
         * </li>
         * <li><p>202: Inconsistent in two elements of the enterprise</p>
         * </li>
         * <li><p>301: No enterprise found, unable to verify</p>
         * </li>
         * <li><p>302: Legal representative does not exist in the database</p>
         * <blockquote>
         * <p>Warning: This field will be discontinued on June 15, 2023. Existing customers are not affected.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>Details of inconsistencies, multiple inconsistencies will be separated by commas.</p>
         * <ul>
         * <li>LegalPersonNameFlag: Inconsistent legal representative name</li>
         * <li>LegalPersonCertNoFlag: Inconsistent legal representative ID number</li>
         * <li>EntNameFlag: Inconsistent enterprise name</li>
         * <li>LicenseNoFlag: Inconsistent business license number</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LegalPersonNameFlag,LegalPersonCertNoFlag</p>
         */
        @NameInMap("ReasonDetail")
        public String reasonDetail;

        /**
         * <p>Enterprise operating status.</p>
         * <ul>
         * <li>1: In operation (open)</li>
         * <li>2: Relocated</li>
         * <li>3: Deregistered</li>
         * <li>4: Revoked</li>
         * <li>5: Canceled</li>
         * <li>6: Suspended</li>
         * <li>0: Other</li>
         * </ul>
         * 
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
