// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductFoundationVersionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static UpdateProductFoundationVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductFoundationVersionResponseBody self = new UpdateProductFoundationVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductFoundationVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProductFoundationVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
