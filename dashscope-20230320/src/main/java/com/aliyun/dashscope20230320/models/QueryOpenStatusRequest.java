// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class QueryOpenStatusRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    public static QueryOpenStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpenStatusRequest self = new QueryOpenStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpenStatusRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
