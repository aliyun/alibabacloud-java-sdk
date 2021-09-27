// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddEnvironmentNodesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static AddEnvironmentNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentNodesResponseBody self = new AddEnvironmentNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddEnvironmentNodesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
