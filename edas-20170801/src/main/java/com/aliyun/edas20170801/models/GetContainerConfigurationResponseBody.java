// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetContainerConfigurationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("ContainerConfiguration")
    public GetContainerConfigurationResponseBodyContainerConfiguration containerConfiguration;

    public static GetContainerConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContainerConfigurationResponseBody self = new GetContainerConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContainerConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContainerConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContainerConfigurationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetContainerConfigurationResponseBody setContainerConfiguration(GetContainerConfigurationResponseBodyContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public GetContainerConfigurationResponseBodyContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public static class GetContainerConfigurationResponseBodyContainerConfiguration extends TeaModel {
        @NameInMap("ContextPath")
        public String contextPath;

        @NameInMap("URIEncoding")
        public String URIEncoding;

        @NameInMap("HttpPort")
        public Integer httpPort;

        @NameInMap("UseBodyEncoding")
        public Boolean useBodyEncoding;

        @NameInMap("MaxThreads")
        public Integer maxThreads;

        public static GetContainerConfigurationResponseBodyContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetContainerConfigurationResponseBodyContainerConfiguration self = new GetContainerConfigurationResponseBodyContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public GetContainerConfigurationResponseBodyContainerConfiguration setContextPath(String contextPath) {
            this.contextPath = contextPath;
            return this;
        }
        public String getContextPath() {
            return this.contextPath;
        }

        public GetContainerConfigurationResponseBodyContainerConfiguration setURIEncoding(String URIEncoding) {
            this.URIEncoding = URIEncoding;
            return this;
        }
        public String getURIEncoding() {
            return this.URIEncoding;
        }

        public GetContainerConfigurationResponseBodyContainerConfiguration setHttpPort(Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Integer getHttpPort() {
            return this.httpPort;
        }

        public GetContainerConfigurationResponseBodyContainerConfiguration setUseBodyEncoding(Boolean useBodyEncoding) {
            this.useBodyEncoding = useBodyEncoding;
            return this;
        }
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

        public GetContainerConfigurationResponseBodyContainerConfiguration setMaxThreads(Integer maxThreads) {
            this.maxThreads = maxThreads;
            return this;
        }
        public Integer getMaxThreads() {
            return this.maxThreads;
        }

    }

}
