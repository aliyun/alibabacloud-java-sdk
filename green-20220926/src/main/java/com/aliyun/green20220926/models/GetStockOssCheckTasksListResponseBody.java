// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetStockOssCheckTasksListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Data of the current page.</p>
     */
    @NameInMap("Items")
    public java.util.List<GetStockOssCheckTasksListResponseBodyItems> items;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Backend-assigned ID used to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetStockOssCheckTasksListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStockOssCheckTasksListResponseBody self = new GetStockOssCheckTasksListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStockOssCheckTasksListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetStockOssCheckTasksListResponseBody setItems(java.util.List<GetStockOssCheckTasksListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetStockOssCheckTasksListResponseBodyItems> getItems() {
        return this.items;
    }

    public GetStockOssCheckTasksListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetStockOssCheckTasksListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStockOssCheckTasksListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos extends TeaModel {
        /**
         * <p>Primary service.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        @NameInMap("CopyFrom")
        public String copyFrom;

        /**
         * <p>Whether to copy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCopy")
        public Boolean isCopy;

        /**
         * <p>Service code.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck_01</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>通用基线检测</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos self = new GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos();
            return TeaModel.build(map, self);
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public String getCopyFrom() {
            return this.copyFrom;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos setIsCopy(Boolean isCopy) {
            this.isCopy = isCopy;
            return this;
        }
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetStockOssCheckTasksListResponseBodyItemsConfigUserFreezeConfig extends TeaModel {
        /**
         * <p>Storage path for transfer</p>
         * 
         * <strong>example:</strong>
         * <p>/backup</p>
         */
        @NameInMap("FreezeRestorePath")
        public String freezeRestorePath;

        /**
         * <p>Freeze type</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("FreezeType")
        public String freezeType;

        public static GetStockOssCheckTasksListResponseBodyItemsConfigUserFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStockOssCheckTasksListResponseBodyItemsConfigUserFreezeConfig self = new GetStockOssCheckTasksListResponseBodyItemsConfigUserFreezeConfig();
            return TeaModel.build(map, self);
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfigUserFreezeConfig setFreezeRestorePath(String freezeRestorePath) {
            this.freezeRestorePath = freezeRestorePath;
            return this;
        }
        public String getFreezeRestorePath() {
            return this.freezeRestorePath;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfigUserFreezeConfig setFreezeType(String freezeType) {
            this.freezeType = freezeType;
            return this;
        }
        public String getFreezeType() {
            return this.freezeType;
        }

    }

    public static class GetStockOssCheckTasksListResponseBodyItemsConfig extends TeaModel {
        /**
         * <p>Callback notification ID</p>
         * 
         * <strong>example:</strong>
         * <p>3942</p>
         */
        @NameInMap("CallbackId")
        public Long callbackId;

        /**
         * <p>Whether to deduplicate historical detected tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DistinctHistoryTasks")
        public Boolean distinctHistoryTasks;

        /**
         * <p>End time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-10 11:42:31</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Scheduled task execution date.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteDate")
        public Integer executeDate;

        /**
         * <p>Scheduled task expected execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00:00</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>Whether to freeze</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Freeze")
        public Boolean freeze;

        /**
         * <p>Freeze high-risk images</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreezeHighRisk1")
        public Boolean freezeHighRisk1;

        /**
         * <p>Freeze high-risk audio and text</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreezeHighRisk2")
        public Boolean freezeHighRisk2;

        /**
         * <p>Freeze medium-risk images</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreezeMediumRisk1")
        public Boolean freezeMediumRisk1;

        /**
         * <p>Freeze medium-risk audio and text</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreezeMediumRisk2")
        public Boolean freezeMediumRisk2;

        /**
         * <p>Storage path for transfer</p>
         * 
         * <strong>example:</strong>
         * <p>/backup</p>
         */
        @NameInMap("FreezeRestorePath")
        public String freezeRestorePath;

        /**
         * <p>Freeze type</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("FreezeType")
        public String freezeType;

        /**
         * <p>Prefix filter type.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("PrefixFilterType")
        public String prefixFilterType;

        /**
         * <p>Prefixes.</p>
         */
        @NameInMap("PrefixFilters")
        public java.util.List<String> prefixFilters;

        /**
         * <p>Priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Referer</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Referer")
        public String referer;

        /**
         * <p>Scan limit quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ScanLimit")
        public Long scanLimit;

        /**
         * <p>Whether to scan images without file extensions.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScanNoFileType")
        public Boolean scanNoFileType;

        /**
         * <p>Scanned file type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScanResourceType")
        public Integer scanResourceType;

        /**
         * <p>Scan service code</p>
         */
        @NameInMap("ScanService")
        public java.util.List<String> scanService;

        /**
         * <p>Scan service information</p>
         */
        @NameInMap("ScanServiceInfos")
        public java.util.List<GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos> scanServiceInfos;

        /**
         * <p>Start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-21 15:30:19</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Scheduling date.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskCycle")
        public Integer taskCycle;

        /**
         * <p>Manual freeze configuration</p>
         */
        @NameInMap("UserFreezeConfig")
        public GetStockOssCheckTasksListResponseBodyItemsConfigUserFreezeConfig userFreezeConfig;

        public static GetStockOssCheckTasksListResponseBodyItemsConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStockOssCheckTasksListResponseBodyItemsConfig self = new GetStockOssCheckTasksListResponseBodyItemsConfig();
            return TeaModel.build(map, self);
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setCallbackId(Long callbackId) {
            this.callbackId = callbackId;
            return this;
        }
        public Long getCallbackId() {
            return this.callbackId;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setDistinctHistoryTasks(Boolean distinctHistoryTasks) {
            this.distinctHistoryTasks = distinctHistoryTasks;
            return this;
        }
        public Boolean getDistinctHistoryTasks() {
            return this.distinctHistoryTasks;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setExecuteDate(Integer executeDate) {
            this.executeDate = executeDate;
            return this;
        }
        public Integer getExecuteDate() {
            return this.executeDate;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setFreeze(Boolean freeze) {
            this.freeze = freeze;
            return this;
        }
        public Boolean getFreeze() {
            return this.freeze;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setFreezeHighRisk1(Boolean freezeHighRisk1) {
            this.freezeHighRisk1 = freezeHighRisk1;
            return this;
        }
        public Boolean getFreezeHighRisk1() {
            return this.freezeHighRisk1;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setFreezeHighRisk2(Boolean freezeHighRisk2) {
            this.freezeHighRisk2 = freezeHighRisk2;
            return this;
        }
        public Boolean getFreezeHighRisk2() {
            return this.freezeHighRisk2;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setFreezeMediumRisk1(Boolean freezeMediumRisk1) {
            this.freezeMediumRisk1 = freezeMediumRisk1;
            return this;
        }
        public Boolean getFreezeMediumRisk1() {
            return this.freezeMediumRisk1;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setFreezeMediumRisk2(Boolean freezeMediumRisk2) {
            this.freezeMediumRisk2 = freezeMediumRisk2;
            return this;
        }
        public Boolean getFreezeMediumRisk2() {
            return this.freezeMediumRisk2;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setFreezeRestorePath(String freezeRestorePath) {
            this.freezeRestorePath = freezeRestorePath;
            return this;
        }
        public String getFreezeRestorePath() {
            return this.freezeRestorePath;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setFreezeType(String freezeType) {
            this.freezeType = freezeType;
            return this;
        }
        public String getFreezeType() {
            return this.freezeType;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setPrefixFilterType(String prefixFilterType) {
            this.prefixFilterType = prefixFilterType;
            return this;
        }
        public String getPrefixFilterType() {
            return this.prefixFilterType;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setPrefixFilters(java.util.List<String> prefixFilters) {
            this.prefixFilters = prefixFilters;
            return this;
        }
        public java.util.List<String> getPrefixFilters() {
            return this.prefixFilters;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setReferer(String referer) {
            this.referer = referer;
            return this;
        }
        public String getReferer() {
            return this.referer;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setScanLimit(Long scanLimit) {
            this.scanLimit = scanLimit;
            return this;
        }
        public Long getScanLimit() {
            return this.scanLimit;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setScanNoFileType(Boolean scanNoFileType) {
            this.scanNoFileType = scanNoFileType;
            return this;
        }
        public Boolean getScanNoFileType() {
            return this.scanNoFileType;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setScanResourceType(Integer scanResourceType) {
            this.scanResourceType = scanResourceType;
            return this;
        }
        public Integer getScanResourceType() {
            return this.scanResourceType;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setScanService(java.util.List<String> scanService) {
            this.scanService = scanService;
            return this;
        }
        public java.util.List<String> getScanService() {
            return this.scanService;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setScanServiceInfos(java.util.List<GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos> scanServiceInfos) {
            this.scanServiceInfos = scanServiceInfos;
            return this;
        }
        public java.util.List<GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos> getScanServiceInfos() {
            return this.scanServiceInfos;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setTaskCycle(Integer taskCycle) {
            this.taskCycle = taskCycle;
            return this;
        }
        public Integer getTaskCycle() {
            return this.taskCycle;
        }

        public GetStockOssCheckTasksListResponseBodyItemsConfig setUserFreezeConfig(GetStockOssCheckTasksListResponseBodyItemsConfigUserFreezeConfig userFreezeConfig) {
            this.userFreezeConfig = userFreezeConfig;
            return this;
        }
        public GetStockOssCheckTasksListResponseBodyItemsConfigUserFreezeConfig getUserFreezeConfig() {
            return this.userFreezeConfig;
        }

    }

    public static class GetStockOssCheckTasksListResponseBodyItems extends TeaModel {
        /**
         * <p>Storage space.</p>
         * 
         * <strong>example:</strong>
         * <p>tmp</p>
         */
        @NameInMap("Buckets")
        public String buckets;

        /**
         * <p>Configuration items.</p>
         */
        @NameInMap("Config")
        public GetStockOssCheckTasksListResponseBodyItemsConfig config;

        /**
         * <p>End time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-10 11:42:31</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Number of completed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FinishNum")
        public Long finishNum;

        /**
         * <p>Whether it is a scheduled scan task</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsInc")
        public Boolean isInc;

        /**
         * <p>Next execution time of the scheduled task</p>
         * 
         * <strong>example:</strong>
         * <p>02:00:00</p>
         */
        @NameInMap("LastExecuteDate")
        public String lastExecuteDate;

        /**
         * <p>Media type.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public Integer mediaType;

        /**
         * <p>Last execution time of the scheduled task</p>
         * 
         * <strong>example:</strong>
         * <p>02:00:00</p>
         */
        @NameInMap("NextExecuteDate")
        public String nextExecuteDate;

        /**
         * <p>Total number of files in the bucket</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ObjectNum")
        public Long objectNum;

        /**
         * <p>Number of scan tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SearchNum")
        public Long searchNum;

        /**
         * <p>Start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-21 15:30:19</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Task status.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>P_XHDUS</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Task name.</p>
         * 
         * <strong>example:</strong>
         * <p>图片定时任务20231205135716797</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>Task type</p>
         * 
         * <strong>example:</strong>
         * <p>batch</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static GetStockOssCheckTasksListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetStockOssCheckTasksListResponseBodyItems self = new GetStockOssCheckTasksListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetStockOssCheckTasksListResponseBodyItems setBuckets(String buckets) {
            this.buckets = buckets;
            return this;
        }
        public String getBuckets() {
            return this.buckets;
        }

        public GetStockOssCheckTasksListResponseBodyItems setConfig(GetStockOssCheckTasksListResponseBodyItemsConfig config) {
            this.config = config;
            return this;
        }
        public GetStockOssCheckTasksListResponseBodyItemsConfig getConfig() {
            return this.config;
        }

        public GetStockOssCheckTasksListResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetStockOssCheckTasksListResponseBodyItems setFinishNum(Long finishNum) {
            this.finishNum = finishNum;
            return this;
        }
        public Long getFinishNum() {
            return this.finishNum;
        }

        public GetStockOssCheckTasksListResponseBodyItems setIsInc(Boolean isInc) {
            this.isInc = isInc;
            return this;
        }
        public Boolean getIsInc() {
            return this.isInc;
        }

        public GetStockOssCheckTasksListResponseBodyItems setLastExecuteDate(String lastExecuteDate) {
            this.lastExecuteDate = lastExecuteDate;
            return this;
        }
        public String getLastExecuteDate() {
            return this.lastExecuteDate;
        }

        public GetStockOssCheckTasksListResponseBodyItems setMediaType(Integer mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public Integer getMediaType() {
            return this.mediaType;
        }

        public GetStockOssCheckTasksListResponseBodyItems setNextExecuteDate(String nextExecuteDate) {
            this.nextExecuteDate = nextExecuteDate;
            return this;
        }
        public String getNextExecuteDate() {
            return this.nextExecuteDate;
        }

        public GetStockOssCheckTasksListResponseBodyItems setObjectNum(Long objectNum) {
            this.objectNum = objectNum;
            return this;
        }
        public Long getObjectNum() {
            return this.objectNum;
        }

        public GetStockOssCheckTasksListResponseBodyItems setSearchNum(Long searchNum) {
            this.searchNum = searchNum;
            return this;
        }
        public Long getSearchNum() {
            return this.searchNum;
        }

        public GetStockOssCheckTasksListResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetStockOssCheckTasksListResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetStockOssCheckTasksListResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetStockOssCheckTasksListResponseBodyItems setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetStockOssCheckTasksListResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
