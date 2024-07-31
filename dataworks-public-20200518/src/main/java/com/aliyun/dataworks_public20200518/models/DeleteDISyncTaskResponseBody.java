// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>The deletion result.</p>
     */
    @NameInMap("Data")
    public DeleteDISyncTaskResponseBodyData data;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937635973****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        /**
         * <p>The reason why the synchronization task fails to be deleted. If the synchronization task is deleted, the value null is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>fileId:[100] is invalid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the synchronization task is deleted. Valid values:</p>
         * <ul>
         * <li>success: The synchronization task is deleted.</li>
         * <li>fail: The synchronization task fails to be deleted. You can troubleshoot the issue based on the failure reason.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fail</p>
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
