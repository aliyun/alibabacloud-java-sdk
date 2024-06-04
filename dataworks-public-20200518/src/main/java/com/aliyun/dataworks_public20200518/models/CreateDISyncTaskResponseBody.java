// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>The information that indicates whether the data synchronization task is created.</p>
     */
    @NameInMap("Data")
    public CreateDISyncTaskResponseBodyData data;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
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
         * <p>The ID of the data synchronization task that is created.</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The error message that is returned if the data synchronization task fails to be created. If the data synchronization task is successfully created, this parameter is not returned. If the data synchronization task fails to be created, an error message in the "Invalid path: Business Flow/xxxx/Data Integration" format is returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The creation status of the data synchronization task. Valid values:</p>
         * <p>- success </p>
         * <p>- fail</p>
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
