// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductInstanceConfigsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListProductInstanceConfigsResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static ListProductInstanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductInstanceConfigsResponseBody self = new ListProductInstanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductInstanceConfigsResponseBody setData(ListProductInstanceConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductInstanceConfigsResponseBodyData getData() {
        return this.data;
    }

    public ListProductInstanceConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductInstanceConfigsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListProductInstanceConfigsResponseBodyDataList extends TeaModel {
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("uid")
        public String uid;

        @NameInMap("vendorType")
        public String vendorType;

        @NameInMap("value")
        public String value;

        @NameInMap("componentUID")
        public String componentUID;

        @NameInMap("componentVersionUID")
        public String componentVersionUID;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("parentComponentName")
        public String parentComponentName;

        @NameInMap("componentReleaseName")
        public String componentReleaseName;

        @NameInMap("parentComponentReleaseName")
        public String parentComponentReleaseName;

        @NameInMap("parentComponentVersionUID")
        public String parentComponentVersionUID;

        @NameInMap("envUID")
        public String envUID;

        public static ListProductInstanceConfigsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductInstanceConfigsResponseBodyDataList self = new ListProductInstanceConfigsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductInstanceConfigsResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListProductInstanceConfigsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductInstanceConfigsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductInstanceConfigsResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductInstanceConfigsResponseBodyDataList setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListProductInstanceConfigsResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListProductInstanceConfigsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListProductInstanceConfigsResponseBodyDataList setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

        public ListProductInstanceConfigsResponseBodyDataList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListProductInstanceConfigsResponseBodyDataList setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public ListProductInstanceConfigsResponseBodyDataList setComponentVersionUID(String componentVersionUID) {
            this.componentVersionUID = componentVersionUID;
            return this;
        }
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        public ListProductInstanceConfigsResponseBodyDataList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListProductInstanceConfigsResponseBodyDataList setParentComponentName(String parentComponentName) {
            this.parentComponentName = parentComponentName;
            return this;
        }
        public String getParentComponentName() {
            return this.parentComponentName;
        }

        public ListProductInstanceConfigsResponseBodyDataList setComponentReleaseName(String componentReleaseName) {
            this.componentReleaseName = componentReleaseName;
            return this;
        }
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        public ListProductInstanceConfigsResponseBodyDataList setParentComponentReleaseName(String parentComponentReleaseName) {
            this.parentComponentReleaseName = parentComponentReleaseName;
            return this;
        }
        public String getParentComponentReleaseName() {
            return this.parentComponentReleaseName;
        }

        public ListProductInstanceConfigsResponseBodyDataList setParentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        public ListProductInstanceConfigsResponseBodyDataList setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

    }

    public static class ListProductInstanceConfigsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListProductInstanceConfigsResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListProductInstanceConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductInstanceConfigsResponseBodyData self = new ListProductInstanceConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductInstanceConfigsResponseBodyData setList(java.util.List<ListProductInstanceConfigsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListProductInstanceConfigsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListProductInstanceConfigsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListProductInstanceConfigsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductInstanceConfigsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
