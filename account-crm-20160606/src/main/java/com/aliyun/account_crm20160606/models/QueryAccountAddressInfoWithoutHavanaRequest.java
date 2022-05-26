// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountAddressInfoWithoutHavanaRequest extends TeaModel {
    @NameInMap("AddressVersion")
    public String addressVersion;

    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("PK")
    public String PK;

    public static QueryAccountAddressInfoWithoutHavanaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountAddressInfoWithoutHavanaRequest self = new QueryAccountAddressInfoWithoutHavanaRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountAddressInfoWithoutHavanaRequest setAddressVersion(String addressVersion) {
        this.addressVersion = addressVersion;
        return this;
    }
    public String getAddressVersion() {
        return this.addressVersion;
    }

    public QueryAccountAddressInfoWithoutHavanaRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public QueryAccountAddressInfoWithoutHavanaRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
