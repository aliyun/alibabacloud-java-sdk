// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetInstanceIdsFromTokenResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public String data;

    // i18nKey
    @NameInMap("I18nKey")
    public String i18nKey;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceIdsFromTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIdsFromTokenResponseBody self = new GetInstanceIdsFromTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceIdsFromTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceIdsFromTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetInstanceIdsFromTokenResponseBody setI18nKey(String i18nKey) {
        this.i18nKey = i18nKey;
        return this;
    }
    public String getI18nKey() {
        return this.i18nKey;
    }

    public GetInstanceIdsFromTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceIdsFromTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceIdsFromTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
