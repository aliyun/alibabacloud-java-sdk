// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetTopicAttributesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public SetTopicAttributesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static SetTopicAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetTopicAttributesResponseBody self = new SetTopicAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetTopicAttributesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SetTopicAttributesResponseBody setData(SetTopicAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetTopicAttributesResponseBodyData getData() {
        return this.data;
    }

    public SetTopicAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetTopicAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetTopicAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SetTopicAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetTopicAttributesResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static SetTopicAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetTopicAttributesResponseBodyData self = new SetTopicAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetTopicAttributesResponseBodyData setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public SetTopicAttributesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SetTopicAttributesResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
