// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyIngressMetricRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    @NameInMap("ServiceName")
    public String serviceName;

    public static QueryTopologyIngressMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyIngressMetricRequest self = new QueryTopologyIngressMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyIngressMetricRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyIngressMetricRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryTopologyIngressMetricRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTopologyIngressMetricRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyIngressMetricRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public QueryTopologyIngressMetricRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
