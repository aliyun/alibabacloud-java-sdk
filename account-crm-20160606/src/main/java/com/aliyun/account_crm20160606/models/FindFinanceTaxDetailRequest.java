// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindFinanceTaxDetailRequest extends TeaModel {
    @NameInMap("KpId")
    public Long kpId;

    public static FindFinanceTaxDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        FindFinanceTaxDetailRequest self = new FindFinanceTaxDetailRequest();
        return TeaModel.build(map, self);
    }

    public FindFinanceTaxDetailRequest setKpId(Long kpId) {
        this.kpId = kpId;
        return this;
    }
    public Long getKpId() {
        return this.kpId;
    }

}
