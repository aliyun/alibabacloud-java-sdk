// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJavaStartUpConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("JavaStartUpConfig")
    public GetJavaStartUpConfigResponseBodyJavaStartUpConfig javaStartUpConfig;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetJavaStartUpConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJavaStartUpConfigResponseBody self = new GetJavaStartUpConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJavaStartUpConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJavaStartUpConfigResponseBody setJavaStartUpConfig(GetJavaStartUpConfigResponseBodyJavaStartUpConfig javaStartUpConfig) {
        this.javaStartUpConfig = javaStartUpConfig;
        return this;
    }
    public GetJavaStartUpConfigResponseBodyJavaStartUpConfig getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    public GetJavaStartUpConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJavaStartUpConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJavaStartUpConfigResponseBodyJavaStartUpConfig extends TeaModel {
        @NameInMap("OriginalConfigs")
        public String originalConfigs;

        @NameInMap("StartUpArgs")
        public String startUpArgs;

        public static GetJavaStartUpConfigResponseBodyJavaStartUpConfig build(java.util.Map<String, ?> map) throws Exception {
            GetJavaStartUpConfigResponseBodyJavaStartUpConfig self = new GetJavaStartUpConfigResponseBodyJavaStartUpConfig();
            return TeaModel.build(map, self);
        }

        public GetJavaStartUpConfigResponseBodyJavaStartUpConfig setOriginalConfigs(String originalConfigs) {
            this.originalConfigs = originalConfigs;
            return this;
        }
        public String getOriginalConfigs() {
            return this.originalConfigs;
        }

        public GetJavaStartUpConfigResponseBodyJavaStartUpConfig setStartUpArgs(String startUpArgs) {
            this.startUpArgs = startUpArgs;
            return this;
        }
        public String getStartUpArgs() {
            return this.startUpArgs;
        }

    }

}
