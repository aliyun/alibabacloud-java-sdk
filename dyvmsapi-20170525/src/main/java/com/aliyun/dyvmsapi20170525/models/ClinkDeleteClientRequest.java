// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDeleteClientRequest extends TeaModel {
    /**
     * <p>座席工号，长度为4-11个字符，必须全部为数字</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("Cno")
    public Long cno;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ClinkDeleteClientRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkDeleteClientRequest self = new ClinkDeleteClientRequest();
        return TeaModel.build(map, self);
    }

    public ClinkDeleteClientRequest setCno(Long cno) {
        this.cno = cno;
        return this;
    }
    public Long getCno() {
        return this.cno;
    }

    public ClinkDeleteClientRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkDeleteClientRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkDeleteClientRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkDeleteClientRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
