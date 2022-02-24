// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCorpThreeKeysVerificationRequest extends TeaModel {
    // 企业名称
    @NameInMap("CompanyName")
    public String companyName;

    // 法人
    @NameInMap("LegalPersonName")
    public String legalPersonName;

    // 工商注册号
    @NameInMap("RegisterNo")
    public String registerNo;

    public static GetCorpThreeKeysVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCorpThreeKeysVerificationRequest self = new GetCorpThreeKeysVerificationRequest();
        return TeaModel.build(map, self);
    }

    public GetCorpThreeKeysVerificationRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public GetCorpThreeKeysVerificationRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public GetCorpThreeKeysVerificationRequest setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
        return this;
    }
    public String getRegisterNo() {
        return this.registerNo;
    }

}
