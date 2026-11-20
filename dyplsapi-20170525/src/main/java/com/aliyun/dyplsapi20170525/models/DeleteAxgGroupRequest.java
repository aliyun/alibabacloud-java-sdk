// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxgGroupRequest extends TeaModel {
    /**
     * <p>The G group ID (GID).</p>
     * <ul>
     * <li><p>Log on to the Phone Number Privacy Protection console. On the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page, filter for number pools of the <strong>AXG Privacy Number</strong> type and click <strong>G Number Group Management</strong> to view the IDs of all G groups.</p>
     * </li>
     * <li><p>If you created the G group by calling the <a href="https://help.aliyun.com/document_detail/110250.html">CreateAxgGroup</a> API, use the returned <strong>GroupID</strong> as the value for this <strong>GroupId</strong> parameter.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200001234****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the number pool.</p>
     * <p>You can obtain the <strong>key of the number pool</strong> on the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page in the Phone Number Privacy Protection console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2235****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteAxgGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxgGroupRequest self = new DeleteAxgGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAxgGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteAxgGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAxgGroupRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public DeleteAxgGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteAxgGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
