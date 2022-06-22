// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyCloudNodeDetailRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ConfigurationId")
    public String configurationId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    @NameInMap("ViewId")
    public String viewId;

    public static QueryTopologyCloudNodeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyCloudNodeDetailRequest self = new QueryTopologyCloudNodeDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyCloudNodeDetailRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyCloudNodeDetailRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public QueryTopologyCloudNodeDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTopologyCloudNodeDetailRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyCloudNodeDetailRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public QueryTopologyCloudNodeDetailRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public QueryTopologyCloudNodeDetailRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
