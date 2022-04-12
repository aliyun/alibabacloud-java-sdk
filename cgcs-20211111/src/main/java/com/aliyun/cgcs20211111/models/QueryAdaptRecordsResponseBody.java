// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryAdaptRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAdaptRecordsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAdaptRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAdaptRecordsResponseBody self = new QueryAdaptRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAdaptRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAdaptRecordsResponseBody setData(QueryAdaptRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAdaptRecordsResponseBodyData getData() {
        return this.data;
    }

    public QueryAdaptRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAdaptRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget extends TeaModel {
        @NameInMap("BitRate")
        public Integer bitRate;

        @NameInMap("FrameRate")
        public Integer frameRate;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("StartProgram")
        public String startProgram;

        public static QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget self = new QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget setBitRate(Integer bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Integer getBitRate() {
            return this.bitRate;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget setStartProgram(String startProgram) {
            this.startProgram = startProgram;
            return this;
        }
        public String getStartProgram() {
            return this.startProgram;
        }

    }

    public static class QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu extends TeaModel {
        @NameInMap("Average")
        public Double average;

        @NameInMap("Maximum")
        public Double maximum;

        @NameInMap("Minimum")
        public Double minimum;

        @NameInMap("NumberOfCores")
        public Double numberOfCores;

        @NameInMap("Quantile80")
        public Double quantile80;

        public static QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu self = new QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu setAverage(Double average) {
            this.average = average;
            return this;
        }
        public Double getAverage() {
            return this.average;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu setNumberOfCores(Double numberOfCores) {
            this.numberOfCores = numberOfCores;
            return this;
        }
        public Double getNumberOfCores() {
            return this.numberOfCores;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu setQuantile80(Double quantile80) {
            this.quantile80 = quantile80;
            return this;
        }
        public Double getQuantile80() {
            return this.quantile80;
        }

    }

    public static class QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization extends TeaModel {
        @NameInMap("Average")
        public Double average;

        @NameInMap("Maximum")
        public Double maximum;

        @NameInMap("Minimum")
        public Double minimum;

        @NameInMap("NumberOfCores")
        public Double numberOfCores;

        @NameInMap("Quantile80")
        public Double quantile80;

        public static QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization self = new QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization setAverage(Double average) {
            this.average = average;
            return this;
        }
        public Double getAverage() {
            return this.average;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization setNumberOfCores(Double numberOfCores) {
            this.numberOfCores = numberOfCores;
            return this;
        }
        public Double getNumberOfCores() {
            return this.numberOfCores;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization setQuantile80(Double quantile80) {
            this.quantile80 = quantile80;
            return this;
        }
        public Double getQuantile80() {
            return this.quantile80;
        }

    }

    public static class QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization extends TeaModel {
        @NameInMap("Average")
        public Double average;

        @NameInMap("Maximum")
        public Double maximum;

        @NameInMap("Minimum")
        public Double minimum;

        @NameInMap("Quantile80")
        public Double quantile80;

        @NameInMap("Total")
        public Double total;

        public static QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization self = new QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization setAverage(Double average) {
            this.average = average;
            return this;
        }
        public Double getAverage() {
            return this.average;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization setQuantile80(Double quantile80) {
            this.quantile80 = quantile80;
            return this;
        }
        public Double getQuantile80() {
            return this.quantile80;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization setTotal(Double total) {
            this.total = total;
            return this;
        }
        public Double getTotal() {
            return this.total;
        }

    }

    public static class QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpu extends TeaModel {
        @NameInMap("GpuUsedutilization")
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization gpuUsedutilization;

        @NameInMap("MemUsedutilization")
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization memUsedutilization;

        public static QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpu build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpu self = new QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpu();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpu setGpuUsedutilization(QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization gpuUsedutilization) {
            this.gpuUsedutilization = gpuUsedutilization;
            return this;
        }
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuGpuUsedutilization getGpuUsedutilization() {
            return this.gpuUsedutilization;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpu setMemUsedutilization(QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization memUsedutilization) {
            this.memUsedutilization = memUsedutilization;
            return this;
        }
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpuMemUsedutilization getMemUsedutilization() {
            return this.memUsedutilization;
        }

    }

    public static class QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem extends TeaModel {
        @NameInMap("Average")
        public Double average;

        @NameInMap("Maximum")
        public Double maximum;

        @NameInMap("Minimum")
        public Double minimum;

        @NameInMap("Quantile80")
        public Double quantile80;

        @NameInMap("Total")
        public Double total;

        public static QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem self = new QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem setAverage(Double average) {
            this.average = average;
            return this;
        }
        public Double getAverage() {
            return this.average;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem setQuantile80(Double quantile80) {
            this.quantile80 = quantile80;
            return this;
        }
        public Double getQuantile80() {
            return this.quantile80;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem setTotal(Double total) {
            this.total = total;
            return this;
        }
        public Double getTotal() {
            return this.total;
        }

    }

    public static class QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo extends TeaModel {
        @NameInMap("Cpu")
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu cpu;

        @NameInMap("Gpu")
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpu gpu;

        @NameInMap("Mem")
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem mem;

        public static QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo self = new QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo setCpu(QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoCpu getCpu() {
            return this.cpu;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo setGpu(QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpu gpu) {
            this.gpu = gpu;
            return this;
        }
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoGpu getGpu() {
            return this.gpu;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo setMem(QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem mem) {
            this.mem = mem;
            return this;
        }
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfoMem getMem() {
            return this.mem;
        }

    }

    public static class QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo extends TeaModel {
        @NameInMap("CpuType")
        public String cpuType;

        @NameInMap("GpuType")
        public String gpuType;

        @NameInMap("Name")
        public String name;

        public static QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo self = new QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo setCpuType(String cpuType) {
            this.cpuType = cpuType;
            return this;
        }
        public String getCpuType() {
            return this.cpuType;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo setGpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }
        public String getGpuType() {
            return this.gpuType;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryAdaptRecordsResponseBodyDataAdaptRecords extends TeaModel {
        @NameInMap("AdaptApplyId")
        public Long adaptApplyId;

        @NameInMap("AdaptRecordId")
        public Long adaptRecordId;

        @NameInMap("AdaptStatus")
        public String adaptStatus;

        @NameInMap("AdaptTarget")
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget adaptTarget;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppVersionId")
        public String appVersionId;

        @NameInMap("CalculationEvaluationInfo")
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo calculationEvaluationInfo;

        @NameInMap("ConsumeCu")
        public Double consumeCu;

        // 蔚领：1 独占虚机，2 支持多开 (EXCLUSIVE: 独占虚机, SHARED: 支持多开)
        @NameInMap("ContainerType")
        public String containerType;

        @NameInMap("FileDownloadPath")
        public String fileDownloadPath;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("IsMustSelect")
        public Boolean isMustSelect;

        @NameInMap("Isv")
        public String isv;

        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ServerInfo")
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo serverInfo;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("VmType")
        public String vmType;

        public static QueryAdaptRecordsResponseBodyDataAdaptRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyDataAdaptRecords self = new QueryAdaptRecordsResponseBodyDataAdaptRecords();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setAdaptApplyId(Long adaptApplyId) {
            this.adaptApplyId = adaptApplyId;
            return this;
        }
        public Long getAdaptApplyId() {
            return this.adaptApplyId;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setAdaptRecordId(Long adaptRecordId) {
            this.adaptRecordId = adaptRecordId;
            return this;
        }
        public Long getAdaptRecordId() {
            return this.adaptRecordId;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setAdaptStatus(String adaptStatus) {
            this.adaptStatus = adaptStatus;
            return this;
        }
        public String getAdaptStatus() {
            return this.adaptStatus;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setAdaptTarget(QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget adaptTarget) {
            this.adaptTarget = adaptTarget;
            return this;
        }
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsAdaptTarget getAdaptTarget() {
            return this.adaptTarget;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setCalculationEvaluationInfo(QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo calculationEvaluationInfo) {
            this.calculationEvaluationInfo = calculationEvaluationInfo;
            return this;
        }
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsCalculationEvaluationInfo getCalculationEvaluationInfo() {
            return this.calculationEvaluationInfo;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setConsumeCu(Double consumeCu) {
            this.consumeCu = consumeCu;
            return this;
        }
        public Double getConsumeCu() {
            return this.consumeCu;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setContainerType(String containerType) {
            this.containerType = containerType;
            return this;
        }
        public String getContainerType() {
            return this.containerType;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setFileDownloadPath(String fileDownloadPath) {
            this.fileDownloadPath = fileDownloadPath;
            return this;
        }
        public String getFileDownloadPath() {
            return this.fileDownloadPath;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setIsMustSelect(Boolean isMustSelect) {
            this.isMustSelect = isMustSelect;
            return this;
        }
        public Boolean getIsMustSelect() {
            return this.isMustSelect;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setIsv(String isv) {
            this.isv = isv;
            return this;
        }
        public String getIsv() {
            return this.isv;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setServerInfo(QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo serverInfo) {
            this.serverInfo = serverInfo;
            return this;
        }
        public QueryAdaptRecordsResponseBodyDataAdaptRecordsServerInfo getServerInfo() {
            return this.serverInfo;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryAdaptRecordsResponseBodyDataAdaptRecords setVmType(String vmType) {
            this.vmType = vmType;
            return this;
        }
        public String getVmType() {
            return this.vmType;
        }

    }

    public static class QueryAdaptRecordsResponseBodyData extends TeaModel {
        @NameInMap("AdaptApplyId")
        public Long adaptApplyId;

        @NameInMap("AdaptRecords")
        public java.util.List<QueryAdaptRecordsResponseBodyDataAdaptRecords> adaptRecords;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("AppVersionId")
        public String appVersionId;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("AppVersionServiceype")
        public String appVersionServiceype;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        public static QueryAdaptRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAdaptRecordsResponseBodyData self = new QueryAdaptRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAdaptRecordsResponseBodyData setAdaptApplyId(Long adaptApplyId) {
            this.adaptApplyId = adaptApplyId;
            return this;
        }
        public Long getAdaptApplyId() {
            return this.adaptApplyId;
        }

        public QueryAdaptRecordsResponseBodyData setAdaptRecords(java.util.List<QueryAdaptRecordsResponseBodyDataAdaptRecords> adaptRecords) {
            this.adaptRecords = adaptRecords;
            return this;
        }
        public java.util.List<QueryAdaptRecordsResponseBodyDataAdaptRecords> getAdaptRecords() {
            return this.adaptRecords;
        }

        public QueryAdaptRecordsResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryAdaptRecordsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryAdaptRecordsResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public QueryAdaptRecordsResponseBodyData setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public QueryAdaptRecordsResponseBodyData setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public QueryAdaptRecordsResponseBodyData setAppVersionServiceype(String appVersionServiceype) {
            this.appVersionServiceype = appVersionServiceype;
            return this;
        }
        public String getAppVersionServiceype() {
            return this.appVersionServiceype;
        }

        public QueryAdaptRecordsResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryAdaptRecordsResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
