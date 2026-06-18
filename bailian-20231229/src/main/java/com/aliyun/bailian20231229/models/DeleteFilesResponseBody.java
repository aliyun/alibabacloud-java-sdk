// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteFilesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataCenter.FileTooLarge</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DeleteFilesResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-7734-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned by the API.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilesResponseBody self = new DeleteFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteFilesResponseBody setData(DeleteFilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteFilesResponseBodyData getData() {
        return this.data;
    }

    public DeleteFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFilesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeleteFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteFilesResponseBodyDataDeleteFileResultList extends TeaModel {
        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>file_6b193b9b4b1546ef9eaa7340e69adfca_10052857</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The file deletion status. Valid values:</p>
         * <ul>
         * <li>DELETED: The file is deleted.</li>
         * <li>FAILED: The file fails to be deleted.</li>
         * <li>NOT_FOUND: The file is not found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DELETED</p>
         */
        @NameInMap("Status")
        public String status;

        public static DeleteFilesResponseBodyDataDeleteFileResultList build(java.util.Map<String, ?> map) throws Exception {
            DeleteFilesResponseBodyDataDeleteFileResultList self = new DeleteFilesResponseBodyDataDeleteFileResultList();
            return TeaModel.build(map, self);
        }

        public DeleteFilesResponseBodyDataDeleteFileResultList setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public DeleteFilesResponseBodyDataDeleteFileResultList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DeleteFilesResponseBodyData extends TeaModel {
        /**
         * <p>The deletion results.</p>
         */
        @NameInMap("DeleteFileResultList")
        public java.util.List<DeleteFilesResponseBodyDataDeleteFileResultList> deleteFileResultList;

        public static DeleteFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteFilesResponseBodyData self = new DeleteFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteFilesResponseBodyData setDeleteFileResultList(java.util.List<DeleteFilesResponseBodyDataDeleteFileResultList> deleteFileResultList) {
            this.deleteFileResultList = deleteFileResultList;
            return this;
        }
        public java.util.List<DeleteFilesResponseBodyDataDeleteFileResultList> getDeleteFileResultList() {
            return this.deleteFileResultList;
        }

    }

}
