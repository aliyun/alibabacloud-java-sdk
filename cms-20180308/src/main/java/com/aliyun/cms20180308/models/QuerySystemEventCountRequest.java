// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QuerySystemEventCountRequest extends TeaModel {
    @NameInMap("QueryJson")
    public String queryJson;

    @NameInMap("RegionId")
    public String regionId;

    public static QuerySystemEventCountRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemEventCountRequest self = new QuerySystemEventCountRequest();
        return TeaModel.build(map, self);
    }

    public QuerySystemEventCountRequest setQueryJson(String queryJson) {
        this.queryJson = queryJson;
        return this;
    }
    public String getQueryJson() {
        return this.queryJson;
    }

    public QuerySystemEventCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
