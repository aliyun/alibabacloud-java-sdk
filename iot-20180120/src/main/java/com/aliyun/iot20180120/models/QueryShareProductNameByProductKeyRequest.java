// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryShareProductNameByProductKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2YwD2****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52******_7<strong>e_4</strong>3_9<strong>e_61</strong>********</p>
     */
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
