// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class NotifyAddThingTopoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public NotifyAddThingTopoResponseBodyData data;

    public static NotifyAddThingTopoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyAddThingTopoResponseBody self = new NotifyAddThingTopoResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyAddThingTopoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyAddThingTopoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public NotifyAddThingTopoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public NotifyAddThingTopoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NotifyAddThingTopoResponseBody setData(NotifyAddThingTopoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public NotifyAddThingTopoResponseBodyData getData() {
        return this.data;
    }

    public static class NotifyAddThingTopoResponseBodyData extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        public static NotifyAddThingTopoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NotifyAddThingTopoResponseBodyData self = new NotifyAddThingTopoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NotifyAddThingTopoResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
