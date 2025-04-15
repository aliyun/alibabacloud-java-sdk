// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckVerifyLogResponseBody extends TeaModel {
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
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("InterruptPage")
        public String interruptPage;

        @NameInMap("LogInfo")
        public java.util.List<String> logInfo;

        /**
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
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("VerifyErrorCode")
        public String verifyErrorCode;

        /**
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

        public CheckVerifyLogResponseBodyResult setLogInfo(java.util.List<String> logInfo) {
            this.logInfo = logInfo;
            return this;
        }
        public java.util.List<String> getLogInfo() {
            return this.logInfo;
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
