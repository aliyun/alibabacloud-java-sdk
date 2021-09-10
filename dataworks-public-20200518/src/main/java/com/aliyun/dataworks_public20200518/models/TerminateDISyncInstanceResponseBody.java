// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public TerminateDISyncInstanceResponseBodyData data;

    public static TerminateDISyncInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateDISyncInstanceResponseBody self = new TerminateDISyncInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateDISyncInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TerminateDISyncInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TerminateDISyncInstanceResponseBody setData(TerminateDISyncInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TerminateDISyncInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class TerminateDISyncInstanceResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        public static TerminateDISyncInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TerminateDISyncInstanceResponseBodyData self = new TerminateDISyncInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TerminateDISyncInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public TerminateDISyncInstanceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
