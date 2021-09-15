// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPublishesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListPublishesResponseBodyData data;

    public static ListPublishesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishesResponseBody self = new ListPublishesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublishesResponseBody setData(ListPublishesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPublishesResponseBodyData getData() {
        return this.data;
    }

    public static class ListPublishesResponseBodyDataItems extends TeaModel {
        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("CompletionTime")
        public String completionTime;

        @NameInMap("VersionNumber")
        public String versionNumber;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PublishId")
        public String publishId;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Reason")
        public String reason;

        public static ListPublishesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListPublishesResponseBodyDataItems self = new ListPublishesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListPublishesResponseBodyDataItems setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListPublishesResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPublishesResponseBodyDataItems setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListPublishesResponseBodyDataItems setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public ListPublishesResponseBodyDataItems setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

        public ListPublishesResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListPublishesResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPublishesResponseBodyDataItems setPublishId(String publishId) {
            this.publishId = publishId;
            return this;
        }
        public String getPublishId() {
            return this.publishId;
        }

        public ListPublishesResponseBodyDataItems setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public ListPublishesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublishesResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListPublishesResponseBodyDataItems setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListPublishesResponseBodyDataItems setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class ListPublishesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<ListPublishesResponseBodyDataItems> items;

        public static ListPublishesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPublishesResponseBodyData self = new ListPublishesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPublishesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPublishesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPublishesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListPublishesResponseBodyData setItems(java.util.List<ListPublishesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListPublishesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
