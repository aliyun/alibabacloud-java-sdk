// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentResponseBody extends TeaModel {
    @NameInMap("msg")
    public String msg;

    @NameInMap("code")
    public String code;

    public static DeleteEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentResponseBody self = new DeleteEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DeleteEnvironmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
