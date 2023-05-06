// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListWillDistributeAdaptorAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListWillDistributeAdaptorAppsResponseBodyData> data;

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

    public static ListWillDistributeAdaptorAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWillDistributeAdaptorAppsResponseBody self = new ListWillDistributeAdaptorAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWillDistributeAdaptorAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWillDistributeAdaptorAppsResponseBody setData(java.util.List<ListWillDistributeAdaptorAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWillDistributeAdaptorAppsResponseBodyData> getData() {
        return this.data;
    }

    public ListWillDistributeAdaptorAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWillDistributeAdaptorAppsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListWillDistributeAdaptorAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWillDistributeAdaptorAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWillDistributeAdaptorAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWillDistributeAdaptorAppsResponseBodyData extends TeaModel {
        @NameInMap("AdaptorUid")
        public Long adaptorUid;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppUid")
        public Long appUid;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Description")
        public String description;

        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Hardware")
        public String hardware;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("ImageUid")
        public String imageUid;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("ReportUrl")
        public String reportUrl;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("RuntimeEnv")
        public String runtimeEnv;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("VersionName")
        public String versionName;

        @NameInMap("VersionNumber")
        public String versionNumber;

        @NameInMap("VersionUid")
        public Long versionUid;

        public static ListWillDistributeAdaptorAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWillDistributeAdaptorAppsResponseBodyData self = new ListWillDistributeAdaptorAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setAdaptorUid(Long adaptorUid) {
            this.adaptorUid = adaptorUid;
            return this;
        }
        public Long getAdaptorUid() {
            return this.adaptorUid;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setAppUid(Long appUid) {
            this.appUid = appUid;
            return this;
        }
        public Long getAppUid() {
            return this.appUid;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setHardware(String hardware) {
            this.hardware = hardware;
            return this;
        }
        public String getHardware() {
            return this.hardware;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setImageUid(String imageUid) {
            this.imageUid = imageUid;
            return this;
        }
        public String getImageUid() {
            return this.imageUid;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setReportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public String getReportUrl() {
            return this.reportUrl;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setRuntimeEnv(String runtimeEnv) {
            this.runtimeEnv = runtimeEnv;
            return this;
        }
        public String getRuntimeEnv() {
            return this.runtimeEnv;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

        public ListWillDistributeAdaptorAppsResponseBodyData setVersionUid(Long versionUid) {
            this.versionUid = versionUid;
            return this;
        }
        public Long getVersionUid() {
            return this.versionUid;
        }

    }

}
