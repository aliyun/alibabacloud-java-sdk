// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateQueueResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public CreateQueueResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static CreateQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueResponseBody self = new CreateQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQueueResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateQueueResponseBody setData(CreateQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateQueueResponseBodyData getData() {
        return this.data;
    }

    public CreateQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQueueResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateQueueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateQueueResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static CreateQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateQueueResponseBodyData self = new CreateQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateQueueResponseBodyData setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public CreateQueueResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateQueueResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
