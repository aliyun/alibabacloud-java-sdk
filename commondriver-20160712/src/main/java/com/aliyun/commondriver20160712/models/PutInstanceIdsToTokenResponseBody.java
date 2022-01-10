// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class PutInstanceIdsToTokenResponseBody extends TeaModel {
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

    public static PutInstanceIdsToTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutInstanceIdsToTokenResponseBody self = new PutInstanceIdsToTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public PutInstanceIdsToTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutInstanceIdsToTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PutInstanceIdsToTokenResponseBody setI18nKey(String i18nKey) {
        this.i18nKey = i18nKey;
        return this;
    }
    public String getI18nKey() {
        return this.i18nKey;
    }

    public PutInstanceIdsToTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutInstanceIdsToTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutInstanceIdsToTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
