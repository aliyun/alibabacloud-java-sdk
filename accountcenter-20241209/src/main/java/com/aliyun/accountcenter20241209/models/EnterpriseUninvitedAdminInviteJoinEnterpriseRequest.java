// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseUninvitedAdminInviteJoinEnterpriseRequest extends TeaModel {
    @NameInMap("EcId")
    public String ecId;

    @NameInMap("EncryptTicket")
    public String encryptTicket;

    @NameInMap("InviteePk")
    public String inviteePk;

    @NameInMap("LeId")
    public String leId;

    @NameInMap("NbId")
    public String nbId;

    @NameInMap("Remark")
    public String remark;

    public static EnterpriseUninvitedAdminInviteJoinEnterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseUninvitedAdminInviteJoinEnterpriseRequest self = new EnterpriseUninvitedAdminInviteJoinEnterpriseRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseRequest setEcId(String ecId) {
        this.ecId = ecId;
        return this;
    }
    public String getEcId() {
        return this.ecId;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseRequest setInviteePk(String inviteePk) {
        this.inviteePk = inviteePk;
        return this;
    }
    public String getInviteePk() {
        return this.inviteePk;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseRequest setLeId(String leId) {
        this.leId = leId;
        return this;
    }
    public String getLeId() {
        return this.leId;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseRequest setNbId(String nbId) {
        this.nbId = nbId;
        return this;
    }
    public String getNbId() {
        return this.nbId;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
