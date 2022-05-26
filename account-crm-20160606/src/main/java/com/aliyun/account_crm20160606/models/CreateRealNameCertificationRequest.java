// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateRealNameCertificationRequest extends TeaModel {
    @NameInMap("AccountCertifyType")
    public String accountCertifyType;

    @NameInMap("CorporateLicenseNumber")
    public String corporateLicenseNumber;

    @NameInMap("CorporateName")
    public String corporateName;

    @NameInMap("LicenseNumber")
    public String licenseNumber;

    @NameInMap("LicenseType")
    public String licenseType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Pk")
    public String pk;

    public static CreateRealNameCertificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealNameCertificationRequest self = new CreateRealNameCertificationRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealNameCertificationRequest setAccountCertifyType(String accountCertifyType) {
        this.accountCertifyType = accountCertifyType;
        return this;
    }
    public String getAccountCertifyType() {
        return this.accountCertifyType;
    }

    public CreateRealNameCertificationRequest setCorporateLicenseNumber(String corporateLicenseNumber) {
        this.corporateLicenseNumber = corporateLicenseNumber;
        return this;
    }
    public String getCorporateLicenseNumber() {
        return this.corporateLicenseNumber;
    }

    public CreateRealNameCertificationRequest setCorporateName(String corporateName) {
        this.corporateName = corporateName;
        return this;
    }
    public String getCorporateName() {
        return this.corporateName;
    }

    public CreateRealNameCertificationRequest setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }
    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public CreateRealNameCertificationRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public CreateRealNameCertificationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRealNameCertificationRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
