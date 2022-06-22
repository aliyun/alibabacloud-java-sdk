// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyNodeDetailRequest extends TeaModel {
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

    public static QueryTopologyNodeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyNodeDetailRequest self = new QueryTopologyNodeDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyNodeDetailRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyNodeDetailRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public QueryTopologyNodeDetailRequest setHostConfigurationId(String hostConfigurationId) {
        this.hostConfigurationId = hostConfigurationId;
        return this;
    }
    public String getHostConfigurationId() {
        return this.hostConfigurationId;
    }

    public QueryTopologyNodeDetailRequest setKubClusterId(String kubClusterId) {
        this.kubClusterId = kubClusterId;
        return this;
    }
    public String getKubClusterId() {
        return this.kubClusterId;
    }

    public QueryTopologyNodeDetailRequest setKubNamespace(String kubNamespace) {
        this.kubNamespace = kubNamespace;
        return this;
    }
    public String getKubNamespace() {
        return this.kubNamespace;
    }

    public QueryTopologyNodeDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTopologyNodeDetailRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyNodeDetailRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public QueryTopologyNodeDetailRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
