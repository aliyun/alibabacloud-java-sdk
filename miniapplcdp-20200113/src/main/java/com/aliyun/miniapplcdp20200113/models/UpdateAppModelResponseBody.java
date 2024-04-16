// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateAppModelResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateAppModelResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppModelResponseBody self = new UpdateAppModelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppModelResponseBody setData(UpdateAppModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAppModelResponseBodyData getData() {
        return this.data;
    }

    public UpdateAppModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAppModelResponseBodyData extends TeaModel {
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

        @NameInMap("ModelDigest")
        public String modelDigest;

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

        public static UpdateAppModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppModelResponseBodyData self = new UpdateAppModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAppModelResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateAppModelResponseBodyData setAttributes(java.util.List<java.util.Map<String, String>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getAttributes() {
            return this.attributes;
        }

        public UpdateAppModelResponseBodyData setContent(java.util.Map<String, String> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, String> getContent() {
            return this.content;
        }

        public UpdateAppModelResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateAppModelResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAppModelResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateAppModelResponseBodyData setLinkModelId(String linkModelId) {
            this.linkModelId = linkModelId;
            return this;
        }
        public String getLinkModelId() {
            return this.linkModelId;
        }

        public UpdateAppModelResponseBodyData setLinkModuleId(String linkModuleId) {
            this.linkModuleId = linkModuleId;
            return this;
        }
        public String getLinkModuleId() {
            return this.linkModuleId;
        }

        public UpdateAppModelResponseBodyData setLinked(Boolean linked) {
            this.linked = linked;
            return this;
        }
        public Boolean getLinked() {
            return this.linked;
        }

        public UpdateAppModelResponseBodyData setModelDigest(String modelDigest) {
            this.modelDigest = modelDigest;
            return this;
        }
        public String getModelDigest() {
            return this.modelDigest;
        }

        public UpdateAppModelResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public UpdateAppModelResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateAppModelResponseBodyData setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public UpdateAppModelResponseBodyData setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public UpdateAppModelResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public UpdateAppModelResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public UpdateAppModelResponseBodyData setProps(java.util.Map<String, String> props) {
            this.props = props;
            return this;
        }
        public java.util.Map<String, String> getProps() {
            return this.props;
        }

        public UpdateAppModelResponseBodyData setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public UpdateAppModelResponseBodyData setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public UpdateAppModelResponseBodyData setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public UpdateAppModelResponseBodyData setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

}
