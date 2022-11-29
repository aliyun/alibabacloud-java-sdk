// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryFaultBriefListRequest extends TeaModel {
    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    public static QueryFaultBriefListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaultBriefListRequest self = new QueryFaultBriefListRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaultBriefListRequest setShopIdList(java.util.List<String> shopIdList) {
        this.shopIdList = shopIdList;
        return this;
    }
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

}
