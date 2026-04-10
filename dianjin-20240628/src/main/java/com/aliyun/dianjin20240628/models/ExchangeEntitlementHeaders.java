// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class ExchangeEntitlementHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("X-Load-Test")
    public Boolean xLoadTest;

    public static ExchangeEntitlementHeaders build(java.util.Map<String, ?> map) throws Exception {
        ExchangeEntitlementHeaders self = new ExchangeEntitlementHeaders();
        return TeaModel.build(map, self);
    }

    public ExchangeEntitlementHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ExchangeEntitlementHeaders setXLoadTest(Boolean xLoadTest) {
        this.xLoadTest = xLoadTest;
        return this;
    }
    public Boolean getXLoadTest() {
        return this.xLoadTest;
    }

}
