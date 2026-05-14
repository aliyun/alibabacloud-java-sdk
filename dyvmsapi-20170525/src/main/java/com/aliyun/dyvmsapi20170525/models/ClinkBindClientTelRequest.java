// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkBindClientTelRequest extends TeaModel {
    /**
     * <p>座席号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8004970</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>是否绑定 1: 是，0: 否</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsBind")
    public Long isBind;

    /**
     * <p>是否同步为备用手机 1: 是，0: 否</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsReserveTel")
    public Long isReserveTel;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>电话号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>177xxxx7750</p>
     */
    @NameInMap("Tel")
    public String tel;

    public static ClinkBindClientTelRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkBindClientTelRequest self = new ClinkBindClientTelRequest();
        return TeaModel.build(map, self);
    }

    public ClinkBindClientTelRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public ClinkBindClientTelRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkBindClientTelRequest setIsBind(Long isBind) {
        this.isBind = isBind;
        return this;
    }
    public Long getIsBind() {
        return this.isBind;
    }

    public ClinkBindClientTelRequest setIsReserveTel(Long isReserveTel) {
        this.isReserveTel = isReserveTel;
        return this;
    }
    public Long getIsReserveTel() {
        return this.isReserveTel;
    }

    public ClinkBindClientTelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkBindClientTelRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkBindClientTelRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkBindClientTelRequest setTel(String tel) {
        this.tel = tel;
        return this;
    }
    public String getTel() {
        return this.tel;
    }

}
