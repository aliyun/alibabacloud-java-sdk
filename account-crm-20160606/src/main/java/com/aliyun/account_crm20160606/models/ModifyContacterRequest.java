// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ModifyContacterRequest extends TeaModel {
    @NameInMap("ContacterAddress")
    public String contacterAddress;

    @NameInMap("ContacterDingding")
    public String contacterDingding;

    @NameInMap("ContacterEmail")
    public String contacterEmail;

    @NameInMap("ContacterId")
    public Long contacterId;

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

    public static ModifyContacterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyContacterRequest self = new ModifyContacterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyContacterRequest setContacterAddress(String contacterAddress) {
        this.contacterAddress = contacterAddress;
        return this;
    }
    public String getContacterAddress() {
        return this.contacterAddress;
    }

    public ModifyContacterRequest setContacterDingding(String contacterDingding) {
        this.contacterDingding = contacterDingding;
        return this;
    }
    public String getContacterDingding() {
        return this.contacterDingding;
    }

    public ModifyContacterRequest setContacterEmail(String contacterEmail) {
        this.contacterEmail = contacterEmail;
        return this;
    }
    public String getContacterEmail() {
        return this.contacterEmail;
    }

    public ModifyContacterRequest setContacterId(Long contacterId) {
        this.contacterId = contacterId;
        return this;
    }
    public Long getContacterId() {
        return this.contacterId;
    }

    public ModifyContacterRequest setContacterMobile(String contacterMobile) {
        this.contacterMobile = contacterMobile;
        return this;
    }
    public String getContacterMobile() {
        return this.contacterMobile;
    }

    public ModifyContacterRequest setContacterName(String contacterName) {
        this.contacterName = contacterName;
        return this;
    }
    public String getContacterName() {
        return this.contacterName;
    }

    public ModifyContacterRequest setContacterPosition(String contacterPosition) {
        this.contacterPosition = contacterPosition;
        return this;
    }
    public String getContacterPosition() {
        return this.contacterPosition;
    }

    public ModifyContacterRequest setContacterStaffNo(String contacterStaffNo) {
        this.contacterStaffNo = contacterStaffNo;
        return this;
    }
    public String getContacterStaffNo() {
        return this.contacterStaffNo;
    }

    public ModifyContacterRequest setContacterType(String contacterType) {
        this.contacterType = contacterType;
        return this;
    }
    public String getContacterType() {
        return this.contacterType;
    }

    public ModifyContacterRequest setContacterWangwang(String contacterWangwang) {
        this.contacterWangwang = contacterWangwang;
        return this;
    }
    public String getContacterWangwang() {
        return this.contacterWangwang;
    }

    public ModifyContacterRequest setEmailConfirmed(Boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
        return this;
    }
    public Boolean getEmailConfirmed() {
        return this.emailConfirmed;
    }

    public ModifyContacterRequest setMobileConfirmed(Boolean mobileConfirmed) {
        this.mobileConfirmed = mobileConfirmed;
        return this;
    }
    public Boolean getMobileConfirmed() {
        return this.mobileConfirmed;
    }

    public ModifyContacterRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
