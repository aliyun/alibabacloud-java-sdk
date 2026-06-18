// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class BatchUpdateFileTagResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates that the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned by the operation.</p>
     */
    @NameInMap("Data")
    public BatchUpdateFileTagResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Required parameter(FileId) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was accepted. Check <code>UpdateFileTagResultList</code> for the status of each file. Valid values:</p>
     * <ul>
     * <li><p>true: The request was accepted.</p>
     * </li>
     * <li><p>false: The request failed, for example, due to an invalid parameter.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The error code. This parameter is returned only if Success is false.</p>
         * 
         * <strong>example:</strong>
         * <p>NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. This parameter is returned only if Success is false.</p>
         * 
         * <strong>example:</strong>
         * <p>FileId not exists.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>file_f40f2a32205d44b4a93b11617113da15_10045951</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>Indicates whether the tags for the specific file were updated. Valid values:</p>
         * <ul>
         * <li><p>true: The tags were updated successfully.</p>
         * </li>
         * <li><p>false: The tag update failed.</p>
         * </li>
         * </ul>
         * 
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
        /**
         * <p>A list of the tag update results.</p>
         */
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
