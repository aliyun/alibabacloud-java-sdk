// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateDISyncTaskResponseBodyData data;

    public static CreateDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncTaskResponseBody self = new CreateDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDISyncTaskResponseBody setData(CreateDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public static class CreateDISyncTaskResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        @NameInMap("FileId")
        public Long fileId;

        public static CreateDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDISyncTaskResponseBodyData self = new CreateDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateDISyncTaskResponseBodyData setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

    }

}
