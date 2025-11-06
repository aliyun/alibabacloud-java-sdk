// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainRealTimePriceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USD</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainItem")
    public String domainItemShrink;

    public static QueryDomainRealTimePriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainRealTimePriceShrinkRequest self = new QueryDomainRealTimePriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainRealTimePriceShrinkRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryDomainRealTimePriceShrinkRequest setDomainItemShrink(String domainItemShrink) {
        this.domainItemShrink = domainItemShrink;
        return this;
    }
    public String getDomainItemShrink() {
        return this.domainItemShrink;
    }

}
