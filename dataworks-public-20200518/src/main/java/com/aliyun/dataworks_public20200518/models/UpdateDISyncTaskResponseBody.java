// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UpdateDISyncTaskResponseBodyData data;

    public static UpdateDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskResponseBody self = new UpdateDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDISyncTaskResponseBody setData(UpdateDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateDISyncTaskResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        public static UpdateDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDISyncTaskResponseBodyData self = new UpdateDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
