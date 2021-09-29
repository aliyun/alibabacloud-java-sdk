// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductVersionConfigsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    @NameInMap("data")
    public ListProductVersionConfigsResponseBodyData data;

    public static ListProductVersionConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionConfigsResponseBody self = new ListProductVersionConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductVersionConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductVersionConfigsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListProductVersionConfigsResponseBody setData(ListProductVersionConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductVersionConfigsResponseBodyData getData() {
        return this.data;
    }

    public static class ListProductVersionConfigsResponseBodyDataList extends TeaModel {
        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("componentVersionUID")
        public String componentVersionUID;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        @NameInMap("description")
        public String description;

        @NameInMap("parentComponentVersionUID")
        public String parentComponentVersionUID;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("parentComponentName")
        public String parentComponentName;

        @NameInMap("componentReleaseName")
        public String componentReleaseName;

        @NameInMap("parentComponentReleaseName")
        public String parentComponentReleaseName;

        @NameInMap("uid")
        public String uid;

        public static ListProductVersionConfigsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionConfigsResponseBodyDataList self = new ListProductVersionConfigsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductVersionConfigsResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListProductVersionConfigsResponseBodyDataList setComponentVersionUID(String componentVersionUID) {
            this.componentVersionUID = componentVersionUID;
            return this;
        }
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        public ListProductVersionConfigsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductVersionConfigsResponseBodyDataList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListProductVersionConfigsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductVersionConfigsResponseBodyDataList setParentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        public ListProductVersionConfigsResponseBodyDataList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListProductVersionConfigsResponseBodyDataList setParentComponentName(String parentComponentName) {
            this.parentComponentName = parentComponentName;
            return this;
        }
        public String getParentComponentName() {
            return this.parentComponentName;
        }

        public ListProductVersionConfigsResponseBodyDataList setComponentReleaseName(String componentReleaseName) {
            this.componentReleaseName = componentReleaseName;
            return this;
        }
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        public ListProductVersionConfigsResponseBodyDataList setParentComponentReleaseName(String parentComponentReleaseName) {
            this.parentComponentReleaseName = parentComponentReleaseName;
            return this;
        }
        public String getParentComponentReleaseName() {
            return this.parentComponentReleaseName;
        }

        public ListProductVersionConfigsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListProductVersionConfigsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListProductVersionConfigsResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListProductVersionConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionConfigsResponseBodyData self = new ListProductVersionConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductVersionConfigsResponseBodyData setList(java.util.List<ListProductVersionConfigsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListProductVersionConfigsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListProductVersionConfigsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListProductVersionConfigsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductVersionConfigsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
