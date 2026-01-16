// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckTaskInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{\&quot;Bucket\&quot;:\&quot;aileshijie\&quot;,\&quot;Region\&quot;:\&quot;cn-hangzhou\&quot;}]</p>
     */
    @NameInMap("Buckets")
    public String buckets;

    @NameInMap("Config")
    public GetOssCheckTaskInfoResponseBodyConfig config;

    /**
     * <strong>example:</strong>
     * <p>2025-07-09 10:30:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>56</p>
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
     * <p>2025-07-09 10:30:00</p>
     */
    @NameInMap("LastExecuteDate")
    public String lastExecuteDate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MediaType")
    public Integer mediaType;

    /**
     * <strong>example:</strong>
     * <p>2025-07-08 10:30:00</p>
     */
    @NameInMap("NextExecuteDate")
    public String nextExecuteDate;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ObjectNum")
    public Long objectNum;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SearchNum")
    public Long searchNum;

    /**
     * <strong>example:</strong>
     * <p>2023-08-21 16:08:38</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>increment</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetOssCheckTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckTaskInfoResponseBody self = new GetOssCheckTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssCheckTaskInfoResponseBody setBuckets(String buckets) {
        this.buckets = buckets;
        return this;
    }
    public String getBuckets() {
        return this.buckets;
    }

    public GetOssCheckTaskInfoResponseBody setConfig(GetOssCheckTaskInfoResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetOssCheckTaskInfoResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetOssCheckTaskInfoResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetOssCheckTaskInfoResponseBody setFinishNum(Long finishNum) {
        this.finishNum = finishNum;
        return this;
    }
    public Long getFinishNum() {
        return this.finishNum;
    }

    public GetOssCheckTaskInfoResponseBody setIsInc(Boolean isInc) {
        this.isInc = isInc;
        return this;
    }
    public Boolean getIsInc() {
        return this.isInc;
    }

    public GetOssCheckTaskInfoResponseBody setLastExecuteDate(String lastExecuteDate) {
        this.lastExecuteDate = lastExecuteDate;
        return this;
    }
    public String getLastExecuteDate() {
        return this.lastExecuteDate;
    }

    public GetOssCheckTaskInfoResponseBody setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public Integer getMediaType() {
        return this.mediaType;
    }

    public GetOssCheckTaskInfoResponseBody setNextExecuteDate(String nextExecuteDate) {
        this.nextExecuteDate = nextExecuteDate;
        return this;
    }
    public String getNextExecuteDate() {
        return this.nextExecuteDate;
    }

    public GetOssCheckTaskInfoResponseBody setObjectNum(Long objectNum) {
        this.objectNum = objectNum;
        return this;
    }
    public Long getObjectNum() {
        return this.objectNum;
    }

    public GetOssCheckTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssCheckTaskInfoResponseBody setSearchNum(Long searchNum) {
        this.searchNum = searchNum;
        return this;
    }
    public Long getSearchNum() {
        return this.searchNum;
    }

    public GetOssCheckTaskInfoResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetOssCheckTaskInfoResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetOssCheckTaskInfoResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetOssCheckTaskInfoResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GetOssCheckTaskInfoResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public static class GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss_baselineCheck</p>
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
         * <p>oss_baselineCheck</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        @NameInMap("ServiceName")
        public String serviceName;

        public static GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos self = new GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos();
            return TeaModel.build(map, self);
        }

        public GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public String getCopyFrom() {
            return this.copyFrom;
        }

        public GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos setIsCopy(Boolean isCopy) {
            this.isCopy = isCopy;
            return this;
        }
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        public GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetOssCheckTaskInfoResponseBodyConfigUserFreezeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FreezeRestorePath")
        public String freezeRestorePath;

        /**
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("FreezeType")
        public String freezeType;

        public static GetOssCheckTaskInfoResponseBodyConfigUserFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckTaskInfoResponseBodyConfigUserFreezeConfig self = new GetOssCheckTaskInfoResponseBodyConfigUserFreezeConfig();
            return TeaModel.build(map, self);
        }

        public GetOssCheckTaskInfoResponseBodyConfigUserFreezeConfig setFreezeRestorePath(String freezeRestorePath) {
            this.freezeRestorePath = freezeRestorePath;
            return this;
        }
        public String getFreezeRestorePath() {
            return this.freezeRestorePath;
        }

        public GetOssCheckTaskInfoResponseBodyConfigUserFreezeConfig setFreezeType(String freezeType) {
            this.freezeType = freezeType;
            return this;
        }
        public String getFreezeType() {
            return this.freezeType;
        }

    }

    public static class GetOssCheckTaskInfoResponseBodyConfig extends TeaModel {
        @NameInMap("BucketPrefixFilterConfig")
        public java.util.Map<String, ConfigBucketPrefixFilterConfigValue> bucketPrefixFilterConfig;

        /**
         * <strong>example:</strong>
         * <p>188</p>
         */
        @NameInMap("CallbackId")
        public Long callbackId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DistinctHistoryTasks")
        public Boolean distinctHistoryTasks;

        /**
         * <strong>example:</strong>
         * <p>2025-07-09 10:30:00</p>
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
         * <p>2025-07-09 10:30:00</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Freeze")
        public Boolean freeze;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreezeHighRisk1")
        public Boolean freezeHighRisk1;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreezeHighRisk2")
        public Boolean freezeHighRisk2;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreezeMediumRisk1")
        public Boolean freezeMediumRisk1;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FreezeMediumRisk2")
        public Boolean freezeMediumRisk2;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FreezeRestorePath")
        public String freezeRestorePath;

        /**
         * <strong>example:</strong>
         * <p>ACL</p>
         */
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

        /**
         * <p>Referer。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com/">https://www.aliyun.com/</a></p>
         */
        @NameInMap("Referer")
        public String referer;

        /**
         * <strong>example:</strong>
         * <p>100</p>
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
        public java.util.List<GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos> scanServiceInfos;

        /**
         * <strong>example:</strong>
         * <p>2023-08-21 16:08:38</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskCycle")
        public Integer taskCycle;

        @NameInMap("UserFreezeConfig")
        public GetOssCheckTaskInfoResponseBodyConfigUserFreezeConfig userFreezeConfig;

        public static GetOssCheckTaskInfoResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckTaskInfoResponseBodyConfig self = new GetOssCheckTaskInfoResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetOssCheckTaskInfoResponseBodyConfig setBucketPrefixFilterConfig(java.util.Map<String, ConfigBucketPrefixFilterConfigValue> bucketPrefixFilterConfig) {
            this.bucketPrefixFilterConfig = bucketPrefixFilterConfig;
            return this;
        }
        public java.util.Map<String, ConfigBucketPrefixFilterConfigValue> getBucketPrefixFilterConfig() {
            return this.bucketPrefixFilterConfig;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setCallbackId(Long callbackId) {
            this.callbackId = callbackId;
            return this;
        }
        public Long getCallbackId() {
            return this.callbackId;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setDistinctHistoryTasks(Boolean distinctHistoryTasks) {
            this.distinctHistoryTasks = distinctHistoryTasks;
            return this;
        }
        public Boolean getDistinctHistoryTasks() {
            return this.distinctHistoryTasks;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setExecuteDate(Integer executeDate) {
            this.executeDate = executeDate;
            return this;
        }
        public Integer getExecuteDate() {
            return this.executeDate;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setFreeze(Boolean freeze) {
            this.freeze = freeze;
            return this;
        }
        public Boolean getFreeze() {
            return this.freeze;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setFreezeHighRisk1(Boolean freezeHighRisk1) {
            this.freezeHighRisk1 = freezeHighRisk1;
            return this;
        }
        public Boolean getFreezeHighRisk1() {
            return this.freezeHighRisk1;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setFreezeHighRisk2(Boolean freezeHighRisk2) {
            this.freezeHighRisk2 = freezeHighRisk2;
            return this;
        }
        public Boolean getFreezeHighRisk2() {
            return this.freezeHighRisk2;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setFreezeMediumRisk1(Boolean freezeMediumRisk1) {
            this.freezeMediumRisk1 = freezeMediumRisk1;
            return this;
        }
        public Boolean getFreezeMediumRisk1() {
            return this.freezeMediumRisk1;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setFreezeMediumRisk2(Boolean freezeMediumRisk2) {
            this.freezeMediumRisk2 = freezeMediumRisk2;
            return this;
        }
        public Boolean getFreezeMediumRisk2() {
            return this.freezeMediumRisk2;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setFreezeRestorePath(String freezeRestorePath) {
            this.freezeRestorePath = freezeRestorePath;
            return this;
        }
        public String getFreezeRestorePath() {
            return this.freezeRestorePath;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setFreezeType(String freezeType) {
            this.freezeType = freezeType;
            return this;
        }
        public String getFreezeType() {
            return this.freezeType;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setPrefixFilterType(String prefixFilterType) {
            this.prefixFilterType = prefixFilterType;
            return this;
        }
        public String getPrefixFilterType() {
            return this.prefixFilterType;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setPrefixFilters(java.util.List<String> prefixFilters) {
            this.prefixFilters = prefixFilters;
            return this;
        }
        public java.util.List<String> getPrefixFilters() {
            return this.prefixFilters;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setReferer(String referer) {
            this.referer = referer;
            return this;
        }
        public String getReferer() {
            return this.referer;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setScanLimit(Long scanLimit) {
            this.scanLimit = scanLimit;
            return this;
        }
        public Long getScanLimit() {
            return this.scanLimit;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setScanNoFileType(Boolean scanNoFileType) {
            this.scanNoFileType = scanNoFileType;
            return this;
        }
        public Boolean getScanNoFileType() {
            return this.scanNoFileType;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setScanResourceType(Integer scanResourceType) {
            this.scanResourceType = scanResourceType;
            return this;
        }
        public Integer getScanResourceType() {
            return this.scanResourceType;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setScanService(java.util.List<String> scanService) {
            this.scanService = scanService;
            return this;
        }
        public java.util.List<String> getScanService() {
            return this.scanService;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setScanServiceInfos(java.util.List<GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos> scanServiceInfos) {
            this.scanServiceInfos = scanServiceInfos;
            return this;
        }
        public java.util.List<GetOssCheckTaskInfoResponseBodyConfigScanServiceInfos> getScanServiceInfos() {
            return this.scanServiceInfos;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setTaskCycle(Integer taskCycle) {
            this.taskCycle = taskCycle;
            return this;
        }
        public Integer getTaskCycle() {
            return this.taskCycle;
        }

        public GetOssCheckTaskInfoResponseBodyConfig setUserFreezeConfig(GetOssCheckTaskInfoResponseBodyConfigUserFreezeConfig userFreezeConfig) {
            this.userFreezeConfig = userFreezeConfig;
            return this;
        }
        public GetOssCheckTaskInfoResponseBodyConfigUserFreezeConfig getUserFreezeConfig() {
            return this.userFreezeConfig;
        }

    }

}
