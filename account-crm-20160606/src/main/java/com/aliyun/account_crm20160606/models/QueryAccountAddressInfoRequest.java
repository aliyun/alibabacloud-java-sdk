// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountAddressInfoRequest extends TeaModel {
    @NameInMap("AddressVersion")
    public String addressVersion;

    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("PK")
    public String PK;

    public static QueryAccountAddressInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountAddressInfoRequest self = new QueryAccountAddressInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountAddressInfoRequest setAddressVersion(String addressVersion) {
        this.addressVersion = addressVersion;
        return this;
    }
    public String getAddressVersion() {
        return this.addressVersion;
    }

    public QueryAccountAddressInfoRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public QueryAccountAddressInfoRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
