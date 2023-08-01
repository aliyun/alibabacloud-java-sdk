// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateContainerConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The context path of the Tomcat container. The context path can be an empty string, a null WAR package name, a root directory, or other custom non-empty strings. It can contain letters, digits, hyphens (-), and underscores (\_). Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</p>
     * <p>*   If this parameter is not specified when you configure the Tomcat container for an application, the root directory `/` is used.</p>
     */
    @NameInMap("ContextPath")
    public String contextPath;

    /**
     * <p>The ID of the application instance group.</p>
     * <br>
     * <p>*   If an ID is specified, this operation configures the Tomcat container for the specified application instance group.</p>
     * <p>*   If you set this parameter to "", this operation configures the Tomcat container for the application.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The application port number for the Tomcat container. Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</p>
     * <p>*   If this parameter is not specified when you configure the application, the default port 8080 is applied.</p>
     */
    @NameInMap("HttpPort")
    public Integer httpPort;

    /**
     * <p>The maximum number of threads. Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</p>
     * <p>*   If this parameter is not specified when you configure the application, the default value 250 is applied.</p>
     */
    @NameInMap("MaxThreads")
    public Integer maxThreads;

    /**
     * <p>The uniform resource identifier (URI) encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8. Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</p>
     * <p>*   If this parameter is not specified when you configure the application, the default URI encoding scheme in the Tomcat container is applied.</p>
     */
    @NameInMap("URIEncoding")
    public String URIEncoding;

    /**
     * <p>Specifies whether to use the encoding scheme specified in the request body for URI query parameters. Take note of the following items:</p>
     * <br>
     * <p>*   If this parameter is not specified when you configure the application instance group, the configuration of the application is applied.</p>
     * <p>*   If this parameter is not specified when you configure the application, the default value false is applied.</p>
     */
    @NameInMap("UseBodyEncoding")
    public Boolean useBodyEncoding;

    public static UpdateContainerConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerConfigurationRequest self = new UpdateContainerConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerConfigurationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateContainerConfigurationRequest setContextPath(String contextPath) {
        this.contextPath = contextPath;
        return this;
    }
    public String getContextPath() {
        return this.contextPath;
    }

    public UpdateContainerConfigurationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateContainerConfigurationRequest setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public Integer getHttpPort() {
        return this.httpPort;
    }

    public UpdateContainerConfigurationRequest setMaxThreads(Integer maxThreads) {
        this.maxThreads = maxThreads;
        return this;
    }
    public Integer getMaxThreads() {
        return this.maxThreads;
    }

    public UpdateContainerConfigurationRequest setURIEncoding(String URIEncoding) {
        this.URIEncoding = URIEncoding;
        return this;
    }
    public String getURIEncoding() {
        return this.URIEncoding;
    }

    public UpdateContainerConfigurationRequest setUseBodyEncoding(Boolean useBodyEncoding) {
        this.useBodyEncoding = useBodyEncoding;
        return this;
    }
    public Boolean getUseBodyEncoding() {
        return this.useBodyEncoding;
    }

}
