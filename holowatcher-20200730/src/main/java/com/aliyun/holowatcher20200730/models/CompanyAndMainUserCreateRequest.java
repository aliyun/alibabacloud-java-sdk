// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyAndMainUserCreateRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("CompanyParams")
    public String companyParams;

    @NameInMap("UserParams")
    public String userParams;

    public static CompanyAndMainUserCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        CompanyAndMainUserCreateRequest self = new CompanyAndMainUserCreateRequest();
        return TeaModel.build(map, self);
    }

    public CompanyAndMainUserCreateRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public CompanyAndMainUserCreateRequest setCompanyParams(String companyParams) {
        this.companyParams = companyParams;
        return this;
    }
    public String getCompanyParams() {
        return this.companyParams;
    }

    public CompanyAndMainUserCreateRequest setUserParams(String userParams) {
        this.userParams = userParams;
        return this;
    }
    public String getUserParams() {
        return this.userParams;
    }

}
