// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationListWithMetircsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetApplicationListWithMetircsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetApplicationListWithMetircsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationListWithMetircsResponseBody self = new GetApplicationListWithMetircsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationListWithMetircsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetApplicationListWithMetircsResponseBody setData(GetApplicationListWithMetircsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApplicationListWithMetircsResponseBodyData getData() {
        return this.data;
    }

    public GetApplicationListWithMetircsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetApplicationListWithMetircsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationListWithMetircsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationListWithMetircsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetApplicationListWithMetircsResponseBodyDataResultCurMetrics extends TeaModel {
        @NameInMap("BlockQps")
        public Double blockQps;

        @NameInMap("ExpQps")
        public Double expQps;

        @NameInMap("PassQps")
        public Double passQps;

        @NameInMap("Qps")
        public Double qps;

        @NameInMap("Rt")
        public Double rt;

        @NameInMap("Thread")
        public Double thread;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetApplicationListWithMetircsResponseBodyDataResultCurMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationListWithMetircsResponseBodyDataResultCurMetrics self = new GetApplicationListWithMetircsResponseBodyDataResultCurMetrics();
            return TeaModel.build(map, self);
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetrics setBlockQps(Double blockQps) {
            this.blockQps = blockQps;
            return this;
        }
        public Double getBlockQps() {
            return this.blockQps;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetrics setExpQps(Double expQps) {
            this.expQps = expQps;
            return this;
        }
        public Double getExpQps() {
            return this.expQps;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetrics setPassQps(Double passQps) {
            this.passQps = passQps;
            return this;
        }
        public Double getPassQps() {
            return this.passQps;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetrics setQps(Double qps) {
            this.qps = qps;
            return this;
        }
        public Double getQps() {
            return this.qps;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetrics setRt(Double rt) {
            this.rt = rt;
            return this;
        }
        public Double getRt() {
            return this.rt;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetrics setThread(Double thread) {
            this.thread = thread;
            return this;
        }
        public Double getThread() {
            return this.thread;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetrics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm extends TeaModel {
        @NameInMap("BlockQps")
        public Double blockQps;

        @NameInMap("ExpQps")
        public Double expQps;

        @NameInMap("PassQps")
        public Double passQps;

        @NameInMap("Qps")
        public Double qps;

        @NameInMap("Rt")
        public Double rt;

        @NameInMap("Thread")
        public Double thread;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm self = new GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm();
            return TeaModel.build(map, self);
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm setBlockQps(Double blockQps) {
            this.blockQps = blockQps;
            return this;
        }
        public Double getBlockQps() {
            return this.blockQps;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm setExpQps(Double expQps) {
            this.expQps = expQps;
            return this;
        }
        public Double getExpQps() {
            return this.expQps;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm setPassQps(Double passQps) {
            this.passQps = passQps;
            return this;
        }
        public Double getPassQps() {
            return this.passQps;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm setQps(Double qps) {
            this.qps = qps;
            return this;
        }
        public Double getQps() {
            return this.qps;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm setRt(Double rt) {
            this.rt = rt;
            return this;
        }
        public Double getRt() {
            return this.rt;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm setThread(Double thread) {
            this.thread = thread;
            return this;
        }
        public Double getThread() {
            return this.thread;
        }

        public GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetApplicationListWithMetircsResponseBodyDataResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CurMetrics")
        public java.util.List<GetApplicationListWithMetircsResponseBodyDataResultCurMetrics> curMetrics;

        @NameInMap("CurMetricsFm")
        public GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm curMetricsFm;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("InstancesNumber")
        public Integer instancesNumber;

        @NameInMap("Language")
        public String language;

        @NameInMap("LicenseKey")
        public String licenseKey;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("UserId")
        public String userId;

        public static GetApplicationListWithMetircsResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationListWithMetircsResponseBodyDataResult self = new GetApplicationListWithMetircsResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setCurMetrics(java.util.List<GetApplicationListWithMetircsResponseBodyDataResultCurMetrics> curMetrics) {
            this.curMetrics = curMetrics;
            return this;
        }
        public java.util.List<GetApplicationListWithMetircsResponseBodyDataResultCurMetrics> getCurMetrics() {
            return this.curMetrics;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setCurMetricsFm(GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm curMetricsFm) {
            this.curMetricsFm = curMetricsFm;
            return this;
        }
        public GetApplicationListWithMetircsResponseBodyDataResultCurMetricsFm getCurMetricsFm() {
            return this.curMetricsFm;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setInstancesNumber(Integer instancesNumber) {
            this.instancesNumber = instancesNumber;
            return this;
        }
        public Integer getInstancesNumber() {
            return this.instancesNumber;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public GetApplicationListWithMetircsResponseBodyDataResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetApplicationListWithMetircsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<GetApplicationListWithMetircsResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static GetApplicationListWithMetircsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationListWithMetircsResponseBodyData self = new GetApplicationListWithMetircsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplicationListWithMetircsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetApplicationListWithMetircsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetApplicationListWithMetircsResponseBodyData setResult(java.util.List<GetApplicationListWithMetircsResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetApplicationListWithMetircsResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetApplicationListWithMetircsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
