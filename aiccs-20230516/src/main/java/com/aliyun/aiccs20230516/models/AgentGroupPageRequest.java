// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentGroupPageRequest extends TeaModel {
    /**
     * <p>坐席组ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AgentGroupId")
    public Long agentGroupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>当前页</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>分页数量</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AgentGroupPageRequest build(java.util.Map<String, ?> map) throws Exception {
        AgentGroupPageRequest self = new AgentGroupPageRequest();
        return TeaModel.build(map, self);
    }

    public AgentGroupPageRequest setAgentGroupId(Long agentGroupId) {
        this.agentGroupId = agentGroupId;
        return this;
    }
    public Long getAgentGroupId() {
        return this.agentGroupId;
    }

    public AgentGroupPageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AgentGroupPageRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public AgentGroupPageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AgentGroupPageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AgentGroupPageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
