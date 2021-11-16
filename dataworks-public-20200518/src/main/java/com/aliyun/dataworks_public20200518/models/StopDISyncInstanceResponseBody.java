// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StopDISyncInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public StopDISyncInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StopDISyncInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDISyncInstanceResponseBody self = new StopDISyncInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDISyncInstanceResponseBody setData(StopDISyncInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopDISyncInstanceResponseBodyData getData() {
        return this.data;
    }

    public StopDISyncInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDISyncInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StopDISyncInstanceResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        public static StopDISyncInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopDISyncInstanceResponseBodyData self = new StopDISyncInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopDISyncInstanceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopDISyncInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
