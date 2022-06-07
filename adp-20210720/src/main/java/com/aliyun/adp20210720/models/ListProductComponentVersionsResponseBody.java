// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductComponentVersionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListProductComponentVersionsResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static ListProductComponentVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductComponentVersionsResponseBody self = new ListProductComponentVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductComponentVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductComponentVersionsResponseBody setData(ListProductComponentVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductComponentVersionsResponseBodyData getData() {
        return this.data;
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

        @NameInMap("pageNum")
        public Long pageNum;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("total")
        public Long total;

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

        public ListProductComponentVersionsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListProductComponentVersionsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListProductComponentVersionsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
