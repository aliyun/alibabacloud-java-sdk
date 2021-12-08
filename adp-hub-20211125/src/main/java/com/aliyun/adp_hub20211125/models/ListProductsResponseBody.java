// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

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
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("deletedAt")
        public String deletedAt;

        @NameInMap("description")
        public String description;

        @NameInMap("isPublic")
        public String isPublic;

        @NameInMap("name")
        public String name;

        @NameInMap("title")
        public String title;

        @NameInMap("uid")
        public String uid;

        @NameInMap("updatedAt")
        public String updatedAt;

        public static ListProductsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataList self = new ListProductsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListProductsResponseBodyDataList setDeletedAt(String deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }
        public String getDeletedAt() {
            return this.deletedAt;
        }

        public ListProductsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyDataList setIsPublic(String isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public String getIsPublic() {
            return this.isPublic;
        }

        public ListProductsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyDataList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListProductsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListProductsResponseBodyDataList setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
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
