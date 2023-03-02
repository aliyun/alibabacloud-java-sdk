// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryCommodityConfigRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("QueryModule")
    public Boolean queryModule;

    public static QueryCommodityConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityConfigRequest self = new QueryCommodityConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommodityConfigRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryCommodityConfigRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public QueryCommodityConfigRequest setQueryModule(Boolean queryModule) {
        this.queryModule = queryModule;
        return this;
    }
    public Boolean getQueryModule() {
        return this.queryModule;
    }

}
