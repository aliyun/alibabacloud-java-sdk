// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckVerifyLogResponseBody extends TeaModel {
    /**
     * <p>Backend error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message</p>
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
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("Result")
    public CheckVerifyLogResponseBodyResult result;

    public static CheckVerifyLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckVerifyLogResponseBody self = new CheckVerifyLogResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckVerifyLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckVerifyLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckVerifyLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckVerifyLogResponseBody setResult(CheckVerifyLogResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckVerifyLogResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckVerifyLogResponseBodyResult extends TeaModel {
        /**
         * <p>Extended information</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtInfo")
        public String extInfo;

        /**
         * <p>Records the last page where the authentication was interrupted.</p>
         * <ul>
         * <li>Page not started</li>
         * <li>OCR guide page</li>
         * <li>OCR camera authorization</li>
         * <li>OCR document capture page</li>
         * <li>OCR recognition loading</li>
         * <li>OCR recognition result editing page</li>
         * <li>OCR recognition result editing loading</li>
         * <li>Liveness detection guide page</li>
         * <li>Liveness detection camera authorization page</li>
         * <li>Liveness detection page</li>
         * <li>Liveness detection fallback page</li>
         * <li>Liveness detection retry</li>
         * <li>Liveness detection loading</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OCR拍摄证件页面</p>
         */
        @NameInMap("InterruptPage")
        public String interruptPage;

        /**
         * <p>The page where the authentication process stops. Possible English values:</p>
         * <p>The following are the values in an unordered list:</p>
         * <ul>
         * <li><p>LOADING</p>
         * </li>
         * <li><p>GUIDE</p>
         * </li>
         * <li><p>FACE</p>
         * </li>
         * <li><p>OCR_SCAN</p>
         * </li>
         * <li><p>OCR_RESULT</p>
         * </li>
         * <li><p>NFC_INPUT</p>
         * </li>
         * <li><p>NFC_READ</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LOADING</p>
         */
        @NameInMap("InterruptPageEn")
        public String interruptPageEn;

        /**
         * <p>SDK operation log details</p>
         */
        @NameInMap("LogInfo")
        public java.util.List<String> logInfo;

        /**
         * <p>SDK Operation Log Details (English Version)</p>
         */
        @NameInMap("LogInfoEn")
        public java.util.List<String> logInfoEn;

        /**
         * <p>SDK operation log statistics details</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *           &quot;faceOverTimes&quot;: 0,
         *           &quot;hasFaceOverTimes&quot;: false,
         *           &quot;hasFacePermissionRefuse&quot;: false,
         *           &quot;hasOcrEdit&quot;: true,
         *           &quot;hasOcrEditOverTimes&quot;: false,
         *           &quot;hasOcrOverTimes&quot;: true,
         *           &quot;hasOcrPermissionRefuse&quot;: false,
         *           &quot;ocrEditOverTimes&quot;: 0,
         *           &quot;ocrEditTimes&quot;: 1,
         *           &quot;ocrOverTimes&quot;: 1,
         *           &quot;pageStayTimeInfo&quot;: {
         *             &quot;LOADING&quot;: &quot;1615&quot;,
         *             &quot;OCR_SCAN&quot;: &quot;37446&quot;,
         *             &quot;OCR_RESULT&quot;: &quot;1338&quot;,
         *             &quot;FACE&quot;: &quot;8707&quot;
         *           }
         *         }</p>
         */
        @NameInMap("LogStatisticsInfo")
        public String logStatisticsInfo;

        /**
         * <p>Whether the authentication passed.</p>
         * <ul>
         * <li>Y: Passed.</li>
         * <li>N: Not passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>Sub-result code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>Authentication interruption error codes</p>
         * <ul>
         * <li>1000: The user completed the face scanning process, and the suggested authentication result is pass</li>
         * <li>1001: The user completed the face scanning process, and the suggested authentication result is fail</li>
         * <li>1002: System error</li>
         * <li>1003: SDK initialization failed, please check if the client time is correct</li>
         * <li>1004: Camera permission error</li>
         * <li>1005: Network error</li>
         * <li>1006: User exited</li>
         * <li>1007: Invalid TransactionId</li>
         * <li>1009: Client timestamp error</li>
         * <li>1011: Incorrect document type submitted</li>
         * <li>1012: Missing or format validation failure of key information on the recognized document</li>
         * <li>1013: Poor image quality</li>
         * <li>1014: Exceeded the upper limit of errors</li>
         * <li>1015: Android system version too low</li>
         * <li>1016: Camera permission not obtained</li>
         * <li>9999: Suspected authentication process interruption</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("VerifyErrorCode")
        public String verifyErrorCode;

        /**
         * <p>Authentication status, values:</p>
         * <ul>
         * <li>0: finished (authentication completed)</li>
         * <li>1: unfinished (authentication interrupted)</li>
         * <li>2: notstart (authentication not started)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VerifyStatus")
        public String verifyStatus;

        public static CheckVerifyLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckVerifyLogResponseBodyResult self = new CheckVerifyLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckVerifyLogResponseBodyResult setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public CheckVerifyLogResponseBodyResult setInterruptPage(String interruptPage) {
            this.interruptPage = interruptPage;
            return this;
        }
        public String getInterruptPage() {
            return this.interruptPage;
        }

        public CheckVerifyLogResponseBodyResult setInterruptPageEn(String interruptPageEn) {
            this.interruptPageEn = interruptPageEn;
            return this;
        }
        public String getInterruptPageEn() {
            return this.interruptPageEn;
        }

        public CheckVerifyLogResponseBodyResult setLogInfo(java.util.List<String> logInfo) {
            this.logInfo = logInfo;
            return this;
        }
        public java.util.List<String> getLogInfo() {
            return this.logInfo;
        }

        public CheckVerifyLogResponseBodyResult setLogInfoEn(java.util.List<String> logInfoEn) {
            this.logInfoEn = logInfoEn;
            return this;
        }
        public java.util.List<String> getLogInfoEn() {
            return this.logInfoEn;
        }

        public CheckVerifyLogResponseBodyResult setLogStatisticsInfo(String logStatisticsInfo) {
            this.logStatisticsInfo = logStatisticsInfo;
            return this;
        }
        public String getLogStatisticsInfo() {
            return this.logStatisticsInfo;
        }

        public CheckVerifyLogResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public CheckVerifyLogResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public CheckVerifyLogResponseBodyResult setVerifyErrorCode(String verifyErrorCode) {
            this.verifyErrorCode = verifyErrorCode;
            return this;
        }
        public String getVerifyErrorCode() {
            return this.verifyErrorCode;
        }

        public CheckVerifyLogResponseBodyResult setVerifyStatus(String verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }
        public String getVerifyStatus() {
            return this.verifyStatus;
        }

    }

}
