// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchDeleteResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BatchDeleteResourcesResponseBodyData data;

    public static BatchDeleteResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteResourcesResponseBody self = new BatchDeleteResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteResourcesResponseBody setData(BatchDeleteResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchDeleteResourcesResponseBodyData getData() {
        return this.data;
    }

    public static class BatchDeleteResourcesResponseBodyDataItems extends TeaModel {
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

        public static BatchDeleteResourcesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteResourcesResponseBodyDataItems self = new BatchDeleteResourcesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public BatchDeleteResourcesResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public BatchDeleteResourcesResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public BatchDeleteResourcesResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public BatchDeleteResourcesResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public BatchDeleteResourcesResponseBodyDataItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public BatchDeleteResourcesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchDeleteResourcesResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public BatchDeleteResourcesResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public BatchDeleteResourcesResponseBodyDataItems setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public BatchDeleteResourcesResponseBodyDataItems setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public BatchDeleteResourcesResponseBodyDataItems setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public BatchDeleteResourcesResponseBodyDataItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

    public static class BatchDeleteResourcesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<BatchDeleteResourcesResponseBodyDataItems> items;

        public static BatchDeleteResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteResourcesResponseBodyData self = new BatchDeleteResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchDeleteResourcesResponseBodyData setItems(java.util.List<BatchDeleteResourcesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<BatchDeleteResourcesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
