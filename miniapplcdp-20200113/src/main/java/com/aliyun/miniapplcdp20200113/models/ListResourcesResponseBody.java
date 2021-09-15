// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListResourcesResponseBodyData data;

    public static ListResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponseBody self = new ListResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcesResponseBody setData(ListResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListResourcesResponseBodyData getData() {
        return this.data;
    }

    public static class ListResourcesResponseBodyDataItems extends TeaModel {
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

        public static ListResourcesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyDataItems self = new ListResourcesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListResourcesResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourcesResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public ListResourcesResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListResourcesResponseBodyDataItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourcesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourcesResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public ListResourcesResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListResourcesResponseBodyDataItems setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListResourcesResponseBodyDataItems setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourcesResponseBodyDataItems setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public ListResourcesResponseBodyDataItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

    public static class ListResourcesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListResourcesResponseBodyDataItems> items;

        public static ListResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyData self = new ListResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyData setItems(java.util.List<ListResourcesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
