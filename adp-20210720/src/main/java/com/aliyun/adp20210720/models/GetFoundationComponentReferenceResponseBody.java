// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationComponentReferenceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<FoundationComponentReferenceDetail> data;

    @NameInMap("msg")
    public String msg;

    public static GetFoundationComponentReferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationComponentReferenceResponseBody self = new GetFoundationComponentReferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFoundationComponentReferenceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFoundationComponentReferenceResponseBody setData(java.util.List<FoundationComponentReferenceDetail> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FoundationComponentReferenceDetail> getData() {
        return this.data;
    }

    public GetFoundationComponentReferenceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
