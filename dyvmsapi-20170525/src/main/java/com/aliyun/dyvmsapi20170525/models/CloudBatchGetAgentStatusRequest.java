// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudBatchGetAgentStatusRequest extends TeaModel {
    /**
     * <p>座席号列表；座席号之间用<code>,</code>分隔，如：cnos=2000,20001 最多支持100个座席</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2000,2001</p>
     */
    @NameInMap("Cnos")
    public String cnos;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CloudBatchGetAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudBatchGetAgentStatusRequest self = new CloudBatchGetAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public CloudBatchGetAgentStatusRequest setCnos(String cnos) {
        this.cnos = cnos;
        return this;
    }
    public String getCnos() {
        return this.cnos;
    }

    public CloudBatchGetAgentStatusRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudBatchGetAgentStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudBatchGetAgentStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudBatchGetAgentStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
