// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppAdaptorReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppAdaptorReportResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppAdaptorReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppAdaptorReportResponseBody self = new GetAppAdaptorReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppAdaptorReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppAdaptorReportResponseBody setData(GetAppAdaptorReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppAdaptorReportResponseBodyData getData() {
        return this.data;
    }

    public GetAppAdaptorReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppAdaptorReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppAdaptorReportResponseBodyData extends TeaModel {
        @NameInMap("AdaptorUid")
        public String adaptorUid;

        @NameInMap("AppInstanceType")
        public String appInstanceType;

        @NameInMap("AppScript")
        public String appScript;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("FrameRate")
        public String frameRate;

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

        @NameInMap("Resolution")
        public String resolution;

        public static GetAppAdaptorReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppAdaptorReportResponseBodyData self = new GetAppAdaptorReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppAdaptorReportResponseBodyData setAdaptorUid(String adaptorUid) {
            this.adaptorUid = adaptorUid;
            return this;
        }
        public String getAdaptorUid() {
            return this.adaptorUid;
        }

        public GetAppAdaptorReportResponseBodyData setAppInstanceType(String appInstanceType) {
            this.appInstanceType = appInstanceType;
            return this;
        }
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        public GetAppAdaptorReportResponseBodyData setAppScript(String appScript) {
            this.appScript = appScript;
            return this;
        }
        public String getAppScript() {
            return this.appScript;
        }

        public GetAppAdaptorReportResponseBodyData setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public GetAppAdaptorReportResponseBodyData setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetAppAdaptorReportResponseBodyData setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public GetAppAdaptorReportResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetAppAdaptorReportResponseBodyData setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public GetAppAdaptorReportResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetAppAdaptorReportResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public GetAppAdaptorReportResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetAppAdaptorReportResponseBodyData setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

    }

}
