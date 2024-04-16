// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchDeleteModelResponseBody extends TeaModel {
    @NameInMap("Data")
    public BatchDeleteModelResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteModelResponseBody self = new BatchDeleteModelResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteModelResponseBody setData(BatchDeleteModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchDeleteModelResponseBodyData getData() {
        return this.data;
    }

    public BatchDeleteModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchDeleteModelResponseBodyDataItems extends TeaModel {
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

        public static BatchDeleteModelResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteModelResponseBodyDataItems self = new BatchDeleteModelResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public BatchDeleteModelResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public BatchDeleteModelResponseBodyDataItems setAttributes(java.util.List<java.util.Map<String, String>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getAttributes() {
            return this.attributes;
        }

        public BatchDeleteModelResponseBodyDataItems setContent(java.util.Map<String, String> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, String> getContent() {
            return this.content;
        }

        public BatchDeleteModelResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public BatchDeleteModelResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchDeleteModelResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchDeleteModelResponseBodyDataItems setLinkModelId(String linkModelId) {
            this.linkModelId = linkModelId;
            return this;
        }
        public String getLinkModelId() {
            return this.linkModelId;
        }

        public BatchDeleteModelResponseBodyDataItems setLinkModuleId(String linkModuleId) {
            this.linkModuleId = linkModuleId;
            return this;
        }
        public String getLinkModuleId() {
            return this.linkModuleId;
        }

        public BatchDeleteModelResponseBodyDataItems setLinked(Boolean linked) {
            this.linked = linked;
            return this;
        }
        public Boolean getLinked() {
            return this.linked;
        }

        public BatchDeleteModelResponseBodyDataItems setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public BatchDeleteModelResponseBodyDataItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public BatchDeleteModelResponseBodyDataItems setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public BatchDeleteModelResponseBodyDataItems setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public BatchDeleteModelResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public BatchDeleteModelResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public BatchDeleteModelResponseBodyDataItems setProps(java.util.Map<String, String> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, String> getProps() {
            return this.props;
        }

        public BatchDeleteModelResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public BatchDeleteModelResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public BatchDeleteModelResponseBodyDataItems setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public BatchDeleteModelResponseBodyDataItems setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class BatchDeleteModelResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<BatchDeleteModelResponseBodyDataItems> items;

        public static BatchDeleteModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteModelResponseBodyData self = new BatchDeleteModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchDeleteModelResponseBodyData setItems(java.util.List<BatchDeleteModelResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<BatchDeleteModelResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
