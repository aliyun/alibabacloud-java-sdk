// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateContainerConfigurationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The configuration of the Tomcat container.</p>
     */
    @NameInMap("ContainerConfiguration")
    public UpdateContainerConfigurationResponseBodyContainerConfiguration containerConfiguration;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateContainerConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerConfigurationResponseBody self = new UpdateContainerConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContainerConfigurationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateContainerConfigurationResponseBody setContainerConfiguration(UpdateContainerConfigurationResponseBodyContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public UpdateContainerConfigurationResponseBodyContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public UpdateContainerConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContainerConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateContainerConfigurationResponseBodyContainerConfiguration extends TeaModel {
        /**
         * <p>The context path of the Tomcat container.</p>
         */
        @NameInMap("ContextPath")
        public String contextPath;

        /**
         * <p>The application port number for the Tomcat container.</p>
         */
        @NameInMap("HttpPort")
        public Integer httpPort;

        /**
         * <p>The maximum number of threads.</p>
         */
        @NameInMap("MaxThreads")
        public Integer maxThreads;

        /**
         * <p>The URI encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.</p>
         */
        @NameInMap("URIEncoding")
        public String URIEncoding;

        /**
         * <p>Indicates whether useBodyEncodingForURI is enabled.</p>
         */
        @NameInMap("UseBodyEncoding")
        public Boolean useBodyEncoding;

        public static UpdateContainerConfigurationResponseBodyContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerConfigurationResponseBodyContainerConfiguration self = new UpdateContainerConfigurationResponseBodyContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateContainerConfigurationResponseBodyContainerConfiguration setContextPath(String contextPath) {
            this.contextPath = contextPath;
            return this;
        }
        public String getContextPath() {
            return this.contextPath;
        }

        public UpdateContainerConfigurationResponseBodyContainerConfiguration setHttpPort(Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Integer getHttpPort() {
            return this.httpPort;
        }

        public UpdateContainerConfigurationResponseBodyContainerConfiguration setMaxThreads(Integer maxThreads) {
            this.maxThreads = maxThreads;
            return this;
        }
        public Integer getMaxThreads() {
            return this.maxThreads;
        }

        public UpdateContainerConfigurationResponseBodyContainerConfiguration setURIEncoding(String URIEncoding) {
            this.URIEncoding = URIEncoding;
            return this;
        }
        public String getURIEncoding() {
            return this.URIEncoding;
        }

        public UpdateContainerConfigurationResponseBodyContainerConfiguration setUseBodyEncoding(Boolean useBodyEncoding) {
            this.useBodyEncoding = useBodyEncoding;
            return this;
        }
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

    }

}
