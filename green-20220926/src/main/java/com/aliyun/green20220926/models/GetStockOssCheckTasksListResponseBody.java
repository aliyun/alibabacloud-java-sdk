// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetStockOssCheckTasksListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<GetStockOssCheckTasksListResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        @NameInMap("CopyFrom")
        public String copyFrom;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCopy")
        public Boolean isCopy;

        /**
         * <strong>example:</strong>
         * <p>baselineCheck_01</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

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
        @NameInMap("FreezeRestorePath")
        public String freezeRestorePath;

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
        @NameInMap("CallbackId")
        public Long callbackId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DistinctHistoryTasks")
        public Boolean distinctHistoryTasks;

        /**
         * <strong>example:</strong>
         * <p>2024-01-10 11:42:31</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteDate")
        public Integer executeDate;

        /**
         * <strong>example:</strong>
         * <p>02:00:00</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        @NameInMap("Freeze")
        public Boolean freeze;

        @NameInMap("FreezeHighRisk1")
        public Boolean freezeHighRisk1;

        @NameInMap("FreezeHighRisk2")
        public Boolean freezeHighRisk2;

        @NameInMap("FreezeMediumRisk1")
        public Boolean freezeMediumRisk1;

        @NameInMap("FreezeMediumRisk2")
        public Boolean freezeMediumRisk2;

        @NameInMap("FreezeRestorePath")
        public String freezeRestorePath;

        @NameInMap("FreezeType")
        public String freezeType;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("PrefixFilterType")
        public String prefixFilterType;

        @NameInMap("PrefixFilters")
        public java.util.List<String> prefixFilters;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Referer")
        public String referer;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ScanLimit")
        public Long scanLimit;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScanNoFileType")
        public Boolean scanNoFileType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScanResourceType")
        public Integer scanResourceType;

        @NameInMap("ScanService")
        public java.util.List<String> scanService;

        @NameInMap("ScanServiceInfos")
        public java.util.List<GetStockOssCheckTasksListResponseBodyItemsConfigScanServiceInfos> scanServiceInfos;

        /**
         * <strong>example:</strong>
         * <p>2023-12-21 15:30:19</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskCycle")
        public Integer taskCycle;

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
         * <strong>example:</strong>
         * <p>tmp</p>
         */
        @NameInMap("Buckets")
        public String buckets;

        @NameInMap("Config")
        public GetStockOssCheckTasksListResponseBodyItemsConfig config;

        /**
         * <strong>example:</strong>
         * <p>2024-01-10 11:42:31</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FinishNum")
        public Long finishNum;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsInc")
        public Boolean isInc;

        /**
         * <strong>example:</strong>
         * <p>02:00:00</p>
         */
        @NameInMap("LastExecuteDate")
        public String lastExecuteDate;

        /**
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public Integer mediaType;

        /**
         * <strong>example:</strong>
         * <p>02:00:00</p>
         */
        @NameInMap("NextExecuteDate")
        public String nextExecuteDate;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ObjectNum")
        public Long objectNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SearchNum")
        public Long searchNum;

        /**
         * <strong>example:</strong>
         * <p>2023-12-21 15:30:19</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>P_XHDUS</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        /**
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
