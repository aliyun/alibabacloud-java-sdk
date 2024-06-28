// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryFinancialAccountInfoRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1990699401005016</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static QueryFinancialAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFinancialAccountInfoRequest self = new QueryFinancialAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryFinancialAccountInfoRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
