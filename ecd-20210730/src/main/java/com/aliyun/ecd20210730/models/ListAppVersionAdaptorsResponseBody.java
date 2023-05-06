// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppVersionAdaptorsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppVersionAdaptorsResponseBodyData> data;

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

    public static ListAppVersionAdaptorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionAdaptorsResponseBody self = new ListAppVersionAdaptorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppVersionAdaptorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppVersionAdaptorsResponseBody setData(java.util.List<ListAppVersionAdaptorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppVersionAdaptorsResponseBodyData> getData() {
        return this.data;
    }

    public ListAppVersionAdaptorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppVersionAdaptorsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppVersionAdaptorsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppVersionAdaptorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppVersionAdaptorsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppVersionAdaptorsResponseBodyData extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Delete")
        public Integer delete;

        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Hardware")
        public String hardware;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Mode")
        public String mode;

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

        public static ListAppVersionAdaptorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppVersionAdaptorsResponseBodyData self = new ListAppVersionAdaptorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppVersionAdaptorsResponseBodyData setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListAppVersionAdaptorsResponseBodyData setDelete(Integer delete) {
            this.delete = delete;
            return this;
        }
        public Integer getDelete() {
            return this.delete;
        }

        public ListAppVersionAdaptorsResponseBodyData setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public ListAppVersionAdaptorsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppVersionAdaptorsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppVersionAdaptorsResponseBodyData setHardware(String hardware) {
            this.hardware = hardware;
            return this;
        }
        public String getHardware() {
            return this.hardware;
        }

        public ListAppVersionAdaptorsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppVersionAdaptorsResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListAppVersionAdaptorsResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppVersionAdaptorsResponseBodyData setReportUrl(Long reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public Long getReportUrl() {
            return this.reportUrl;
        }

        public ListAppVersionAdaptorsResponseBodyData setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListAppVersionAdaptorsResponseBodyData setRuntimeEnv(Long runtimeEnv) {
            this.runtimeEnv = runtimeEnv;
            return this;
        }
        public Long getRuntimeEnv() {
            return this.runtimeEnv;
        }

        public ListAppVersionAdaptorsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
