// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListAssignedAgentGroupRequest extends TeaModel {
    /**
     * <p>查询条件座席名称；说明：以座席名称为筛选条件查询</p>
     * 
     * <strong>example:</strong>
     * <p>111111111</p>
     */
    @NameInMap("Cname")
    public String cname;

    /**
     * <p>查询条件座席编号；说明：以座席编号为筛选条件查询</p>
     * 
     * <strong>example:</strong>
     * <p>111111111</p>
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
     * <p>外呼组编号；说明：获取此gno下绑定的座席信息列表</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WH113</p>
     */
    @NameInMap("Gno")
    public String gno;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CloudListAssignedAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudListAssignedAgentGroupRequest self = new CloudListAssignedAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public CloudListAssignedAgentGroupRequest setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public CloudListAssignedAgentGroupRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudListAssignedAgentGroupRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudListAssignedAgentGroupRequest setGno(String gno) {
        this.gno = gno;
        return this;
    }
    public String getGno() {
        return this.gno;
    }

    public CloudListAssignedAgentGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudListAssignedAgentGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudListAssignedAgentGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
