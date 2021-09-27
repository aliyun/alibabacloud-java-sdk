// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteProductComponentVersionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static DeleteProductComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductComponentVersionResponseBody self = new DeleteProductComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProductComponentVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteProductComponentVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
