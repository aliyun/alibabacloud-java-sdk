// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAssignAgentGroupRequest extends TeaModel {
    /**
     * <p>说明：多个座席编号之间以英文逗号( , )分隔，一次最多支持1000个cno；同一座席只能存在于一个外呼组，重复分配会自动移动到新的外呼组中</p>
     * 
     * <strong>example:</strong>
     * <p>1000,1111</p>
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

    /**
     * <p>外呼组编号；说明：添加此gno对应的外呼组与cnos对应的座席的绑定从属关系; 同一外呼组最多可包含1000个座席</p>
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

    public static CloudAssignAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudAssignAgentGroupRequest self = new CloudAssignAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public CloudAssignAgentGroupRequest setCnos(String cnos) {
        this.cnos = cnos;
        return this;
    }
    public String getCnos() {
        return this.cnos;
    }

    public CloudAssignAgentGroupRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudAssignAgentGroupRequest setGno(String gno) {
        this.gno = gno;
        return this;
    }
    public String getGno() {
        return this.gno;
    }

    public CloudAssignAgentGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudAssignAgentGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudAssignAgentGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
