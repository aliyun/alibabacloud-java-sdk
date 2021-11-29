// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductVersionConfigResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProductVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionConfigResponseBody self = new UpdateProductVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProductVersionConfigResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UpdateProductVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
