// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyFindOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("CompanyId")
    public Long companyId;

    public static CompanyFindOneRequest build(java.util.Map<String, ?> map) throws Exception {
        CompanyFindOneRequest self = new CompanyFindOneRequest();
        return TeaModel.build(map, self);
    }

    public CompanyFindOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public CompanyFindOneRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

}
