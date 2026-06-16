// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckResultResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return message.</p>
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
         * <p>The verification result.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("EkycResult")
        public String ekycResult;

        /**
         * <p>The extended basic information.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("ExtBasicInfo")
        public String extBasicInfo;

        /**
         * <p>The face information.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("ExtFaceInfo")
        public String extFaceInfo;

        /**
         * <p>The ID information.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        /**
         * <p>The extended information, in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtInfo")
        public String extInfo;

        /**
         * <p>The risk information.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("ExtRiskInfo")
        public String extRiskInfo;

        /**
         * <p>The data source verification details are described as follows (using the Indonesian data source as an example):</p>
         * <ul>
         * <li><strong>govId, fullName, dob</strong>: A comparison score equal to 1.0 indicates a complete match with the official data source. A score lower than 1.0 indicates a mismatch. </li>
         * <li><strong>selfiePhoto</strong>: A comparison score greater than 0.8 indicates a match with the official data source. A score equal to or lower than 0.8 indicates a mismatch. </li>
         * <li><strong>liveness</strong>: A score higher than 0.95 indicates a liveness detection risk. </li>
         * <li><strong>imgManipulationScore</strong>: A score higher than 0.95 indicates an image tampering risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;govId&quot;: 1.0,
         *   &quot;fullName&quot;: 1.0,
         *   &quot;dob&quot;: 0.9,
         *   &quot;selfiePhoto&quot;: 0.8777,
         *   &quot;liveness&quot;: 0.1152,
         *   &quot;imgManipulationScore&quot;: 0.2253
         * }</p>
         */
        @NameInMap("ExtSourceInfo")
        public String extSourceInfo;

        /**
         * <p>Indicates whether the verification is passed. Valid values:</p>
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
