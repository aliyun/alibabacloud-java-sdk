// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryApiKeysHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("X-Load-Test")
    public Boolean xLoadTest;

    public static QueryApiKeysHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryApiKeysHeaders self = new QueryApiKeysHeaders();
        return TeaModel.build(map, self);
    }

    public QueryApiKeysHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryApiKeysHeaders setXLoadTest(Boolean xLoadTest) {
        this.xLoadTest = xLoadTest;
        return this;
    }
    public Boolean getXLoadTest() {
        return this.xLoadTest;
    }

}
