// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryRedemptionRecordsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("X-Load-Test")
    public Boolean xLoadTest;

    public static QueryRedemptionRecordsHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryRedemptionRecordsHeaders self = new QueryRedemptionRecordsHeaders();
        return TeaModel.build(map, self);
    }

    public QueryRedemptionRecordsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryRedemptionRecordsHeaders setXLoadTest(Boolean xLoadTest) {
        this.xLoadTest = xLoadTest;
        return this;
    }
    public Boolean getXLoadTest() {
        return this.xLoadTest;
    }

}
