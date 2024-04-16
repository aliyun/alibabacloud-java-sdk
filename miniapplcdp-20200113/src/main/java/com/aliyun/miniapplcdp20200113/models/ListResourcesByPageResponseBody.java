// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListResourcesByPageResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListResourcesByPageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListResourcesByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByPageResponseBody self = new ListResourcesByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesByPageResponseBody setData(ListResourcesByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListResourcesByPageResponseBodyData getData() {
        return this.data;
    }

    public ListResourcesByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourcesByPageResponseBodyDataItems extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Content")
        public java.util.Map<String, String> content;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("ResourceDigest")
        public String resourceDigest;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Revision")
        public Integer revision;

        @NameInMap("SchemaVersion")
        public String schemaVersion;

        public static ListResourcesByPageResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesByPageResponseBodyDataItems self = new ListResourcesByPageResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListResourcesByPageResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListResourcesByPageResponseBodyDataItems setContent(java.util.Map<String, String> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, String> getContent() {
            return this.content;
        }

        public ListResourcesByPageResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourcesByPageResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourcesByPageResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListResourcesByPageResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListResourcesByPageResponseBodyDataItems setResourceDigest(String resourceDigest) {
            this.resourceDigest = resourceDigest;
            return this;
        }
        public String getResourceDigest() {
            return this.resourceDigest;
        }

        public ListResourcesByPageResponseBodyDataItems setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourcesByPageResponseBodyDataItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListResourcesByPageResponseBodyDataItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourcesByPageResponseBodyDataItems setRevision(Integer revision) {
            this.revision = revision;
            return this;
        }
        public Integer getRevision() {
            return this.revision;
        }

        public ListResourcesByPageResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

    }

    public static class ListResourcesByPageResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListResourcesByPageResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListResourcesByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesByPageResponseBodyData self = new ListResourcesByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListResourcesByPageResponseBodyData setItems(java.util.List<ListResourcesByPageResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListResourcesByPageResponseBodyDataItems> getItems() {
            return this.items;
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

    }

}
