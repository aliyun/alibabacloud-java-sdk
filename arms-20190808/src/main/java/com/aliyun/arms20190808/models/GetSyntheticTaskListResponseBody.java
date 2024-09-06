// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskListResponseBody extends TeaModel {
    /**
     * <p>The query results.</p>
     */
    @NameInMap("PageInfo")
    public GetSyntheticTaskListResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
     */
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
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1634005438000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of detection points.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MonitorNumber")
        public Long monitorNumber;

        /**
         * <p>The ID of the synthetic monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>2118709</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>net-test</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task is stopped.</li>
         * <li><strong>1</strong>: The task is started.</li>
         * <li><strong>9</strong>: The task is ended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The type of the task. Valid values:</p>
         * <ol>
         * <li>3: web page performance - IE</li>
         * <li>34: web page performance - Chrome</li>
         * <li>0: network quality</li>
         * <li>40: file download</li>
         * <li>7: API performance</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskType")
        public Long taskType;

        /**
         * <p>The name of the task type.</p>
         */
        @NameInMap("TaskTypeName")
        public String taskTypeName;

        /**
         * <p>The URL for synthetic monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The availability. Only the data of the last day is counted. If no data is available for the last day, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0.80</p>
         */
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
        /**
         * <p>Indicates whether the current page is followed by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasNextPage")
        public String hasNextPage;

        /**
         * <p>Indicates whether a previous page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPreviousPage")
        public Boolean hasPreviousPage;

        /**
         * <p>Indicates whether the page is the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFirstPage")
        public Boolean isFirstPage;

        /**
         * <p>Indicates whether the page is the last page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLastPage")
        public Boolean isLastPage;

        /**
         * <p>The task information.</p>
         */
        @NameInMap("List")
        public java.util.List<GetSyntheticTaskListResponseBodyPageInfoList> list;

        /**
         * <p>The first page on the navigation bar.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NavigateFirstPage")
        public String navigateFirstPage;

        /**
         * <p>The last page on the navigation bar.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NavigateLastPage")
        public String navigateLastPage;

        /**
         * <p>All navigation page numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("NavigatePageNums")
        public String navigatePageNums;

        /**
         * <p>The next page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NextPage")
        public String nextPage;

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Pages")
        public String pages;

        /**
         * <p>The previous page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Prepage")
        public String prepage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
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
