// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QuerySpaceConsumptionRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static QuerySpaceConsumptionRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpaceConsumptionRequest self = new QuerySpaceConsumptionRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpaceConsumptionRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
