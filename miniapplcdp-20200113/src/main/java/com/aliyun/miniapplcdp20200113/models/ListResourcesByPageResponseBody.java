// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListResourcesByPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListResourcesByPageResponseBodyData data;

    public static ListResourcesByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByPageResponseBody self = new ListResourcesByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcesByPageResponseBody setData(ListResourcesByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListResourcesByPageResponseBodyData getData() {
        return this.data;
    }

    public static class ListResourcesByPageResponseBodyDataItems extends TeaModel {
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

        public static ListResourcesByPageResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesByPageResponseBodyDataItems self = new ListResourcesByPageResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListResourcesByPageResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListResourcesByPageResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourcesByPageResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public ListResourcesByPageResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListResourcesByPageResponseBodyDataItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourcesByPageResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourcesByPageResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public ListResourcesByPageResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListResourcesByPageResponseBodyDataItems setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListResourcesByPageResponseBodyDataItems setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourcesByPageResponseBodyDataItems setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public ListResourcesByPageResponseBodyDataItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

    public static class ListResourcesByPageResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<ListResourcesByPageResponseBodyDataItems> items;

        public static ListResourcesByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesByPageResponseBodyData self = new ListResourcesByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListResourcesByPageResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListResourcesByPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListResourcesByPageResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListResourcesByPageResponseBodyData setItems(java.util.List<ListResourcesByPageResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListResourcesByPageResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
