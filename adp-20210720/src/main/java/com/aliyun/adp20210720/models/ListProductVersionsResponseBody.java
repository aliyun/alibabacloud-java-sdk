// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

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

    public static class ListProductVersionsResponseBodyDataListAnnotations extends TeaModel {
        @NameInMap("additionalProp1")
        public String additionalProp1;

        @NameInMap("additionalProp2")
        public String additionalProp2;

        @NameInMap("additionalProp3")
        public String additionalProp3;

        public static ListProductVersionsResponseBodyDataListAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionsResponseBodyDataListAnnotations self = new ListProductVersionsResponseBodyDataListAnnotations();
            return TeaModel.build(map, self);
        }

        public ListProductVersionsResponseBodyDataListAnnotations setAdditionalProp1(String additionalProp1) {
            this.additionalProp1 = additionalProp1;
            return this;
        }
        public String getAdditionalProp1() {
            return this.additionalProp1;
        }

        public ListProductVersionsResponseBodyDataListAnnotations setAdditionalProp2(String additionalProp2) {
            this.additionalProp2 = additionalProp2;
            return this;
        }
        public String getAdditionalProp2() {
            return this.additionalProp2;
        }

        public ListProductVersionsResponseBodyDataListAnnotations setAdditionalProp3(String additionalProp3) {
            this.additionalProp3 = additionalProp3;
            return this;
        }
        public String getAdditionalProp3() {
            return this.additionalProp3;
        }

    }

    public static class ListProductVersionsResponseBodyDataListTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListProductVersionsResponseBodyDataListTags build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionsResponseBodyDataListTags self = new ListProductVersionsResponseBodyDataListTags();
            return TeaModel.build(map, self);
        }

        public ListProductVersionsResponseBodyDataListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProductVersionsResponseBodyDataListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListProductVersionsResponseBodyDataList extends TeaModel {
        @NameInMap("annotations")
        public ListProductVersionsResponseBodyDataListAnnotations annotations;

        @NameInMap("description")
        public String description;

        @NameInMap("packageURL")
        public String packageURL;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productUID")
        public String productUID;

        @NameInMap("provider")
        public String provider;

        @NameInMap("releasedAt")
        public String releasedAt;

        @NameInMap("tags")
        public java.util.List<ListProductVersionsResponseBodyDataListTags> tags;

        @NameInMap("uid")
        public String uid;

        @NameInMap("version")
        public String version;

        public static ListProductVersionsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionsResponseBodyDataList self = new ListProductVersionsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductVersionsResponseBodyDataList setAnnotations(ListProductVersionsResponseBodyDataListAnnotations annotations) {
            this.annotations = annotations;
            return this;
        }
        public ListProductVersionsResponseBodyDataListAnnotations getAnnotations() {
            return this.annotations;
        }

        public ListProductVersionsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductVersionsResponseBodyDataList setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public ListProductVersionsResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductVersionsResponseBodyDataList setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public ListProductVersionsResponseBodyDataList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListProductVersionsResponseBodyDataList setReleasedAt(String releasedAt) {
            this.releasedAt = releasedAt;
            return this;
        }
        public String getReleasedAt() {
            return this.releasedAt;
        }

        public ListProductVersionsResponseBodyDataList setTags(java.util.List<ListProductVersionsResponseBodyDataListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListProductVersionsResponseBodyDataListTags> getTags() {
            return this.tags;
        }

        public ListProductVersionsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
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
