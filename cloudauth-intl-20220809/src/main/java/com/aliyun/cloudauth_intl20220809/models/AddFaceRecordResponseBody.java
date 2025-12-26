// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddFaceRecordResponseBody extends TeaModel {
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
     * <p>7A0D192A-CC0C-5DE5-A3B6-A14CF45508F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddFaceRecordResponseBodyResult result;

    public static AddFaceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceRecordResponseBody self = new AddFaceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFaceRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddFaceRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceRecordResponseBody setResult(AddFaceRecordResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddFaceRecordResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddFaceRecordResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         * &quot;faceQuality&quot;: &quot;HIGH&quot;
         * }</p>
         */
        @NameInMap("ExtFaceInfo")
        public String extFaceInfo;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        public static AddFaceRecordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddFaceRecordResponseBodyResult self = new AddFaceRecordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddFaceRecordResponseBodyResult setExtFaceInfo(String extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public String getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public AddFaceRecordResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

    }

}
