// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyContainerOverviewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("HostConfigurationId")
    public String hostConfigurationId;

    @NameInMap("KubClusterId")
    public String kubClusterId;

    @NameInMap("KubNamespace")
    public String kubNamespace;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    @NameInMap("TierId")
    public Integer tierId;

    public static QueryTopologyContainerOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyContainerOverviewRequest self = new QueryTopologyContainerOverviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyContainerOverviewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyContainerOverviewRequest setHostConfigurationId(String hostConfigurationId) {
        this.hostConfigurationId = hostConfigurationId;
        return this;
    }
    public String getHostConfigurationId() {
        return this.hostConfigurationId;
    }

    public QueryTopologyContainerOverviewRequest setKubClusterId(String kubClusterId) {
        this.kubClusterId = kubClusterId;
        return this;
    }
    public String getKubClusterId() {
        return this.kubClusterId;
    }

    public QueryTopologyContainerOverviewRequest setKubNamespace(String kubNamespace) {
        this.kubNamespace = kubNamespace;
        return this;
    }
    public String getKubNamespace() {
        return this.kubNamespace;
    }

    public QueryTopologyContainerOverviewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyContainerOverviewRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public QueryTopologyContainerOverviewRequest setTierId(Integer tierId) {
        this.tierId = tierId;
        return this;
    }
    public Integer getTierId() {
        return this.tierId;
    }

}
