// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class EnableTemporaryDomainRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    public static EnableTemporaryDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableTemporaryDomainRequest self = new EnableTemporaryDomainRequest();
        return TeaModel.build(map, self);
    }

    public EnableTemporaryDomainRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

}
