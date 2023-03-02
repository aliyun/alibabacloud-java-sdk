// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class CreateMemberRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("MemberContact")
    public String memberContact;

    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("MemberPhone")
    public String memberPhone;

    @NameInMap("MemberUid")
    public String memberUid;

    @NameInMap("Remark")
    public String remark;

    public static CreateMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberRequest self = new CreateMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemberRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public CreateMemberRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public CreateMemberRequest setMemberContact(String memberContact) {
        this.memberContact = memberContact;
        return this;
    }
    public String getMemberContact() {
        return this.memberContact;
    }

    public CreateMemberRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public CreateMemberRequest setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
        return this;
    }
    public String getMemberPhone() {
        return this.memberPhone;
    }

    public CreateMemberRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public CreateMemberRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
