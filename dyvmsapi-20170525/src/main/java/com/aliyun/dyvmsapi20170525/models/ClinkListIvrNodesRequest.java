// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListIvrNodesRequest extends TeaModel {
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
     * <p>语音导航名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IvrName</p>
     */
    @NameInMap("IvrName")
    public String ivrName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ClinkListIvrNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkListIvrNodesRequest self = new ClinkListIvrNodesRequest();
        return TeaModel.build(map, self);
    }

    public ClinkListIvrNodesRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkListIvrNodesRequest setIvrName(String ivrName) {
        this.ivrName = ivrName;
        return this;
    }
    public String getIvrName() {
        return this.ivrName;
    }

    public ClinkListIvrNodesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkListIvrNodesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkListIvrNodesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
