// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RegisterLocationRequest extends TeaModel {
    /**
     * <p>Whether to enable OSS bucket inventory</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InventoryCollectEnabled")
    public Boolean inventoryCollectEnabled;

    /**
     * <p>Registered OSS path</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://mybucket/</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>Whether to enable OSS log storage</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OssLogCollectEnabled")
    public Boolean ossLogCollectEnabled;

    /**
     * <p>RAM role name</p>
     * <blockquote>
     * <p> Data Lake Formation read and write data in the OSS path. If you want to AliyunDLFWorkFlowDefaultRole a role, the role is automatically built in to the role. Alternatively, you can create a custom role, but you must manually ensure that the role has the read and write permissions on the corresponding path.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunDLFWorkFlowDefaultRole</p>
     */
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
