// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateAxgGroupRequest extends TeaModel {
    /**
     * <p>The name of number group G. If the name of number group G is not specified, the ID of number group G is used as the name of number group G.</p>
     * <blockquote>
     * <p> The value must be 1 to 128 characters in length.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The phone numbers that you add to number group G. Separate multiple phone numbers with commas (,). A maximum of 200 phone numbers can be added to number group G.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****,1380000****</p>
     */
    @NameInMap("Numbers")
    public String numbers;

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

    /**
     * <p>The remarks of number group G. The value must be 0 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateAxgGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAxgGroupRequest self = new CreateAxgGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAxgGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAxgGroupRequest setNumbers(String numbers) {
        this.numbers = numbers;
        return this;
    }
    public String getNumbers() {
        return this.numbers;
    }

    public CreateAxgGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAxgGroupRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public CreateAxgGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateAxgGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAxgGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
