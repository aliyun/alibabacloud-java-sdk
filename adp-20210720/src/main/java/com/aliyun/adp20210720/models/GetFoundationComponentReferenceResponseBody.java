// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationComponentReferenceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetFoundationComponentReferenceResponseBodyData data;

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

    public GetFoundationComponentReferenceResponseBody setData(GetFoundationComponentReferenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFoundationComponentReferenceResponseBodyData getData() {
        return this.data;
    }

    public GetFoundationComponentReferenceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetFoundationComponentReferenceResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<FoundationComponentReferenceDetail> list;

        public static GetFoundationComponentReferenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFoundationComponentReferenceResponseBodyData self = new GetFoundationComponentReferenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFoundationComponentReferenceResponseBodyData setList(java.util.List<FoundationComponentReferenceDetail> list) {
            this.list = list;
            return this;
        }
        public java.util.List<FoundationComponentReferenceDetail> getList() {
            return this.list;
        }

    }

}
