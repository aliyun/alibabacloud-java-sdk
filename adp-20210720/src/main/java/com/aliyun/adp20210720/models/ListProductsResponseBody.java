// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListProductsResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductsResponseBody setData(ListProductsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductsResponseBodyData getData() {
        return this.data;
    }

    public ListProductsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListProductsResponseBodyDataList extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("uid")
        public String uid;

        public static ListProductsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataList self = new ListProductsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListProductsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListProductsResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListProductsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyData self = new ListProductsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyData setList(java.util.List<ListProductsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListProductsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListProductsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListProductsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
