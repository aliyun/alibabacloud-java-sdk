// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryShareProductNameByProductKeyRequest extends TeaModel {
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    public static QueryShareProductNameByProductKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShareProductNameByProductKeyRequest self = new QueryShareProductNameByProductKeyRequest();
        return TeaModel.build(map, self);
    }

    public QueryShareProductNameByProductKeyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryShareProductNameByProductKeyRequest setShareTaskCode(String shareTaskCode) {
        this.shareTaskCode = shareTaskCode;
        return this;
    }
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

}
