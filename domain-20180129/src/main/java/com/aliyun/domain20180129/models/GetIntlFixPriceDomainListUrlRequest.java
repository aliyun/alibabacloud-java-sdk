// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetIntlFixPriceDomainListUrlRequest extends TeaModel {
    /**
     * <p>The date when the list is exported.</p>
     * 
     * <strong>example:</strong>
     * <p>20240809</p>
     */
    @NameInMap("ListDate")
    public String listDate;

    public static GetIntlFixPriceDomainListUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntlFixPriceDomainListUrlRequest self = new GetIntlFixPriceDomainListUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetIntlFixPriceDomainListUrlRequest setListDate(String listDate) {
        this.listDate = listDate;
        return this;
    }
    public String getListDate() {
        return this.listDate;
    }

}
