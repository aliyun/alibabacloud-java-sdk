// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ValidCompanyNameRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("CompanyName")
    public String companyName;

    public static ValidCompanyNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidCompanyNameRequest self = new ValidCompanyNameRequest();
        return TeaModel.build(map, self);
    }

    public ValidCompanyNameRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public ValidCompanyNameRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

}
