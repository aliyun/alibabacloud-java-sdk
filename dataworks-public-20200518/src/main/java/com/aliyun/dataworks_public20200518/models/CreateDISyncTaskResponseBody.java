// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDISyncTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("Message")
        public String message;

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
