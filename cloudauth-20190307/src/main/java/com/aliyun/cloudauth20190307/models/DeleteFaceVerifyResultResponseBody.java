// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteFaceVerifyResultResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information.</p>
     */
    @NameInMap("ResultObject")
    public DeleteFaceVerifyResultResponseBodyResultObject resultObject;

    public static DeleteFaceVerifyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceVerifyResultResponseBody self = new DeleteFaceVerifyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceVerifyResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteFaceVerifyResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFaceVerifyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFaceVerifyResultResponseBody setResultObject(DeleteFaceVerifyResultResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DeleteFaceVerifyResultResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DeleteFaceVerifyResultResponseBodyResultObject extends TeaModel {
        /**
         * <p>Unique identifier for real-person authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>sha58aeae7ea2f5ed069530f58df4e6d</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>Deletion result. Possible values are as follows:</p>
         * <ul>
         * <li>Y: Deletion successful.</li>
         * <li>N: Deletion failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("DeleteResult")
        public String deleteResult;

        /**
         * <p>Reason for deletion failure</p>
         * <ul>
         * <li>NOT_DELETE_REPEATEDLY: Cannot be deleted repeatedly</li>
         * <li>NEED_QUERY_VERIFY_RESULT: Need to query the verification result first, then delete</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOT_DELETE_REPEATEDLY</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        public static DeleteFaceVerifyResultResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DeleteFaceVerifyResultResponseBodyResultObject self = new DeleteFaceVerifyResultResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DeleteFaceVerifyResultResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public DeleteFaceVerifyResultResponseBodyResultObject setDeleteResult(String deleteResult) {
            this.deleteResult = deleteResult;
            return this;
        }
        public String getDeleteResult() {
            return this.deleteResult;
        }

        public DeleteFaceVerifyResultResponseBodyResultObject setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

    }

}
