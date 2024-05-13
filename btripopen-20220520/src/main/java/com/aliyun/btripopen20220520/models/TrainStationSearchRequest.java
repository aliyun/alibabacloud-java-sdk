// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainStationSearchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("keyword")
    public String keyword;

    public static TrainStationSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainStationSearchRequest self = new TrainStationSearchRequest();
        return TeaModel.build(map, self);
    }

    public TrainStationSearchRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
