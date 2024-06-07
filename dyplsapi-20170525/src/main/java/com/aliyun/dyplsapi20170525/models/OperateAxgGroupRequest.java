// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class OperateAxgGroupRequest extends TeaModel {
    /**
     * <p>The group ID in the AXG binding.</p>
     * <br>
     * <p>You can view the group ID by using either of the following methods:</p>
     * <br>
     * <p>*   On the **Number Pool Management** page in the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account), filter AXG private numbers and click **Number Group G Management** to view the group IDs of number groups G.****</p>
     * <p>*   If the [CreateAxgGroup](https://help.aliyun.com/document_detail/110250.html) operation is called to create number group G, the value of **GroupId** in the response of the CreateAxgGroup operation is specified as the value of the request parameter **GroupId** of the OperateAxgGroup operation.</p>
     * <br>
     * <p>>  Number group G must have one or more phone numbers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The phone numbers that you add to number group G. Separate the phone numbers with commas (,). You can add up to 200 phone numbers at a time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Numbers")
    public String numbers;

    /**
     * <p>The type of the operation on number group G. Valid values:</p>
     * <br>
     * <p>*   **addNumbers**: adds phone numbers to number group G.</p>
     * <p>*   **deleteNumbers**: deletes phone numbers from number group G.</p>
     * <p>*   **overwriteNumbers**: replaces all phone numbers in number group G. All the original phone numbers are deleted from number group G, and new phone numbers are added to number group G.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   When you replace all phone numbers in number group G, the quantity of original phone numbers in number group G cannot exceed 200.</p>
     * <br>
     * <p>*   You can add up to 200 phone numbers to number group G at a time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static OperateAxgGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAxgGroupRequest self = new OperateAxgGroupRequest();
        return TeaModel.build(map, self);
    }

    public OperateAxgGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public OperateAxgGroupRequest setNumbers(String numbers) {
        this.numbers = numbers;
        return this;
    }
    public String getNumbers() {
        return this.numbers;
    }

    public OperateAxgGroupRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateAxgGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OperateAxgGroupRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public OperateAxgGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public OperateAxgGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
