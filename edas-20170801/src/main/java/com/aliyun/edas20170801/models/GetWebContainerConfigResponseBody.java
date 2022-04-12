// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetWebContainerConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WebContainerConfig")
    public GetWebContainerConfigResponseBodyWebContainerConfig webContainerConfig;

    public static GetWebContainerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebContainerConfigResponseBody self = new GetWebContainerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebContainerConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWebContainerConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWebContainerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebContainerConfigResponseBody setWebContainerConfig(GetWebContainerConfigResponseBodyWebContainerConfig webContainerConfig) {
        this.webContainerConfig = webContainerConfig;
        return this;
    }
    public GetWebContainerConfigResponseBodyWebContainerConfig getWebContainerConfig() {
        return this.webContainerConfig;
    }

    public static class GetWebContainerConfigResponseBodyWebContainerConfig extends TeaModel {
        @NameInMap("ContextInputType")
        public String contextInputType;

        @NameInMap("ContextPath")
        public String contextPath;

        @NameInMap("HttpPort")
        public Integer httpPort;

        @NameInMap("MaxThreads")
        public Integer maxThreads;

        @NameInMap("ServerXml")
        public String serverXml;

        @NameInMap("UriEncoding")
        public String uriEncoding;

        @NameInMap("UseAdvancedServerXml")
        public Boolean useAdvancedServerXml;

        @NameInMap("UseBodyEncoding")
        public Boolean useBodyEncoding;

        @NameInMap("UseDefaultConfig")
        public Boolean useDefaultConfig;

        public static GetWebContainerConfigResponseBodyWebContainerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetWebContainerConfigResponseBodyWebContainerConfig self = new GetWebContainerConfigResponseBodyWebContainerConfig();
            return TeaModel.build(map, self);
        }

        public GetWebContainerConfigResponseBodyWebContainerConfig setContextInputType(String contextInputType) {
            this.contextInputType = contextInputType;
            return this;
        }
        public String getContextInputType() {
            return this.contextInputType;
        }

        public GetWebContainerConfigResponseBodyWebContainerConfig setContextPath(String contextPath) {
            this.contextPath = contextPath;
            return this;
        }
        public String getContextPath() {
            return this.contextPath;
        }

        public GetWebContainerConfigResponseBodyWebContainerConfig setHttpPort(Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Integer getHttpPort() {
            return this.httpPort;
        }

        public GetWebContainerConfigResponseBodyWebContainerConfig setMaxThreads(Integer maxThreads) {
            this.maxThreads = maxThreads;
            return this;
        }
        public Integer getMaxThreads() {
            return this.maxThreads;
        }

        public GetWebContainerConfigResponseBodyWebContainerConfig setServerXml(String serverXml) {
            this.serverXml = serverXml;
            return this;
        }
        public String getServerXml() {
            return this.serverXml;
        }

        public GetWebContainerConfigResponseBodyWebContainerConfig setUriEncoding(String uriEncoding) {
            this.uriEncoding = uriEncoding;
            return this;
        }
        public String getUriEncoding() {
            return this.uriEncoding;
        }

        public GetWebContainerConfigResponseBodyWebContainerConfig setUseAdvancedServerXml(Boolean useAdvancedServerXml) {
            this.useAdvancedServerXml = useAdvancedServerXml;
            return this;
        }
        public Boolean getUseAdvancedServerXml() {
            return this.useAdvancedServerXml;
        }

        public GetWebContainerConfigResponseBodyWebContainerConfig setUseBodyEncoding(Boolean useBodyEncoding) {
            this.useBodyEncoding = useBodyEncoding;
            return this;
        }
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

        public GetWebContainerConfigResponseBodyWebContainerConfig setUseDefaultConfig(Boolean useDefaultConfig) {
            this.useDefaultConfig = useDefaultConfig;
            return this;
        }
        public Boolean getUseDefaultConfig() {
            return this.useDefaultConfig;
        }

    }

}
