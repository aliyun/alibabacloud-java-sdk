// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class UnsubscribeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public UnsubscribeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static UnsubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeResponseBody self = new UnsubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public UnsubscribeResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UnsubscribeResponseBody setData(UnsubscribeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnsubscribeResponseBodyData getData() {
        return this.data;
    }

    public UnsubscribeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnsubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnsubscribeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UnsubscribeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UnsubscribeResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static UnsubscribeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnsubscribeResponseBodyData self = new UnsubscribeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnsubscribeResponseBodyData setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public UnsubscribeResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UnsubscribeResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
