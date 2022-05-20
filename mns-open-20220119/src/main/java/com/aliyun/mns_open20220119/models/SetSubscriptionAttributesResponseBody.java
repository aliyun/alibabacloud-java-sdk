// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetSubscriptionAttributesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public SetSubscriptionAttributesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static SetSubscriptionAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSubscriptionAttributesResponseBody self = new SetSubscriptionAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSubscriptionAttributesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SetSubscriptionAttributesResponseBody setData(SetSubscriptionAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetSubscriptionAttributesResponseBodyData getData() {
        return this.data;
    }

    public SetSubscriptionAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetSubscriptionAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSubscriptionAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SetSubscriptionAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetSubscriptionAttributesResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static SetSubscriptionAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetSubscriptionAttributesResponseBodyData self = new SetSubscriptionAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetSubscriptionAttributesResponseBodyData setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public SetSubscriptionAttributesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SetSubscriptionAttributesResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
