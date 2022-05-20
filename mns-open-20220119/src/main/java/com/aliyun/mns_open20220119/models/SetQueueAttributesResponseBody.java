// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetQueueAttributesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public SetQueueAttributesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static SetQueueAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetQueueAttributesResponseBody self = new SetQueueAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetQueueAttributesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SetQueueAttributesResponseBody setData(SetQueueAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetQueueAttributesResponseBodyData getData() {
        return this.data;
    }

    public SetQueueAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetQueueAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetQueueAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SetQueueAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetQueueAttributesResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static SetQueueAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetQueueAttributesResponseBodyData self = new SetQueueAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetQueueAttributesResponseBodyData setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public SetQueueAttributesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SetQueueAttributesResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
