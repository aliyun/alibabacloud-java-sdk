// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListComponentsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListComponentsResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsResponseBody self = new ListComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentsResponseBody setData(ListComponentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListComponentsResponseBodyData getData() {
        return this.data;
    }

    public ListComponentsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListComponentsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListComponentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListComponentsResponseBodyDataListAnnotations extends TeaModel {
        @NameInMap("annotations")
        public String annotations;

        public static ListComponentsResponseBodyDataListAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyDataListAnnotations self = new ListComponentsResponseBodyDataListAnnotations();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyDataListAnnotations setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

    }

    public static class ListComponentsResponseBodyDataList extends TeaModel {
        @NameInMap("annotations")
        public ListComponentsResponseBodyDataListAnnotations annotations;

        @NameInMap("category")
        public String category;

        @NameInMap("description")
        public String description;

        @NameInMap("documents")
        public String documents;

        @NameInMap("name")
        public String name;

        @NameInMap("provider")
        public String provider;

        @NameInMap("public")
        public Boolean _public;

        @NameInMap("singleton")
        public Boolean singleton;

        @NameInMap("source")
        public String source;

        @NameInMap("uid")
        public String uid;

        public static ListComponentsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyDataList self = new ListComponentsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyDataList setAnnotations(ListComponentsResponseBodyDataListAnnotations annotations) {
            this.annotations = annotations;
            return this;
        }
        public ListComponentsResponseBodyDataListAnnotations getAnnotations() {
            return this.annotations;
        }

        public ListComponentsResponseBodyDataList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListComponentsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListComponentsResponseBodyDataList setDocuments(String documents) {
            this.documents = documents;
            return this;
        }
        public String getDocuments() {
            return this.documents;
        }

        public ListComponentsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComponentsResponseBodyDataList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListComponentsResponseBodyDataList set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public ListComponentsResponseBodyDataList setSingleton(Boolean singleton) {
            this.singleton = singleton;
            return this;
        }
        public Boolean getSingleton() {
            return this.singleton;
        }

        public ListComponentsResponseBodyDataList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListComponentsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListComponentsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListComponentsResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListComponentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyData self = new ListComponentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyData setList(java.util.List<ListComponentsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListComponentsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListComponentsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListComponentsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
