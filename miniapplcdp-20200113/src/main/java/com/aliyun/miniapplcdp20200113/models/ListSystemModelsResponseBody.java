// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListSystemModelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListSystemModelsResponseBodyData data;

    public static ListSystemModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemModelsResponseBody self = new ListSystemModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSystemModelsResponseBody setData(ListSystemModelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSystemModelsResponseBodyData getData() {
        return this.data;
    }

    public static class ListSystemModelsResponseBodyDataItems extends TeaModel {
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

        public static ListSystemModelsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListSystemModelsResponseBodyDataItems self = new ListSystemModelsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListSystemModelsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSystemModelsResponseBodyDataItems setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListSystemModelsResponseBodyDataItems setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListSystemModelsResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public ListSystemModelsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListSystemModelsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSystemModelsResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public ListSystemModelsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListSystemModelsResponseBodyDataItems setProps(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, ?> getProps() {
            return this.props;
        }

        public ListSystemModelsResponseBodyDataItems setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public ListSystemModelsResponseBodyDataItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListSystemModelsResponseBodyDataItems setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public ListSystemModelsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSystemModelsResponseBodyDataItems setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

    public static class ListSystemModelsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListSystemModelsResponseBodyDataItems> items;

        public static ListSystemModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSystemModelsResponseBodyData self = new ListSystemModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSystemModelsResponseBodyData setItems(java.util.List<ListSystemModelsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListSystemModelsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
