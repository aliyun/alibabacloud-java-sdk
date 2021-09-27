// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductComponentVersionsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListProductComponentVersionsResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static ListProductComponentVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductComponentVersionsResponseBody self = new ListProductComponentVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductComponentVersionsResponseBody setData(ListProductComponentVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductComponentVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListProductComponentVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductComponentVersionsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListProductComponentVersionsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ProductComponentRelationDetail> list;

        public static ListProductComponentVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductComponentVersionsResponseBodyData self = new ListProductComponentVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductComponentVersionsResponseBodyData setList(java.util.List<ProductComponentRelationDetail> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ProductComponentRelationDetail> getList() {
            return this.list;
        }

    }

}
