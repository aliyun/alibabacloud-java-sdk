// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryEnterpriseInfoRequest extends TeaModel {
    @NameInMap("EnterpriseVersion")
    public String enterpriseVersion;

    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("PK")
    public String PK;

    public static QueryEnterpriseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseInfoRequest self = new QueryEnterpriseInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseInfoRequest setEnterpriseVersion(String enterpriseVersion) {
        this.enterpriseVersion = enterpriseVersion;
        return this;
    }
    public String getEnterpriseVersion() {
        return this.enterpriseVersion;
    }

    public QueryEnterpriseInfoRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public QueryEnterpriseInfoRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
