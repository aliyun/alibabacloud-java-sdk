// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class NotifyAddThingTopoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public NotifyAddThingTopoResponseData data;

    public static NotifyAddThingTopoResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyAddThingTopoResponse self = new NotifyAddThingTopoResponse();
        return TeaModel.build(map, self);
    }

    public NotifyAddThingTopoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyAddThingTopoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public NotifyAddThingTopoResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public NotifyAddThingTopoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NotifyAddThingTopoResponse setData(NotifyAddThingTopoResponseData data) {
        this.data = data;
        return this;
    }
    public NotifyAddThingTopoResponseData getData() {
        return this.data;
    }

    public static class NotifyAddThingTopoResponseData extends TeaModel {
        @NameInMap("MessageId")
        @Validation(required = true)
        public String messageId;

        public static NotifyAddThingTopoResponseData build(java.util.Map<String, ?> map) throws Exception {
            NotifyAddThingTopoResponseData self = new NotifyAddThingTopoResponseData();
            return TeaModel.build(map, self);
        }

        public NotifyAddThingTopoResponseData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
