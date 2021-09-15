// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetModelPackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetModelPackResponseBodyData data;

    public static GetModelPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelPackResponseBody self = new GetModelPackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelPackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelPackResponseBody setData(GetModelPackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModelPackResponseBodyData getData() {
        return this.data;
    }

    public static class GetModelPackResponseBodyDataDataModels extends TeaModel {
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

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("Attributes")
        public java.util.List<java.util.Map<String, ?>> attributes;

        public static GetModelPackResponseBodyDataDataModels build(java.util.Map<String, ?> map) throws Exception {
            GetModelPackResponseBodyDataDataModels self = new GetModelPackResponseBodyDataDataModels();
            return TeaModel.build(map, self);
        }

        public GetModelPackResponseBodyDataDataModels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetModelPackResponseBodyDataDataModels setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetModelPackResponseBodyDataDataModels setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetModelPackResponseBodyDataDataModels setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public GetModelPackResponseBodyDataDataModels setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetModelPackResponseBodyDataDataModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModelPackResponseBodyDataDataModels setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public GetModelPackResponseBodyDataDataModels setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetModelPackResponseBodyDataDataModels setProps(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, ?> getProps() {
            return this.props;
        }

        public GetModelPackResponseBodyDataDataModels setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public GetModelPackResponseBodyDataDataModels setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetModelPackResponseBodyDataDataModels setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public GetModelPackResponseBodyDataDataModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public GetModelPackResponseBodyDataDataModels setAttributes(java.util.List<java.util.Map<String, ?>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getAttributes() {
            return this.attributes;
        }

    }

    public static class GetModelPackResponseBodyDataPageModels extends TeaModel {
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

        @NameInMap("ModelId")
        public String modelId;

        public static GetModelPackResponseBodyDataPageModels build(java.util.Map<String, ?> map) throws Exception {
            GetModelPackResponseBodyDataPageModels self = new GetModelPackResponseBodyDataPageModels();
            return TeaModel.build(map, self);
        }

        public GetModelPackResponseBodyDataPageModels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetModelPackResponseBodyDataPageModels setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetModelPackResponseBodyDataPageModels setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetModelPackResponseBodyDataPageModels setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public GetModelPackResponseBodyDataPageModels setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetModelPackResponseBodyDataPageModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModelPackResponseBodyDataPageModels setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public GetModelPackResponseBodyDataPageModels setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetModelPackResponseBodyDataPageModels setProps(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, ?> getProps() {
            return this.props;
        }

        public GetModelPackResponseBodyDataPageModels setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public GetModelPackResponseBodyDataPageModels setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetModelPackResponseBodyDataPageModels setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public GetModelPackResponseBodyDataPageModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

    public static class GetModelPackResponseBodyDataLogicModels extends TeaModel {
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

        @NameInMap("ModelId")
        public String modelId;

        public static GetModelPackResponseBodyDataLogicModels build(java.util.Map<String, ?> map) throws Exception {
            GetModelPackResponseBodyDataLogicModels self = new GetModelPackResponseBodyDataLogicModels();
            return TeaModel.build(map, self);
        }

        public GetModelPackResponseBodyDataLogicModels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetModelPackResponseBodyDataLogicModels setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetModelPackResponseBodyDataLogicModels setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetModelPackResponseBodyDataLogicModels setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public GetModelPackResponseBodyDataLogicModels setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetModelPackResponseBodyDataLogicModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModelPackResponseBodyDataLogicModels setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public GetModelPackResponseBodyDataLogicModels setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetModelPackResponseBodyDataLogicModels setProps(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, ?> getProps() {
            return this.props;
        }

        public GetModelPackResponseBodyDataLogicModels setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public GetModelPackResponseBodyDataLogicModels setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetModelPackResponseBodyDataLogicModels setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public GetModelPackResponseBodyDataLogicModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

    public static class GetModelPackResponseBodyDataAppModel extends TeaModel {
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

        @NameInMap("ModelId")
        public String modelId;

        public static GetModelPackResponseBodyDataAppModel build(java.util.Map<String, ?> map) throws Exception {
            GetModelPackResponseBodyDataAppModel self = new GetModelPackResponseBodyDataAppModel();
            return TeaModel.build(map, self);
        }

        public GetModelPackResponseBodyDataAppModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetModelPackResponseBodyDataAppModel setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetModelPackResponseBodyDataAppModel setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetModelPackResponseBodyDataAppModel setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public GetModelPackResponseBodyDataAppModel setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetModelPackResponseBodyDataAppModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModelPackResponseBodyDataAppModel setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public GetModelPackResponseBodyDataAppModel setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetModelPackResponseBodyDataAppModel setProps(java.util.Map<String, ?> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, ?> getProps() {
            return this.props;
        }

        public GetModelPackResponseBodyDataAppModel setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public GetModelPackResponseBodyDataAppModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetModelPackResponseBodyDataAppModel setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public GetModelPackResponseBodyDataAppModel setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

    public static class GetModelPackResponseBodyData extends TeaModel {
        @NameInMap("DataModels")
        public java.util.List<GetModelPackResponseBodyDataDataModels> dataModels;

        @NameInMap("PageModels")
        public java.util.List<GetModelPackResponseBodyDataPageModels> pageModels;

        @NameInMap("LogicModels")
        public java.util.List<GetModelPackResponseBodyDataLogicModels> logicModels;

        @NameInMap("AppModel")
        public GetModelPackResponseBodyDataAppModel appModel;

        public static GetModelPackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModelPackResponseBodyData self = new GetModelPackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModelPackResponseBodyData setDataModels(java.util.List<GetModelPackResponseBodyDataDataModels> dataModels) {
            this.dataModels = dataModels;
            return this;
        }
        public java.util.List<GetModelPackResponseBodyDataDataModels> getDataModels() {
            return this.dataModels;
        }

        public GetModelPackResponseBodyData setPageModels(java.util.List<GetModelPackResponseBodyDataPageModels> pageModels) {
            this.pageModels = pageModels;
            return this;
        }
        public java.util.List<GetModelPackResponseBodyDataPageModels> getPageModels() {
            return this.pageModels;
        }

        public GetModelPackResponseBodyData setLogicModels(java.util.List<GetModelPackResponseBodyDataLogicModels> logicModels) {
            this.logicModels = logicModels;
            return this;
        }
        public java.util.List<GetModelPackResponseBodyDataLogicModels> getLogicModels() {
            return this.logicModels;
        }

        public GetModelPackResponseBodyData setAppModel(GetModelPackResponseBodyDataAppModel appModel) {
            this.appModel = appModel;
            return this;
        }
        public GetModelPackResponseBodyDataAppModel getAppModel() {
            return this.appModel;
        }

    }

}
