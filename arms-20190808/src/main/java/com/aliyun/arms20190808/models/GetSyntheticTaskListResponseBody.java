// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskListResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public GetSyntheticTaskListResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSyntheticTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticTaskListResponseBody self = new GetSyntheticTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSyntheticTaskListResponseBody setPageInfo(GetSyntheticTaskListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetSyntheticTaskListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetSyntheticTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSyntheticTaskListResponseBodyPageInfoList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MonitorNumber")
        public Long monitorNumber;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskType")
        public Long taskType;

        @NameInMap("TaskTypeName")
        public String taskTypeName;

        @NameInMap("Url")
        public String url;

        @NameInMap("Usable")
        public Float usable;

        public static GetSyntheticTaskListResponseBodyPageInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskListResponseBodyPageInfoList self = new GetSyntheticTaskListResponseBodyPageInfoList();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskListResponseBodyPageInfoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSyntheticTaskListResponseBodyPageInfoList setMonitorNumber(Long monitorNumber) {
            this.monitorNumber = monitorNumber;
            return this;
        }
        public Long getMonitorNumber() {
            return this.monitorNumber;
        }

        public GetSyntheticTaskListResponseBodyPageInfoList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetSyntheticTaskListResponseBodyPageInfoList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetSyntheticTaskListResponseBodyPageInfoList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetSyntheticTaskListResponseBodyPageInfoList setTaskType(Long taskType) {
            this.taskType = taskType;
            return this;
        }
        public Long getTaskType() {
            return this.taskType;
        }

        public GetSyntheticTaskListResponseBodyPageInfoList setTaskTypeName(String taskTypeName) {
            this.taskTypeName = taskTypeName;
            return this;
        }
        public String getTaskTypeName() {
            return this.taskTypeName;
        }

        public GetSyntheticTaskListResponseBodyPageInfoList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetSyntheticTaskListResponseBodyPageInfoList setUsable(Float usable) {
            this.usable = usable;
            return this;
        }
        public Float getUsable() {
            return this.usable;
        }

    }

    public static class GetSyntheticTaskListResponseBodyPageInfo extends TeaModel {
        @NameInMap("HasNextPage")
        public String hasNextPage;

        @NameInMap("HasPreviousPage")
        public Boolean hasPreviousPage;

        @NameInMap("IsFirstPage")
        public Boolean isFirstPage;

        @NameInMap("IsLastPage")
        public Boolean isLastPage;

        @NameInMap("List")
        public java.util.List<GetSyntheticTaskListResponseBodyPageInfoList> list;

        @NameInMap("NavigateFirstPage")
        public String navigateFirstPage;

        @NameInMap("NavigateLastPage")
        public String navigateLastPage;

        @NameInMap("NavigatePageNums")
        public String navigatePageNums;

        @NameInMap("NextPage")
        public String nextPage;

        @NameInMap("Pages")
        public String pages;

        @NameInMap("Prepage")
        public String prepage;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Total")
        public Long total;

        public static GetSyntheticTaskListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskListResponseBodyPageInfo self = new GetSyntheticTaskListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskListResponseBodyPageInfo setHasNextPage(String hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public String getHasNextPage() {
            return this.hasNextPage;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setHasPreviousPage(Boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }
        public Boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setIsFirstPage(Boolean isFirstPage) {
            this.isFirstPage = isFirstPage;
            return this;
        }
        public Boolean getIsFirstPage() {
            return this.isFirstPage;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setIsLastPage(Boolean isLastPage) {
            this.isLastPage = isLastPage;
            return this;
        }
        public Boolean getIsLastPage() {
            return this.isLastPage;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setList(java.util.List<GetSyntheticTaskListResponseBodyPageInfoList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetSyntheticTaskListResponseBodyPageInfoList> getList() {
            return this.list;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setNavigateFirstPage(String navigateFirstPage) {
            this.navigateFirstPage = navigateFirstPage;
            return this;
        }
        public String getNavigateFirstPage() {
            return this.navigateFirstPage;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setNavigateLastPage(String navigateLastPage) {
            this.navigateLastPage = navigateLastPage;
            return this;
        }
        public String getNavigateLastPage() {
            return this.navigateLastPage;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setNavigatePageNums(String navigatePageNums) {
            this.navigatePageNums = navigatePageNums;
            return this;
        }
        public String getNavigatePageNums() {
            return this.navigatePageNums;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setNextPage(String nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public String getNextPage() {
            return this.nextPage;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setPages(String pages) {
            this.pages = pages;
            return this;
        }
        public String getPages() {
            return this.pages;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setPrepage(String prepage) {
            this.prepage = prepage;
            return this;
        }
        public String getPrepage() {
            return this.prepage;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetSyntheticTaskListResponseBodyPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
