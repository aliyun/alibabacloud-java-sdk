// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class ListProductVersionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListProductVersionsResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static ListProductVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsResponseBody self = new ListProductVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductVersionsResponseBody setData(ListProductVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListProductVersionsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListProductVersionsResponseBodyDataList extends TeaModel {
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("deletedAt")
        public String deletedAt;

        @NameInMap("productUID")
        public String productUID;

        @NameInMap("uid")
        public String uid;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("version")
        public String version;

        public static ListProductVersionsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionsResponseBodyDataList self = new ListProductVersionsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductVersionsResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListProductVersionsResponseBodyDataList setDeletedAt(String deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }
        public String getDeletedAt() {
            return this.deletedAt;
        }

        public ListProductVersionsResponseBodyDataList setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public ListProductVersionsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListProductVersionsResponseBodyDataList setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListProductVersionsResponseBodyDataList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListProductVersionsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListProductVersionsResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListProductVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionsResponseBodyData self = new ListProductVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductVersionsResponseBodyData setList(java.util.List<ListProductVersionsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListProductVersionsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListProductVersionsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListProductVersionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductVersionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
