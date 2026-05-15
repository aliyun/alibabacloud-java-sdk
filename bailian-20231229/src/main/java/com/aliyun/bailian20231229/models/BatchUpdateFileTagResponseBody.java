// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class BatchUpdateFileTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchUpdateFileTagResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(FileId) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchUpdateFileTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileTagResponseBody self = new BatchUpdateFileTagResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchUpdateFileTagResponseBody setData(BatchUpdateFileTagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchUpdateFileTagResponseBodyData getData() {
        return this.data;
    }

    public BatchUpdateFileTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchUpdateFileTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUpdateFileTagResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BatchUpdateFileTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>FileId not exists.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>file_f40f2a32205d44b4a93b11617113da15_10045951</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList self = new BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList();
            return TeaModel.build(map, self);
        }

        public BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class BatchUpdateFileTagResponseBodyData extends TeaModel {
        @NameInMap("UpdateFileTagResultList")
        public java.util.List<BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList> updateFileTagResultList;

        public static BatchUpdateFileTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateFileTagResponseBodyData self = new BatchUpdateFileTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchUpdateFileTagResponseBodyData setUpdateFileTagResultList(java.util.List<BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList> updateFileTagResultList) {
            this.updateFileTagResultList = updateFileTagResultList;
            return this;
        }
        public java.util.List<BatchUpdateFileTagResponseBodyDataUpdateFileTagResultList> getUpdateFileTagResultList() {
            return this.updateFileTagResultList;
        }

    }

}
