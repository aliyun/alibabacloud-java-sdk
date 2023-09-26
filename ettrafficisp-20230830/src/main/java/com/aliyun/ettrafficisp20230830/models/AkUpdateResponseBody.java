// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkUpdateResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static AkUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AkUpdateResponseBody self = new AkUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public AkUpdateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AkUpdateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AkUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
