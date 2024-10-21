// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckIntlFixPriceDomainStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>appp16.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static CheckIntlFixPriceDomainStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckIntlFixPriceDomainStatusRequest self = new CheckIntlFixPriceDomainStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckIntlFixPriceDomainStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
