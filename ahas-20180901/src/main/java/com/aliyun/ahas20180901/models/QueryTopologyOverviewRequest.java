// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyOverviewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("KubClusterId")
    public String kubClusterId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    @NameInMap("TierId")
    public Integer tierId;

    public static QueryTopologyOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyOverviewRequest self = new QueryTopologyOverviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyOverviewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyOverviewRequest setKubClusterId(String kubClusterId) {
        this.kubClusterId = kubClusterId;
        return this;
    }
    public String getKubClusterId() {
        return this.kubClusterId;
    }

    public QueryTopologyOverviewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyOverviewRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public QueryTopologyOverviewRequest setTierId(Integer tierId) {
        this.tierId = tierId;
        return this;
    }
    public Integer getTierId() {
        return this.tierId;
    }

}
