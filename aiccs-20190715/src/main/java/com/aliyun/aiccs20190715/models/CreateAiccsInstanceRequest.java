// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class CreateAiccsInstanceRequest extends TeaModel {
    @NameInMap("AccountIds")
    public String accountIds;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceCode")
    public String instanceCode;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ViewUrl")
    public String viewUrl;

    public static CreateAiccsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiccsInstanceRequest self = new CreateAiccsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiccsInstanceRequest setAccountIds(String accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public String getAccountIds() {
        return this.accountIds;
    }

    public CreateAiccsInstanceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateAiccsInstanceRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public CreateAiccsInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateAiccsInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAiccsInstanceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateAiccsInstanceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateAiccsInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAiccsInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAiccsInstanceRequest setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
        return this;
    }
    public String getViewUrl() {
        return this.viewUrl;
    }

}
