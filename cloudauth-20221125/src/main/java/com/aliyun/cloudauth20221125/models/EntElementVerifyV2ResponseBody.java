// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyV2ResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
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
    public EntElementVerifyV2ResponseBodyResult result;

    public static EntElementVerifyV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyV2ResponseBody self = new EntElementVerifyV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EntElementVerifyV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EntElementVerifyV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EntElementVerifyV2ResponseBody setResult(EntElementVerifyV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EntElementVerifyV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class EntElementVerifyV2ResponseBodyResult extends TeaModel {
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
         * <p>Business term: start and end time of operations.</p>
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
         * <p>Details of inconsistencies, multiple inconsistencies will be separated by commas.</p>
         * <ul>
         * <li>LegalPersonNameFlag: Legal person\&quot;s name does not match</li>
         * <li>LegalPersonCertNoFlag: Legal person\&quot;s ID number does not match</li>
         * <li>EntNameFlag: Enterprise name does not match</li>
         * <li>LicenseNoFlag: Business license number does not match</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LegalPersonNameFlag,LegalPersonCertNoFlag</p>
         */
        @NameInMap("ReasonDetail")
        public String reasonDetail;

        /**
         * <p>Business operation status.</p>
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

        public static EntElementVerifyV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EntElementVerifyV2ResponseBodyResult self = new EntElementVerifyV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EntElementVerifyV2ResponseBodyResult setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public EntElementVerifyV2ResponseBodyResult setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public EntElementVerifyV2ResponseBodyResult setReasonDetail(String reasonDetail) {
            this.reasonDetail = reasonDetail;
            return this;
        }
        public String getReasonDetail() {
            return this.reasonDetail;
        }

        public EntElementVerifyV2ResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
