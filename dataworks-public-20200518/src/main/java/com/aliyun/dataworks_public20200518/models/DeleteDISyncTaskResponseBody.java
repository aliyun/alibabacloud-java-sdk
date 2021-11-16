// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDISyncTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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
