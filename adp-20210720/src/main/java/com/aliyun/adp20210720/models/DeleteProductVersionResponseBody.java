// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteProductVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static DeleteProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductVersionResponseBody self = new DeleteProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProductVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteProductVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteProductVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
