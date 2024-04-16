// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulePublishVersionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListModulePublishVersionsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListModulePublishVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModulePublishVersionsResponseBody self = new ListModulePublishVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModulePublishVersionsResponseBody setData(ListModulePublishVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModulePublishVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListModulePublishVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModulePublishVersionsResponseBodyDataItems extends TeaModel {
        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("PlatformVersion")
        public String platformVersion;

        @NameInMap("PublishId")
        public String publishId;

        @NameInMap("Version")
        public String version;

        public static ListModulePublishVersionsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListModulePublishVersionsResponseBodyDataItems self = new ListModulePublishVersionsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListModulePublishVersionsResponseBodyDataItems setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListModulePublishVersionsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModulePublishVersionsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModulePublishVersionsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListModulePublishVersionsResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModulePublishVersionsResponseBodyDataItems setPlatformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public String getPlatformVersion() {
            return this.platformVersion;
        }

        public ListModulePublishVersionsResponseBodyDataItems setPublishId(String publishId) {
            this.publishId = publishId;
            return this;
        }
        public String getPublishId() {
            return this.publishId;
        }

        public ListModulePublishVersionsResponseBodyDataItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListModulePublishVersionsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListModulePublishVersionsResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListModulePublishVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModulePublishVersionsResponseBodyData self = new ListModulePublishVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModulePublishVersionsResponseBodyData setItems(java.util.List<ListModulePublishVersionsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListModulePublishVersionsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListModulePublishVersionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListModulePublishVersionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListModulePublishVersionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
