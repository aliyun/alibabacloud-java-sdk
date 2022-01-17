// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class QueryMarketImagesRequest extends TeaModel {
    @NameInMap("Param")
    public String param;

    public static QueryMarketImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMarketImagesRequest self = new QueryMarketImagesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMarketImagesRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
