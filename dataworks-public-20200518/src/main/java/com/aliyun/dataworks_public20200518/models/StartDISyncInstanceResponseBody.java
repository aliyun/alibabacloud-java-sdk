// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartDISyncInstanceResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public StartDISyncInstanceResponseBodyData data;

    public static StartDISyncInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDISyncInstanceResponseBody self = new StartDISyncInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDISyncInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartDISyncInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartDISyncInstanceResponseBody setData(StartDISyncInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartDISyncInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class StartDISyncInstanceResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        public static StartDISyncInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartDISyncInstanceResponseBodyData self = new StartDISyncInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartDISyncInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public StartDISyncInstanceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
