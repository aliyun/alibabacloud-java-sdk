// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySwimmingLaneByIdRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the lane.</p>
     */
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
