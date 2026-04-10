// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryApiKeysRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("externalUserId")
    public String externalUserId;

    public static QueryApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiKeysRequest self = new QueryApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiKeysRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

}
