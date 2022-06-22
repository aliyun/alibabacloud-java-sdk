// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryOverviewBasicRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestTimestamp")
    public Long requestTimestamp;

    public static QueryOverviewBasicRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOverviewBasicRequest self = new QueryOverviewBasicRequest();
        return TeaModel.build(map, self);
    }

    public QueryOverviewBasicRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryOverviewBasicRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryOverviewBasicRequest setRequestTimestamp(Long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }
    public Long getRequestTimestamp() {
        return this.requestTimestamp;
    }

}
