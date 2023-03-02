// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>The information that indicates whether the synchronization node was created.</p>
     */
    @NameInMap("Data")
    public CreateDISyncTaskResponseBodyData data;

    /**
     * <p>The ID of the request. You can query logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncTaskResponseBody self = new CreateDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDISyncTaskResponseBody setData(CreateDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDISyncTaskResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the created synchronization node.</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The reason why the synchronization node failed to be created.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the synchronization node was created. Valid values:</p>
         * <br>
         * <p>*   success: The synchronization node was created.</p>
         * <p>*   fail: The synchronization node failed to be created.</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDISyncTaskResponseBodyData self = new CreateDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDISyncTaskResponseBodyData setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public CreateDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
