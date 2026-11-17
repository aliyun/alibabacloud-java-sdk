// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckVerifyLogResponseBody extends TeaModel {
    /**
     * <p>The backend error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
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
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
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
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtInfo")
        public String extInfo;

        /**
         * <p>The last page where the authentication was interrupted. Valid values:</p>
         * <ul>
         * <li>The page is not started.</li>
         * <li>The OCR guide page.</li>
         * <li>The OCR camera authorization page.</li>
         * <li>The OCR document capture page.</li>
         * <li>The OCR recognition loading page.</li>
         * <li>The OCR recognition result editing page.</li>
         * <li>The OCR recognition result editing loading page.</li>
         * <li>The liveness detection guide page.</li>
         * <li>The liveness detection camera authorization page.</li>
         * <li>The liveness detection page.</li>
         * <li>The liveness detection fallback page.</li>
         * <li>The liveness detection retry page.</li>
         * <li>The liveness detection loading page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OCR document capture page</p>
         */
        @NameInMap("InterruptPage")
        public String interruptPage;

        /**
         * <p>The last page where the authentication was interrupted, in English. Valid values:</p>
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
         * <p>The details of the SDK runtime logs.</p>
         */
        @NameInMap("LogInfo")
        public java.util.List<String> logInfo;

        /**
         * <p>The details of the SDK runtime trace logs in English. The format of this field is the same as that of <strong>LogInfo</strong>.</p>
         */
        @NameInMap("LogInfoEn")
        public java.util.List<String> logInfoEn;

        /**
         * <p>The statistical details of the SDK runtime logs.</p>
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
         * <p>Indicates whether the authentication is passed. Valid values:</p>
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
         * <p>The sub-result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The error code for authentication interruption. Valid values:</p>
         * <ul>
         * <li>1000: The user completed the face scanning process, and the recommended authentication result is passed.</li>
         * <li>1001: The user completed the face scanning process, and the recommended authentication result is not passed.</li>
         * <li>1002: A system error occurred.</li>
         * <li>1003: SDK initialization failed. Check whether the client time is correct.</li>
         * <li>1004: A camera permission error occurred.</li>
         * <li>1005: A network error occurred.</li>
         * <li>1006: The user exited.</li>
         * <li>1007: The TransactionId is invalid.</li>
         * <li>1009: The client timestamp is incorrect.</li>
         * <li>1011: The submitted document type is incorrect.</li>
         * <li>1012: The recognized key information of the document is missing or the format verification failed.</li>
         * <li>1013: The image quality is poor.</li>
         * <li>1014: The number of errors exceeded the upper limit.</li>
         * <li>1015: The Android system version is too low.</li>
         * <li>1016: Camera permissions are not obtained.</li>
         * <li>9999: The authentication process is suspected to be interrupted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("VerifyErrorCode")
        public String verifyErrorCode;

        /**
         * <p>The authentication status. Valid values:</p>
         * <ul>
         * <li>0: finished. The authentication is completed.</li>
         * <li>1: unfinished. The authentication is interrupted.</li>
         * <li>2: notstart. The authentication is not started.</li>
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
