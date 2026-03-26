// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetInsightSelectorsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trail-name</p>
     */
    @NameInMap("TrailName")
    public String trailName;

    public static GetInsightSelectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInsightSelectorsRequest self = new GetInsightSelectorsRequest();
        return TeaModel.build(map, self);
    }

    public GetInsightSelectorsRequest setTrailName(String trailName) {
        this.trailName = trailName;
        return this;
    }
    public String getTrailName() {
        return this.trailName;
    }

}
