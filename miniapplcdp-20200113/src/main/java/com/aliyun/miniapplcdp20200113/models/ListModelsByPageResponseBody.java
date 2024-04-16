// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModelsByPageResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListModelsByPageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListModelsByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelsByPageResponseBody self = new ListModelsByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelsByPageResponseBody setData(ListModelsByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModelsByPageResponseBodyData getData() {
        return this.data;
    }

    public ListModelsByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModelsByPageResponseBodyDataItems extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Attributes")
        public java.util.List<java.util.Map<String, String>> attributes;

        @NameInMap("Content")
        public java.util.Map<String, String> content;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("LinkModelId")
        public String linkModelId;

        @NameInMap("LinkModuleId")
        public String linkModuleId;

        @NameInMap("Linked")
        public Boolean linked;

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelStatus")
        public String modelStatus;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("Props")
        public java.util.Map<String, String> props;

        @NameInMap("Revision")
        public Integer revision;

        @NameInMap("SchemaVersion")
        public String schemaVersion;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("Visibility")
        public String visibility;

        public static ListModelsByPageResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListModelsByPageResponseBodyDataItems self = new ListModelsByPageResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListModelsByPageResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListModelsByPageResponseBodyDataItems setAttributes(java.util.List<java.util.Map<String, String>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getAttributes() {
            return this.attributes;
        }

        public ListModelsByPageResponseBodyDataItems setContent(java.util.Map<String, String> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, String> getContent() {
            return this.content;
        }

        public ListModelsByPageResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModelsByPageResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelsByPageResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListModelsByPageResponseBodyDataItems setLinkModelId(String linkModelId) {
            this.linkModelId = linkModelId;
            return this;
        }
        public String getLinkModelId() {
            return this.linkModelId;
        }

        public ListModelsByPageResponseBodyDataItems setLinkModuleId(String linkModuleId) {
            this.linkModuleId = linkModuleId;
            return this;
        }
        public String getLinkModuleId() {
            return this.linkModuleId;
        }

        public ListModelsByPageResponseBodyDataItems setLinked(Boolean linked) {
            this.linked = linked;
            return this;
        }
        public Boolean getLinked() {
            return this.linked;
        }

        public ListModelsByPageResponseBodyDataItems setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListModelsByPageResponseBodyDataItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListModelsByPageResponseBodyDataItems setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public ListModelsByPageResponseBodyDataItems setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListModelsByPageResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListModelsByPageResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModelsByPageResponseBodyDataItems setProps(java.util.Map<String, String> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, String> getProps() {
            return this.props;
        }

        public ListModelsByPageResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public ListModelsByPageResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public ListModelsByPageResponseBodyDataItems setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListModelsByPageResponseBodyDataItems setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListModelsByPageResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListModelsByPageResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListModelsByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelsByPageResponseBodyData self = new ListModelsByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelsByPageResponseBodyData setItems(java.util.List<ListModelsByPageResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListModelsByPageResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListModelsByPageResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListModelsByPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListModelsByPageResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
