// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppAdaptorsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppAdaptorsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAppAdaptorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppAdaptorsResponseBody self = new ListAppAdaptorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppAdaptorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppAdaptorsResponseBody setData(java.util.List<ListAppAdaptorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppAdaptorsResponseBodyData> getData() {
        return this.data;
    }

    public ListAppAdaptorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppAdaptorsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppAdaptorsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppAdaptorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppAdaptorsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppAdaptorsResponseBodyData extends TeaModel {
        @NameInMap("AdaptorMessage")
        public String adaptorMessage;

        @NameInMap("AppInstanceType")
        public String appInstanceType;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Delete")
        public Integer delete;

        @NameInMap("DistributeStatus")
        public Integer distributeStatus;

        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Hardware")
        public String hardware;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("LoadType")
        public String loadType;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("ReportUrl")
        public Long reportUrl;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("RuntimeEnv")
        public Long runtimeEnv;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("VersionName")
        public String versionName;

        @NameInMap("VersionNumber")
        public String versionNumber;

        @NameInMap("VersionUid")
        public String versionUid;

        public static ListAppAdaptorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppAdaptorsResponseBodyData self = new ListAppAdaptorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppAdaptorsResponseBodyData setAdaptorMessage(String adaptorMessage) {
            this.adaptorMessage = adaptorMessage;
            return this;
        }
        public String getAdaptorMessage() {
            return this.adaptorMessage;
        }

        public ListAppAdaptorsResponseBodyData setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public ListAppAdaptorsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppAdaptorsResponseBodyData setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListAppAdaptorsResponseBodyData setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListAppAdaptorsResponseBodyData setDelete(Integer delete) {
            this.delete = delete;
            return this;
        }
        public Integer getDelete() {
            return this.delete;
        }

        public ListAppAdaptorsResponseBodyData setDistributeStatus(Integer distributeStatus) {
            this.distributeStatus = distributeStatus;
            return this;
        }
        public Integer getDistributeStatus() {
            return this.distributeStatus;
        }

        public ListAppAdaptorsResponseBodyData setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public ListAppAdaptorsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppAdaptorsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppAdaptorsResponseBodyData setHardware(String hardware) {
            this.hardware = hardware;
            return this;
        }
        public String getHardware() {
            return this.hardware;
        }

        public ListAppAdaptorsResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListAppAdaptorsResponseBodyData setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public ListAppAdaptorsResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListAppAdaptorsResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAppAdaptorsResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppAdaptorsResponseBodyData setReportUrl(Long reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public Long getReportUrl() {
            return this.reportUrl;
        }

        public ListAppAdaptorsResponseBodyData setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListAppAdaptorsResponseBodyData setRuntimeEnv(Long runtimeEnv) {
            this.runtimeEnv = runtimeEnv;
            return this;
        }
        public Long getRuntimeEnv() {
            return this.runtimeEnv;
        }

        public ListAppAdaptorsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAppAdaptorsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAppAdaptorsResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListAppAdaptorsResponseBodyData setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

        public ListAppAdaptorsResponseBodyData setVersionUid(String versionUid) {
            this.versionUid = versionUid;
            return this;
        }
        public String getVersionUid() {
            return this.versionUid;
        }

    }

}
