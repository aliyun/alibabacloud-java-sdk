// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class PushProtocolByUuidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("result")
    public Boolean result;

    public static PushProtocolByUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushProtocolByUuidResponseBody self = new PushProtocolByUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public PushProtocolByUuidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PushProtocolByUuidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushProtocolByUuidResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
