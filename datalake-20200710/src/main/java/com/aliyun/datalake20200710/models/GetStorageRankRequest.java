// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetStorageRankRequest extends TeaModel {
    @NameInMap("order")
    public String order;

    @NameInMap("rankType")
    public java.util.List<String> rankType;

    public static GetStorageRankRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageRankRequest self = new GetStorageRankRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageRankRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetStorageRankRequest setRankType(java.util.List<String> rankType) {
        this.rankType = rankType;
        return this;
    }
    public java.util.List<String> getRankType() {
        return this.rankType;
    }

}
