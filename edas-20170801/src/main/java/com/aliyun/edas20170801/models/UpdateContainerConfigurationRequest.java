// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateContainerConfigurationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ContextPath")
    public String contextPath;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HttpPort")
    public Integer httpPort;

    @NameInMap("MaxThreads")
    public Integer maxThreads;

    @NameInMap("URIEncoding")
    public String URIEncoding;

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
