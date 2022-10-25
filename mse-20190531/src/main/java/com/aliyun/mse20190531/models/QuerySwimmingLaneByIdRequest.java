// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySwimmingLaneByIdRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("LaneId")
    public Long laneId;

    public static QuerySwimmingLaneByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySwimmingLaneByIdRequest self = new QuerySwimmingLaneByIdRequest();
        return TeaModel.build(map, self);
    }

    public QuerySwimmingLaneByIdRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QuerySwimmingLaneByIdRequest setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

}
