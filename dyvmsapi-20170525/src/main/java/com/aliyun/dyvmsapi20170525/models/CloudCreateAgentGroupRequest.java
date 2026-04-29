// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateAgentGroupRequest extends TeaModel {
    /**
     * <p>说明：描述长度不能大于100,需进行UTF-8格式的URLEncode编码</p>
     * 
     * <strong>example:</strong>
     * <p>comment3</p>
     */
    @NameInMap("Comment")
    public String comment;

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
     * <p>说明：同一企业外呼组编号编号不能重复，外呼组编号长度为2-20，以字母开头,须同时且只能包含字母和数字 同一企业最多可创建1000个外呼组</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WH12</p>
     */
    @NameInMap("Gno")
    public String gno;

    /**
     * <p>说明：外呼组名称不能为空，长度不能大于50,需进行UTF-8格式的URLEncode编码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gpname1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CloudCreateAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateAgentGroupRequest self = new CloudCreateAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public CloudCreateAgentGroupRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CloudCreateAgentGroupRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudCreateAgentGroupRequest setGno(String gno) {
        this.gno = gno;
        return this;
    }
    public String getGno() {
        return this.gno;
    }

    public CloudCreateAgentGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CloudCreateAgentGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudCreateAgentGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudCreateAgentGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
