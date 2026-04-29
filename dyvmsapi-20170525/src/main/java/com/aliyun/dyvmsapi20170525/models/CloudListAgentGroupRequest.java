// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListAgentGroupRequest extends TeaModel {
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
     * <p>外呼总组编号；说明：以外呼组编号为筛选条件查询</p>
     * 
     * <strong>example:</strong>
     * <p>WH123</p>
     */
    @NameInMap("Gno")
    public String gno;

    /**
     * <p>外呼总组名称；说明：以外呼组名称为筛选条件查询</p>
     * 
     * <strong>example:</strong>
     * <p>gpName</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>需要取出的数据条数；说明：大于0，最大不能超过1000，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public String limit;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>从第几条开始取；说明：大于等于0，默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public String start;

    public static CloudListAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudListAgentGroupRequest self = new CloudListAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public CloudListAgentGroupRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudListAgentGroupRequest setGno(String gno) {
        this.gno = gno;
        return this;
    }
    public String getGno() {
        return this.gno;
    }

    public CloudListAgentGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CloudListAgentGroupRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public CloudListAgentGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudListAgentGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudListAgentGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudListAgentGroupRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
