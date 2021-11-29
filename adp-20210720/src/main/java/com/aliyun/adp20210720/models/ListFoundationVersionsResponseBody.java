// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationVersionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListFoundationVersionsResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static ListFoundationVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationVersionsResponseBody self = new ListFoundationVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFoundationVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFoundationVersionsResponseBody setData(ListFoundationVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFoundationVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListFoundationVersionsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListFoundationVersionsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<FoundationVersion> list;

        public static ListFoundationVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFoundationVersionsResponseBodyData self = new ListFoundationVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFoundationVersionsResponseBodyData setList(java.util.List<FoundationVersion> list) {
            this.list = list;
            return this;
        }
        public java.util.List<FoundationVersion> getList() {
            return this.list;
        }

    }

}
