// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResellerAvailableQuotaRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ItemCodes")
    public String itemCodes;

    public static QueryResellerAvailableQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResellerAvailableQuotaRequest self = new QueryResellerAvailableQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryResellerAvailableQuotaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryResellerAvailableQuotaRequest setItemCodes(String itemCodes) {
        this.itemCodes = itemCodes;
        return this;
    }
    public String getItemCodes() {
        return this.itemCodes;
    }

}
