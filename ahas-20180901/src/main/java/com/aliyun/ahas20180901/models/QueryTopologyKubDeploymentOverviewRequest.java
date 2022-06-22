// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubDeploymentOverviewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

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

    public static QueryTopologyKubDeploymentOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubDeploymentOverviewRequest self = new QueryTopologyKubDeploymentOverviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubDeploymentOverviewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyKubDeploymentOverviewRequest setKubClusterId(String kubClusterId) {
        this.kubClusterId = kubClusterId;
        return this;
    }
    public String getKubClusterId() {
        return this.kubClusterId;
    }

    public QueryTopologyKubDeploymentOverviewRequest setKubNamespace(String kubNamespace) {
        this.kubNamespace = kubNamespace;
        return this;
    }
    public String getKubNamespace() {
        return this.kubNamespace;
    }

    public QueryTopologyKubDeploymentOverviewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyKubDeploymentOverviewRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public QueryTopologyKubDeploymentOverviewRequest setTierId(Integer tierId) {
        this.tierId = tierId;
        return this;
    }
    public Integer getTierId() {
        return this.tierId;
    }

}
