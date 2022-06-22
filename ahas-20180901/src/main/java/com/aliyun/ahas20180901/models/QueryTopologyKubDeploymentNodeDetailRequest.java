// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubDeploymentNodeDetailRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ConfigurationId")
    public String configurationId;

    @NameInMap("HostConfigurationId")
    public String hostConfigurationId;

    @NameInMap("KubClusterId")
    public String kubClusterId;

    @NameInMap("KubNamespace")
    public String kubNamespace;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    @NameInMap("ViewId")
    public String viewId;

    public static QueryTopologyKubDeploymentNodeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubDeploymentNodeDetailRequest self = new QueryTopologyKubDeploymentNodeDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubDeploymentNodeDetailRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyKubDeploymentNodeDetailRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public QueryTopologyKubDeploymentNodeDetailRequest setHostConfigurationId(String hostConfigurationId) {
        this.hostConfigurationId = hostConfigurationId;
        return this;
    }
    public String getHostConfigurationId() {
        return this.hostConfigurationId;
    }

    public QueryTopologyKubDeploymentNodeDetailRequest setKubClusterId(String kubClusterId) {
        this.kubClusterId = kubClusterId;
        return this;
    }
    public String getKubClusterId() {
        return this.kubClusterId;
    }

    public QueryTopologyKubDeploymentNodeDetailRequest setKubNamespace(String kubNamespace) {
        this.kubNamespace = kubNamespace;
        return this;
    }
    public String getKubNamespace() {
        return this.kubNamespace;
    }

    public QueryTopologyKubDeploymentNodeDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTopologyKubDeploymentNodeDetailRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyKubDeploymentNodeDetailRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public QueryTopologyKubDeploymentNodeDetailRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
