// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteDISyncTaskResponseBodyData data;

    public static DeleteDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncTaskResponseBody self = new DeleteDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDISyncTaskResponseBody setData(DeleteDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public static class DeleteDISyncTaskResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        public static DeleteDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDISyncTaskResponseBodyData self = new DeleteDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
