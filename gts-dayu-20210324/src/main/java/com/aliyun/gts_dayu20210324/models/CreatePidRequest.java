// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class CreatePidRequest extends TeaModel {
    // contactPersonName
    @NameInMap("ContactPersonName")
    public String contactPersonName;

    // aliyunUid
    @NameInMap("AliyunUid")
    public String aliyunUid;

    // licenseNum
    @NameInMap("LicenseNum")
    public String licenseNum;

    // contactPersonPhone
    @NameInMap("ContactPersonPhone")
    public String contactPersonPhone;

    // contactPersonMail
    @NameInMap("ContactPersonMail")
    public String contactPersonMail;

    public static CreatePidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePidRequest self = new CreatePidRequest();
        return TeaModel.build(map, self);
    }

    public CreatePidRequest setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
        return this;
    }
    public String getContactPersonName() {
        return this.contactPersonName;
    }

    public CreatePidRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public CreatePidRequest setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
        return this;
    }
    public String getLicenseNum() {
        return this.licenseNum;
    }

    public CreatePidRequest setContactPersonPhone(String contactPersonPhone) {
        this.contactPersonPhone = contactPersonPhone;
        return this;
    }
    public String getContactPersonPhone() {
        return this.contactPersonPhone;
    }

    public CreatePidRequest setContactPersonMail(String contactPersonMail) {
        this.contactPersonMail = contactPersonMail;
        return this;
    }
    public String getContactPersonMail() {
        return this.contactPersonMail;
    }

}
