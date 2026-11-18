// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseUserAllowOrgCreationRequest extends TeaModel {
    /**
     * <p>Specifies whether the user is allowed to create organizations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowOrgCreation")
    public Boolean allowOrgCreation;

    /**
     * <p>The Langfuse instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lfs-2ze1n52*******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The email address of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:alice@company.com">alice@company.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyLangfuseUserAllowOrgCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseUserAllowOrgCreationRequest self = new ModifyLangfuseUserAllowOrgCreationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseUserAllowOrgCreationRequest setAllowOrgCreation(Boolean allowOrgCreation) {
        this.allowOrgCreation = allowOrgCreation;
        return this;
    }
    public Boolean getAllowOrgCreation() {
        return this.allowOrgCreation;
    }

    public ModifyLangfuseUserAllowOrgCreationRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyLangfuseUserAllowOrgCreationRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ModifyLangfuseUserAllowOrgCreationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
