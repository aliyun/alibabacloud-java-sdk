// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentNodeResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public InstanceInfo data;

    @NameInMap("msg")
    public String msg;

    public static GetEnvironmentNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentNodeResponseBody self = new GetEnvironmentNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnvironmentNodeResponseBody setData(InstanceInfo data) {
        this.data = data;
        return this;
    }
    public InstanceInfo getData() {
        return this.data;
    }

    public GetEnvironmentNodeResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
