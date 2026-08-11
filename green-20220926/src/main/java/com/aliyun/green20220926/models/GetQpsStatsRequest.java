// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetQpsStatsRequest extends TeaModel {
    /**
     * <p>The query condition. The value is a string in JSON format.</p>
     * <blockquote>
     * <p>Different query conditions return different protected objects. For more information, see <strong>Query parameter description</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetQpsStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQpsStatsRequest self = new GetQpsStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetQpsStatsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetQpsStatsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
