// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ModifyMemberRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("MemberContact")
    public String memberContact;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("MemberPhone")
    public String memberPhone;

    @NameInMap("MemberUid")
    public String memberUid;

    @NameInMap("Remark")
    public String remark;

    public static ModifyMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberRequest self = new ModifyMemberRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMemberRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ModifyMemberRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public ModifyMemberRequest setMemberContact(String memberContact) {
        this.memberContact = memberContact;
        return this;
    }
    public String getMemberContact() {
        return this.memberContact;
    }

    public ModifyMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public ModifyMemberRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public ModifyMemberRequest setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
        return this;
    }
    public String getMemberPhone() {
        return this.memberPhone;
    }

    public ModifyMemberRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public ModifyMemberRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
