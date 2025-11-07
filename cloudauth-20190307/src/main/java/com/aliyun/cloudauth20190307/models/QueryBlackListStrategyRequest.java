// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryBlackListStrategyRequest extends TeaModel {
    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static QueryBlackListStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlackListStrategyRequest self = new QueryBlackListStrategyRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlackListStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
