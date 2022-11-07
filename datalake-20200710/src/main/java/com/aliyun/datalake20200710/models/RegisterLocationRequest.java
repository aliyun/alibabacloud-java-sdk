// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RegisterLocationRequest extends TeaModel {
    @NameInMap("InventoryCollectEnabled")
    public Boolean inventoryCollectEnabled;

    @NameInMap("Location")
    public String location;

    @NameInMap("OssLogCollectEnabled")
    public Boolean ossLogCollectEnabled;

    @NameInMap("RoleName")
    public String roleName;

    public static RegisterLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterLocationRequest self = new RegisterLocationRequest();
        return TeaModel.build(map, self);
    }

    public RegisterLocationRequest setInventoryCollectEnabled(Boolean inventoryCollectEnabled) {
        this.inventoryCollectEnabled = inventoryCollectEnabled;
        return this;
    }
    public Boolean getInventoryCollectEnabled() {
        return this.inventoryCollectEnabled;
    }

    public RegisterLocationRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public RegisterLocationRequest setOssLogCollectEnabled(Boolean ossLogCollectEnabled) {
        this.ossLogCollectEnabled = ossLogCollectEnabled;
        return this;
    }
    public Boolean getOssLogCollectEnabled() {
        return this.ossLogCollectEnabled;
    }

    public RegisterLocationRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
