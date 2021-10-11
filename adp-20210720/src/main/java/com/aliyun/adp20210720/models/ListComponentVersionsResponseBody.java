// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListComponentVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public ListComponentVersionsResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static ListComponentVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentVersionsResponseBody self = new ListComponentVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComponentVersionsResponseBody setData(ListComponentVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListComponentVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListComponentVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListComponentVersionsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListComponentVersionsResponseBodyDataList extends TeaModel {
        @NameInMap("appVersion")
        public String appVersion;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentUID")
        public String componentUID;

        @NameInMap("description")
        public String description;

        @NameInMap("documents")
        public String documents;

        @NameInMap("imagesMapping")
        public String imagesMapping;

        @NameInMap("orchestrationValues")
        public String orchestrationValues;

        @NameInMap("packageURL")
        public String packageURL;

        @NameInMap("parentComponent")
        public Boolean parentComponent;

        @NameInMap("readme")
        public String readme;

        @NameInMap("resources")
        public String resources;

        @NameInMap("uid")
        public String uid;

        @NameInMap("version")
        public String version;

        public static ListComponentVersionsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListComponentVersionsResponseBodyDataList self = new ListComponentVersionsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListComponentVersionsResponseBodyDataList setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListComponentVersionsResponseBodyDataList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListComponentVersionsResponseBodyDataList setComponentUID(String componentUID) {
            this.componentUID = componentUID;
            return this;
        }
        public String getComponentUID() {
            return this.componentUID;
        }

        public ListComponentVersionsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListComponentVersionsResponseBodyDataList setDocuments(String documents) {
            this.documents = documents;
            return this;
        }
        public String getDocuments() {
            return this.documents;
        }

        public ListComponentVersionsResponseBodyDataList setImagesMapping(String imagesMapping) {
            this.imagesMapping = imagesMapping;
            return this;
        }
        public String getImagesMapping() {
            return this.imagesMapping;
        }

        public ListComponentVersionsResponseBodyDataList setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public ListComponentVersionsResponseBodyDataList setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public ListComponentVersionsResponseBodyDataList setParentComponent(Boolean parentComponent) {
            this.parentComponent = parentComponent;
            return this;
        }
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        public ListComponentVersionsResponseBodyDataList setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public ListComponentVersionsResponseBodyDataList setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public ListComponentVersionsResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListComponentVersionsResponseBodyDataList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListComponentVersionsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListComponentVersionsResponseBodyDataList> list;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListComponentVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComponentVersionsResponseBodyData self = new ListComponentVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComponentVersionsResponseBodyData setList(java.util.List<ListComponentVersionsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListComponentVersionsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListComponentVersionsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListComponentVersionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListComponentVersionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
