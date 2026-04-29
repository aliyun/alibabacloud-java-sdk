// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudUnassignAgentGroupRequest extends TeaModel {
    /**
     * <p>座席编号；说明：解除此cno对应座席 与 gno对应外呼组 的绑定关系</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12221</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>外呼组编号；说明：解除此gno对应外呼组 与 cno对应座席 的绑定关系</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WH123</p>
     */
    @NameInMap("Gno")
    public String gno;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CloudUnassignAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudUnassignAgentGroupRequest self = new CloudUnassignAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public CloudUnassignAgentGroupRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudUnassignAgentGroupRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudUnassignAgentGroupRequest setGno(String gno) {
        this.gno = gno;
        return this;
    }
    public String getGno() {
        return this.gno;
    }

    public CloudUnassignAgentGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudUnassignAgentGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudUnassignAgentGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
