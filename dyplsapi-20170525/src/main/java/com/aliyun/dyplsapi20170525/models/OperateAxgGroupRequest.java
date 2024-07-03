// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class OperateAxgGroupRequest extends TeaModel {
    /**
     * <p>The group ID in the AXG binding.</p>
     * <p>You can view the group ID by using either of the following methods:</p>
     * <ul>
     * <li>On the <strong>Number Pool Management</strong> page in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>, filter AXG private numbers and click <strong>Number Group G Management</strong> to view the group IDs of number groups G.****</li>
     * <li>If the <a href="https://help.aliyun.com/document_detail/110250.html">CreateAxgGroup</a> operation is called to create number group G, the value of <strong>GroupId</strong> in the response of the CreateAxgGroup operation is specified as the value of the request parameter <strong>GroupId</strong> of the OperateAxgGroup operation.</li>
     * </ul>
     * <blockquote>
     * <p> Number group G must have one or more phone numbers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The phone numbers that you add to number group G. Separate the phone numbers with commas (,). You can add up to 200 phone numbers at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****,1380000****</p>
     */
    @NameInMap("Numbers")
    public String numbers;

    /**
     * <p>The type of the operation on number group G. Valid values:</p>
     * <ul>
     * <li><strong>addNumbers</strong>: adds phone numbers to number group G.</li>
     * <li><strong>deleteNumbers</strong>: deletes phone numbers from number group G.</li>
     * <li><strong>overwriteNumbers</strong>: replaces all phone numbers in number group G. All the original phone numbers are deleted from number group G, and new phone numbers are added to number group G.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>When you replace all phone numbers in number group G, the quantity of original phone numbers in number group G cannot exceed 200.</p>
     * </li>
     * <li><p>You can add up to 200 phone numbers to number group G at a time.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>addNumbers</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC123456</p>
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
