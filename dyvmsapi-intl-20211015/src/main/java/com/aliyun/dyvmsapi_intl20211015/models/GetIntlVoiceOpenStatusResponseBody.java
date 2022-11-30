// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class GetIntlVoiceOpenStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("OpenStatus")
    public Boolean openStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIntlVoiceOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntlVoiceOpenStatusResponseBody self = new GetIntlVoiceOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntlVoiceOpenStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIntlVoiceOpenStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIntlVoiceOpenStatusResponseBody setOpenStatus(Boolean openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public Boolean getOpenStatus() {
        return this.openStatus;
    }

    public GetIntlVoiceOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
