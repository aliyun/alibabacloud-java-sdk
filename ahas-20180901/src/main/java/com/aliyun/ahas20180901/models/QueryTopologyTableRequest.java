// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyTableRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("KubClusterId")
    public String kubClusterId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Loop")
    public Boolean loop;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    @NameInMap("ViewId")
    public String viewId;

    public static QueryTopologyTableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyTableRequest self = new QueryTopologyTableRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyTableRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyTableRequest setKubClusterId(String kubClusterId) {
        this.kubClusterId = kubClusterId;
        return this;
    }
    public String getKubClusterId() {
        return this.kubClusterId;
    }

    public QueryTopologyTableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTopologyTableRequest setLoop(Boolean loop) {
        this.loop = loop;
        return this;
    }
    public Boolean getLoop() {
        return this.loop;
    }

    public QueryTopologyTableRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyTableRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public QueryTopologyTableRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
