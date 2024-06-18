// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class ReserveIntlDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static ReserveIntlDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ReserveIntlDomainRequest self = new ReserveIntlDomainRequest();
        return TeaModel.build(map, self);
    }

    public ReserveIntlDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
