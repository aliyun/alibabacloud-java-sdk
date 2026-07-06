// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteFaceRecordV2ResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
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
     * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response result.</p>
     */
    @NameInMap("Result")
    public DeleteFaceRecordV2ResponseBodyResult result;

    public static DeleteFaceRecordV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceRecordV2ResponseBody self = new DeleteFaceRecordV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceRecordV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteFaceRecordV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFaceRecordV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFaceRecordV2ResponseBody setResult(DeleteFaceRecordV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteFaceRecordV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteFaceRecordV2ResponseBodyResult extends TeaModel {
        /**
         * <p>The deletion result. Valid values:</p>
         * <ul>
         * <li>Y: Succeeded.</li>
         * <li>N: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Deleted")
        public String deleted;

        /**
         * <p>The list of face group codes from which the face data was actually deleted (comma-separated). This parameter is returned with all deleted group codes when FaceGroupCode is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>wqe***,dsa***</p>
         */
        @NameInMap("DeletedGroupCodes")
        public String deletedGroupCodes;

        public static DeleteFaceRecordV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteFaceRecordV2ResponseBodyResult self = new DeleteFaceRecordV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteFaceRecordV2ResponseBodyResult setDeleted(String deleted) {
            this.deleted = deleted;
            return this;
        }
        public String getDeleted() {
            return this.deleted;
        }

        public DeleteFaceRecordV2ResponseBodyResult setDeletedGroupCodes(String deletedGroupCodes) {
            this.deletedGroupCodes = deletedGroupCodes;
            return this;
        }
        public String getDeletedGroupCodes() {
            return this.deletedGroupCodes;
        }

    }

}
