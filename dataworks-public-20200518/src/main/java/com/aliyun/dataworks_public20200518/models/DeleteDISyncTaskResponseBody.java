// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the synchronization node in Data Integration is deleted. Valid values:</p>
     * <br>
     * <p>*   success: The synchronization node in Data Integration is deleted.</p>
     * <p>*   fail: The synchronization node in Data Integration failed to be deleted. You can troubleshoot the issue based on the failure reason.</p>
     */
    @NameInMap("Data")
    public DeleteDISyncTaskResponseBodyData data;

    /**
     * <p>The result returned after you called the DeleteDISyncTask operation.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncTaskResponseBody self = new DeleteDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncTaskResponseBody setData(DeleteDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public DeleteDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteDISyncTaskResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the synchronization node in Data Integration failed to be deleted.</p>
         * <br>
         * <p>If the synchronization node in Data Integration is deleted, the value null is returned.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DeleteDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDISyncTaskResponseBodyData self = new DeleteDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
