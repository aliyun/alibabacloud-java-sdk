// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationComponentVersionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListFoundationComponentVersionsResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static ListFoundationComponentVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationComponentVersionsResponseBody self = new ListFoundationComponentVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFoundationComponentVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFoundationComponentVersionsResponseBody setData(ListFoundationComponentVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFoundationComponentVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListFoundationComponentVersionsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListFoundationComponentVersionsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ComponentVersion> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListFoundationComponentVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFoundationComponentVersionsResponseBodyData self = new ListFoundationComponentVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFoundationComponentVersionsResponseBodyData setList(java.util.List<ComponentVersion> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ComponentVersion> getList() {
            return this.list;
        }

        public ListFoundationComponentVersionsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListFoundationComponentVersionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFoundationComponentVersionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
