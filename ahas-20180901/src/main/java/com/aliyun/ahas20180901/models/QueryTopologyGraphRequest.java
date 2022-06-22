// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyGraphRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("AtomicViewId")
    public String atomicViewId;

    @NameInMap("HostConfigurationId")
    public String hostConfigurationId;

    @NameInMap("KubClusterId")
    public String kubClusterId;

    @NameInMap("KubNamespace")
    public String kubNamespace;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Loop")
    public Boolean loop;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    @NameInMap("RevealApp")
    public String revealApp;

    @NameInMap("ShowUnconnected")
    public Boolean showUnconnected;

    @NameInMap("Source")
    public String source;

    @NameInMap("State")
    public String state;

    @NameInMap("Token")
    public String token;

    @NameInMap("ViewId")
    public String viewId;

    @NameInMap("ViewMode")
    public String viewMode;

    @NameInMap("ViewType")
    public Integer viewType;

    public static QueryTopologyGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyGraphRequest self = new QueryTopologyGraphRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyGraphRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyGraphRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public QueryTopologyGraphRequest setAtomicViewId(String atomicViewId) {
        this.atomicViewId = atomicViewId;
        return this;
    }
    public String getAtomicViewId() {
        return this.atomicViewId;
    }

    public QueryTopologyGraphRequest setHostConfigurationId(String hostConfigurationId) {
        this.hostConfigurationId = hostConfigurationId;
        return this;
    }
    public String getHostConfigurationId() {
        return this.hostConfigurationId;
    }

    public QueryTopologyGraphRequest setKubClusterId(String kubClusterId) {
        this.kubClusterId = kubClusterId;
        return this;
    }
    public String getKubClusterId() {
        return this.kubClusterId;
    }

    public QueryTopologyGraphRequest setKubNamespace(String kubNamespace) {
        this.kubNamespace = kubNamespace;
        return this;
    }
    public String getKubNamespace() {
        return this.kubNamespace;
    }

    public QueryTopologyGraphRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTopologyGraphRequest setLoop(Boolean loop) {
        this.loop = loop;
        return this;
    }
    public Boolean getLoop() {
        return this.loop;
    }

    public QueryTopologyGraphRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyGraphRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public QueryTopologyGraphRequest setRevealApp(String revealApp) {
        this.revealApp = revealApp;
        return this;
    }
    public String getRevealApp() {
        return this.revealApp;
    }

    public QueryTopologyGraphRequest setShowUnconnected(Boolean showUnconnected) {
        this.showUnconnected = showUnconnected;
        return this;
    }
    public Boolean getShowUnconnected() {
        return this.showUnconnected;
    }

    public QueryTopologyGraphRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryTopologyGraphRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryTopologyGraphRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryTopologyGraphRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

    public QueryTopologyGraphRequest setViewMode(String viewMode) {
        this.viewMode = viewMode;
        return this;
    }
    public String getViewMode() {
        return this.viewMode;
    }

    public QueryTopologyGraphRequest setViewType(Integer viewType) {
        this.viewType = viewType;
        return this;
    }
    public Integer getViewType() {
        return this.viewType;
    }

}
