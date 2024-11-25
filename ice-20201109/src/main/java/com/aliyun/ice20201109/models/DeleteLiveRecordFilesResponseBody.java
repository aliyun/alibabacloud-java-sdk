// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordFilesResponseBody extends TeaModel {
    /**
     * <p>The list of files deleted.</p>
     */
    @NameInMap("DeleteFileInfoList")
    public java.util.List<DeleteLiveRecordFilesResponseBodyDeleteFileInfoList> deleteFileInfoList;

    /**
     * <p>The description of the state returned.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>13cbb83e-043c-4728-ac35-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveRecordFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordFilesResponseBody self = new DeleteLiveRecordFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordFilesResponseBody setDeleteFileInfoList(java.util.List<DeleteLiveRecordFilesResponseBodyDeleteFileInfoList> deleteFileInfoList) {
        this.deleteFileInfoList = deleteFileInfoList;
        return this;
    }
    public java.util.List<DeleteLiveRecordFilesResponseBodyDeleteFileInfoList> getDeleteFileInfoList() {
        return this.deleteFileInfoList;
    }

    public DeleteLiveRecordFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteLiveRecordFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLiveRecordFilesResponseBodyDeleteFileInfoList extends TeaModel {
        /**
         * <p>The code that identifies the result of the deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The result of deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the deleted recording file.</p>
         * 
         * <strong>example:</strong>
         * <p>13cbb83e-043c-4728-ac35-*****</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        public static DeleteLiveRecordFilesResponseBodyDeleteFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            DeleteLiveRecordFilesResponseBodyDeleteFileInfoList self = new DeleteLiveRecordFilesResponseBodyDeleteFileInfoList();
            return TeaModel.build(map, self);
        }

        public DeleteLiveRecordFilesResponseBodyDeleteFileInfoList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteLiveRecordFilesResponseBodyDeleteFileInfoList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteLiveRecordFilesResponseBodyDeleteFileInfoList setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

    }

}
