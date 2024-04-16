// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPublishVersionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListPublishVersionsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPublishVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishVersionsResponseBody self = new ListPublishVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishVersionsResponseBody setData(ListPublishVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPublishVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListPublishVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPublishVersionsResponseBodyDataItems extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CompletionTime")
        public String completionTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PublishId")
        public String publishId;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SubTasks")
        public java.util.List<java.util.Map<String, String>> subTasks;

        @NameInMap("VersionNumber")
        public String versionNumber;

        public static ListPublishVersionsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListPublishVersionsResponseBodyDataItems self = new ListPublishVersionsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListPublishVersionsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListPublishVersionsResponseBodyDataItems setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListPublishVersionsResponseBodyDataItems setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public ListPublishVersionsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPublishVersionsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublishVersionsResponseBodyDataItems setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListPublishVersionsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPublishVersionsResponseBodyDataItems setPublishId(String publishId) {
            this.publishId = publishId;
            return this;
        }
        public String getPublishId() {
            return this.publishId;
        }

        public ListPublishVersionsResponseBodyDataItems setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListPublishVersionsResponseBodyDataItems setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public ListPublishVersionsResponseBodyDataItems setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListPublishVersionsResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListPublishVersionsResponseBodyDataItems setSubTasks(java.util.List<java.util.Map<String, String>> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSubTasks() {
            return this.subTasks;
        }

        public ListPublishVersionsResponseBodyDataItems setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

    }

    public static class ListPublishVersionsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListPublishVersionsResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPublishVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPublishVersionsResponseBodyData self = new ListPublishVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPublishVersionsResponseBodyData setItems(java.util.List<ListPublishVersionsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListPublishVersionsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListPublishVersionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPublishVersionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPublishVersionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
