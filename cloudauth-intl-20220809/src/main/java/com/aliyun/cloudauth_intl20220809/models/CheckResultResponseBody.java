// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckResultResponseBody extends TeaModel {
    /**
     * <p>Return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
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
    public CheckResultResponseBodyResult result;

    public static CheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckResultResponseBody self = new CheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckResultResponseBody setResult(CheckResultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckResultResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckResultResponseBodyResult extends TeaModel {
        /**
         * <p>Authentication result.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("EkycResult")
        public String ekycResult;

        /**
         * <p>Extended basic information.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("ExtBasicInfo")
        public String extBasicInfo;

        /**
         * <p>Face information.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("ExtFaceInfo")
        public String extFaceInfo;

        /**
         * <p>ID information.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        /**
         * <p>Extended information</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtInfo")
        public String extInfo;

        /**
         * <p>Risk information.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("ExtRiskInfo")
        public String extRiskInfo;

        @NameInMap("ExtSourceInfo")
        public String extSourceInfo;

        /**
         * <p>Whether the authentication is passed.</p>
         * <ul>
         * <li>Y: Passed</li>
         * <li>N: Not passed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>Sub-result code.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static CheckResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckResultResponseBodyResult self = new CheckResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckResultResponseBodyResult setEkycResult(String ekycResult) {
            this.ekycResult = ekycResult;
            return this;
        }
        public String getEkycResult() {
            return this.ekycResult;
        }

        public CheckResultResponseBodyResult setExtBasicInfo(String extBasicInfo) {
            this.extBasicInfo = extBasicInfo;
            return this;
        }
        public String getExtBasicInfo() {
            return this.extBasicInfo;
        }

        public CheckResultResponseBodyResult setExtFaceInfo(String extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public String getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public CheckResultResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public CheckResultResponseBodyResult setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public CheckResultResponseBodyResult setExtRiskInfo(String extRiskInfo) {
            this.extRiskInfo = extRiskInfo;
            return this;
        }
        public String getExtRiskInfo() {
            return this.extRiskInfo;
        }

        public CheckResultResponseBodyResult setExtSourceInfo(String extSourceInfo) {
            this.extSourceInfo = extSourceInfo;
            return this;
        }
        public String getExtSourceInfo() {
            return this.extSourceInfo;
        }

        public CheckResultResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public CheckResultResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
