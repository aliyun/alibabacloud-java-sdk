// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationVersionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<FoundationVersion> data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static GetFoundationVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationVersionResponseBody self = new GetFoundationVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFoundationVersionResponseBody setData(java.util.List<FoundationVersion> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FoundationVersion> getData() {
        return this.data;
    }

    public GetFoundationVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFoundationVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
