// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryVersionInfosRequest extends TeaModel {
    @NameInMap("ProductID")
    @Validation(required = true)
    public String productID;

    @NameInMap("OS")
    @Validation(required = true)
    public String OS;

    public static QueryVersionInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVersionInfosRequest self = new QueryVersionInfosRequest();
        return TeaModel.build(map, self);
    }

    public QueryVersionInfosRequest setProductID(String productID) {
        this.productID = productID;
        return this;
    }
    public String getProductID() {
        return this.productID;
    }

    public QueryVersionInfosRequest setOS(String OS) {
        this.OS = OS;
        return this;
    }
    public String getOS() {
        return this.OS;
    }

}
