// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryLastestVersionInfoRequest extends TeaModel {
    @NameInMap("ProductID")
    @Validation(required = true)
    public String productID;

    public static QueryLastestVersionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLastestVersionInfoRequest self = new QueryLastestVersionInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLastestVersionInfoRequest setProductID(String productID) {
        this.productID = productID;
        return this;
    }
    public String getProductID() {
        return this.productID;
    }

}
