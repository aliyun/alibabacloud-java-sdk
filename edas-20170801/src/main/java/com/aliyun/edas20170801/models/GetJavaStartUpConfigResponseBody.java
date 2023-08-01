// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJavaStartUpConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The configuration of Java startup parameters.</p>
     */
    @NameInMap("JavaStartUpConfig")
    public GetJavaStartUpConfigResponseBodyJavaStartUpConfig javaStartUpConfig;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The displayed startup parameter configuration.</p>
         */
        @NameInMap("OriginalConfigs")
        public String originalConfigs;

        /**
         * <p>The effective startup parameter configuration.</p>
         */
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
