// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListDataModelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListDataModelsResponseBodyData data;

    public static ListDataModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataModelsResponseBody self = new ListDataModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataModelsResponseBody setData(ListDataModelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataModelsResponseBodyData getData() {
        return this.data;
    }

    public static class ListDataModelsResponseBodyDataItems extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("Revision")
        public Integer revision;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("SchemaVersion")
        public String schemaVersion;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Props")
        public java.util.Map<String, ?> props;

        @NameInMap("ModelStatus")
        public String modelStatus;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("Content")
        public java.util.Map<String, ?> content;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("Attributes")
        public java.util.List<java.util.Map<String, ?>> attributes;

        public static ListDataModelsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListDataModelsResponseBodyDataItems self = new ListDataModelsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListDataModelsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataModelsResponseBodyDataItems setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListDataModelsResponseBodyDataItems setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListDataModelsResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public ListDataModelsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataModelsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataModelsResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public ListDataModelsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListDataModelsResponseBodyDataItems setProps(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, ?> getProps() {
            return this.props;
        }

        public ListDataModelsResponseBodyDataItems setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public ListDataModelsResponseBodyDataItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListDataModelsResponseBodyDataItems setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public ListDataModelsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataModelsResponseBodyDataItems setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListDataModelsResponseBodyDataItems setAttributes(java.util.List<java.util.Map<String, ?>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getAttributes() {
            return this.attributes;
        }

    }

    public static class ListDataModelsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListDataModelsResponseBodyDataItems> items;

        public static ListDataModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataModelsResponseBodyData self = new ListDataModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataModelsResponseBodyData setItems(java.util.List<ListDataModelsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDataModelsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
