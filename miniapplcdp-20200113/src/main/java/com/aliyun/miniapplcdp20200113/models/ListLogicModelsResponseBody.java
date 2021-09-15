// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListLogicModelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListLogicModelsResponseBodyData data;

    public static ListLogicModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogicModelsResponseBody self = new ListLogicModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogicModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogicModelsResponseBody setData(ListLogicModelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLogicModelsResponseBodyData getData() {
        return this.data;
    }

    public static class ListLogicModelsResponseBodyDataItems extends TeaModel {
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

        public static ListLogicModelsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListLogicModelsResponseBodyDataItems self = new ListLogicModelsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListLogicModelsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLogicModelsResponseBodyDataItems setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListLogicModelsResponseBodyDataItems setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListLogicModelsResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public ListLogicModelsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListLogicModelsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLogicModelsResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public ListLogicModelsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListLogicModelsResponseBodyDataItems setProps(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, ?> getProps() {
            return this.props;
        }

        public ListLogicModelsResponseBodyDataItems setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public ListLogicModelsResponseBodyDataItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListLogicModelsResponseBodyDataItems setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public ListLogicModelsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLogicModelsResponseBodyDataItems setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

    public static class ListLogicModelsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListLogicModelsResponseBodyDataItems> items;

        public static ListLogicModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLogicModelsResponseBodyData self = new ListLogicModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLogicModelsResponseBodyData setItems(java.util.List<ListLogicModelsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListLogicModelsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
