// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateDataModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateDataModelResponseBodyData data;

    public static CreateDataModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataModelResponseBody self = new CreateDataModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataModelResponseBody setData(CreateDataModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataModelResponseBodyData getData() {
        return this.data;
    }

    public static class CreateDataModelResponseBodyData extends TeaModel {
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

        public static CreateDataModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataModelResponseBodyData self = new CreateDataModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataModelResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateDataModelResponseBodyData setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public CreateDataModelResponseBodyData setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public CreateDataModelResponseBodyData setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public CreateDataModelResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateDataModelResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDataModelResponseBodyData setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public CreateDataModelResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateDataModelResponseBodyData setProps(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, ?> getProps() {
            return this.props;
        }

        public CreateDataModelResponseBodyData setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public CreateDataModelResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public CreateDataModelResponseBodyData setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public CreateDataModelResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateDataModelResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public CreateDataModelResponseBodyData setAttributes(java.util.List<java.util.Map<String, ?>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getAttributes() {
            return this.attributes;
        }

    }

}
