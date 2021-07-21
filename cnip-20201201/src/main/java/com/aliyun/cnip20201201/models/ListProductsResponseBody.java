// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListProductsResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setData(ListProductsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductsResponseBodyData getData() {
        return this.data;
    }

    public ListProductsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListProductsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListProductsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProductsResponseBodyDataListAnnotations extends TeaModel {
        @NameInMap("Shit")
        public String shit;

        public static ListProductsResponseBodyDataListAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataListAnnotations self = new ListProductsResponseBodyDataListAnnotations();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataListAnnotations setShit(String shit) {
            this.shit = shit;
            return this;
        }
        public String getShit() {
            return this.shit;
        }

    }

    public static class ListProductsResponseBodyDataList extends TeaModel {
        @NameInMap("annotations")
        public ListProductsResponseBodyDataListAnnotations annotations;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("provider")
        public String provider;

        @NameInMap("uid")
        public String uid;

        public static ListProductsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataList self = new ListProductsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataList setAnnotations(ListProductsResponseBodyDataListAnnotations annotations) {
            this.annotations = annotations;
            return this;
        }
        public ListProductsResponseBodyDataListAnnotations getAnnotations() {
            return this.annotations;
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

        public ListProductsResponseBodyDataList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
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
