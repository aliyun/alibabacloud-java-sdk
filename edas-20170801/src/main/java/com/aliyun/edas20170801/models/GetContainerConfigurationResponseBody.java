// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetContainerConfigurationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The Tomcat configuration.</p>
     */
    @NameInMap("ContainerConfiguration")
    public GetContainerConfigurationResponseBodyContainerConfiguration containerConfiguration;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34F8-FDG9-*****************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetContainerConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContainerConfigurationResponseBody self = new GetContainerConfigurationResponseBody();
        return TeaModel.build(map, self);
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

    public static class GetContainerConfigurationResponseBodyContainerConfiguration extends TeaModel {
        /**
         * <p>The context path of the Tomcat container.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("ContextPath")
        public String contextPath;

        /**
         * <p>The application port number for the Tomcat container. The value specified in the application configuration is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("HttpPort")
        public Integer httpPort;

        /**
         * <p>The maximum number of threads in the Tomcat container.</p>
         * <ul>
         * <li>If no instance group is specified, the configuration of the application is returned.</li>
         * <li>If no application is specified, the default configuration is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("MaxThreads")
        public Integer maxThreads;

        /**
         * <p>The Uniform Resource Identifier (URI) encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.</p>
         * <ul>
         * <li>If no instance group is specified, the configuration of the application is returned.</li>
         * <li>If no application is specified, the default configuration is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISO-8859-1</p>
         */
        @NameInMap("URIEncoding")
        public String URIEncoding;

        /**
         * <p>Indicates whether useBodyEncodingForURI is enabled in the Tomcat container.</p>
         * <ul>
         * <li>If no instance group is specified, the configuration of the application is returned.</li>
         * <li>If no application is specified, the default configuration is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseBodyEncoding")
        public Boolean useBodyEncoding;

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

        public GetContainerConfigurationResponseBodyContainerConfiguration setHttpPort(Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Integer getHttpPort() {
            return this.httpPort;
        }

        public GetContainerConfigurationResponseBodyContainerConfiguration setMaxThreads(Integer maxThreads) {
            this.maxThreads = maxThreads;
            return this;
        }
        public Integer getMaxThreads() {
            return this.maxThreads;
        }

        public GetContainerConfigurationResponseBodyContainerConfiguration setURIEncoding(String URIEncoding) {
            this.URIEncoding = URIEncoding;
            return this;
        }
        public String getURIEncoding() {
            return this.URIEncoding;
        }

        public GetContainerConfigurationResponseBodyContainerConfiguration setUseBodyEncoding(Boolean useBodyEncoding) {
            this.useBodyEncoding = useBodyEncoding;
            return this;
        }
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

    }

}
