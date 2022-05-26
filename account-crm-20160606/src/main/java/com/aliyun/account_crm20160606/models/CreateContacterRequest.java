// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateContacterRequest extends TeaModel {
    @NameInMap("ContacterAddress")
    public String contacterAddress;

    @NameInMap("ContacterDingding")
    public String contacterDingding;

    @NameInMap("ContacterEmail")
    public String contacterEmail;

    @NameInMap("ContacterMobile")
    public String contacterMobile;

    @NameInMap("ContacterName")
    public String contacterName;

    @NameInMap("ContacterPosition")
    public String contacterPosition;

    @NameInMap("ContacterStaffNo")
    public String contacterStaffNo;

    @NameInMap("ContacterType")
    public String contacterType;

    @NameInMap("ContacterWangwang")
    public String contacterWangwang;

    @NameInMap("EmailConfirmed")
    public Boolean emailConfirmed;

    @NameInMap("MobileConfirmed")
    public Boolean mobileConfirmed;

    @NameInMap("UserId")
    public Long userId;

    public static CreateContacterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContacterRequest self = new CreateContacterRequest();
        return TeaModel.build(map, self);
    }

    public CreateContacterRequest setContacterAddress(String contacterAddress) {
        this.contacterAddress = contacterAddress;
        return this;
    }
    public String getContacterAddress() {
        return this.contacterAddress;
    }

    public CreateContacterRequest setContacterDingding(String contacterDingding) {
        this.contacterDingding = contacterDingding;
        return this;
    }
    public String getContacterDingding() {
        return this.contacterDingding;
    }

    public CreateContacterRequest setContacterEmail(String contacterEmail) {
        this.contacterEmail = contacterEmail;
        return this;
    }
    public String getContacterEmail() {
        return this.contacterEmail;
    }

    public CreateContacterRequest setContacterMobile(String contacterMobile) {
        this.contacterMobile = contacterMobile;
        return this;
    }
    public String getContacterMobile() {
        return this.contacterMobile;
    }

    public CreateContacterRequest setContacterName(String contacterName) {
        this.contacterName = contacterName;
        return this;
    }
    public String getContacterName() {
        return this.contacterName;
    }

    public CreateContacterRequest setContacterPosition(String contacterPosition) {
        this.contacterPosition = contacterPosition;
        return this;
    }
    public String getContacterPosition() {
        return this.contacterPosition;
    }

    public CreateContacterRequest setContacterStaffNo(String contacterStaffNo) {
        this.contacterStaffNo = contacterStaffNo;
        return this;
    }
    public String getContacterStaffNo() {
        return this.contacterStaffNo;
    }

    public CreateContacterRequest setContacterType(String contacterType) {
        this.contacterType = contacterType;
        return this;
    }
    public String getContacterType() {
        return this.contacterType;
    }

    public CreateContacterRequest setContacterWangwang(String contacterWangwang) {
        this.contacterWangwang = contacterWangwang;
        return this;
    }
    public String getContacterWangwang() {
        return this.contacterWangwang;
    }

    public CreateContacterRequest setEmailConfirmed(Boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
        return this;
    }
    public Boolean getEmailConfirmed() {
        return this.emailConfirmed;
    }

    public CreateContacterRequest setMobileConfirmed(Boolean mobileConfirmed) {
        this.mobileConfirmed = mobileConfirmed;
        return this;
    }
    public Boolean getMobileConfirmed() {
        return this.mobileConfirmed;
    }

    public CreateContacterRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
