// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppAdaptorConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppAdaptorConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppAdaptorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppAdaptorConfigResponseBody self = new GetAppAdaptorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppAdaptorConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppAdaptorConfigResponseBody setData(GetAppAdaptorConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppAdaptorConfigResponseBodyData getData() {
        return this.data;
    }

    public GetAppAdaptorConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppAdaptorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppAdaptorConfigResponseBodyData extends TeaModel {
        @NameInMap("AppType")
        public String appType;

        @NameInMap("Framerate")
        public String framerate;

        @NameInMap("LoadType")
        public String loadType;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("System")
        public String system;

        public static GetAppAdaptorConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppAdaptorConfigResponseBodyData self = new GetAppAdaptorConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppAdaptorConfigResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetAppAdaptorConfigResponseBodyData setFramerate(String framerate) {
            this.framerate = framerate;
            return this;
        }
        public String getFramerate() {
            return this.framerate;
        }

        public GetAppAdaptorConfigResponseBodyData setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public GetAppAdaptorConfigResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetAppAdaptorConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppAdaptorConfigResponseBodyData setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetAppAdaptorConfigResponseBodyData setSystem(String system) {
            this.system = system;
            return this;
        }
        public String getSystem() {
            return this.system;
        }

    }

}
