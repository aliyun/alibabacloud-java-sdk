// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateDISyncTaskResponseData data;

    public static CreateDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncTaskResponse self = new CreateDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDISyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDISyncTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDISyncTaskResponse setData(CreateDISyncTaskResponseData data) {
        this.data = data;
        return this;
    }
    public CreateDISyncTaskResponseData getData() {
        return this.data;
    }

    public static class CreateDISyncTaskResponseData extends TeaModel {
        @NameInMap("FileId")
        @Validation(required = true)
        public Long fileId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static CreateDISyncTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateDISyncTaskResponseData self = new CreateDISyncTaskResponseData();
            return TeaModel.build(map, self);
        }

        public CreateDISyncTaskResponseData setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public CreateDISyncTaskResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateDISyncTaskResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
