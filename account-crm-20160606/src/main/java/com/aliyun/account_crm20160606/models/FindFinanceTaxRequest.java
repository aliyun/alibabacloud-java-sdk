// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindFinanceTaxRequest extends TeaModel {
    @NameInMap("HId")
    public Long HId;

    @NameInMap("TaxVersion")
    public String taxVersion;

    public static FindFinanceTaxRequest build(java.util.Map<String, ?> map) throws Exception {
        FindFinanceTaxRequest self = new FindFinanceTaxRequest();
        return TeaModel.build(map, self);
    }

    public FindFinanceTaxRequest setHId(Long HId) {
        this.HId = HId;
        return this;
    }
    public Long getHId() {
        return this.HId;
    }

    public FindFinanceTaxRequest setTaxVersion(String taxVersion) {
        this.taxVersion = taxVersion;
        return this;
    }
    public String getTaxVersion() {
        return this.taxVersion;
    }

}
