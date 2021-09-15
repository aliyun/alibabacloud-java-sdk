// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateResourceContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UpdateResourceContentResponseBodyData data;

    public static UpdateResourceContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceContentResponseBody self = new UpdateResourceContentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResourceContentResponseBody setData(UpdateResourceContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateResourceContentResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateResourceContentResponseBodyData extends TeaModel {
        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Revision")
        public Integer revision;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Description")
        public String description;

        @NameInMap("SchemaVersion")
        public String schemaVersion;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Content")
        public java.util.Map<String, ?> content;

        @NameInMap("ResourceName")
        public String resourceName;

        public static UpdateResourceContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceContentResponseBodyData self = new UpdateResourceContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateResourceContentResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public UpdateResourceContentResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateResourceContentResponseBodyData setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public UpdateResourceContentResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public UpdateResourceContentResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public UpdateResourceContentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateResourceContentResponseBodyData setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public UpdateResourceContentResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateResourceContentResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public UpdateResourceContentResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateResourceContentResponseBodyData setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public UpdateResourceContentResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

}
