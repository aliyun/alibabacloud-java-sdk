// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobPasswordRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>l3m1213ye7l****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>Specifies the database to which the password belongs. Valid values:</p>
     * <ul>
     * <li><strong>src</strong>: source database</li>
     * <li><strong>dest</strong>: destination database</li>
     * </ul>
     * <blockquote>
     * <p> This parameter must be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>src</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The new password of the account.</p>
     * <blockquote>
     * <p> This parameter must be specified and cannot be the same as the current password.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The account of the source or destination database.</p>
     * <blockquote>
     * <p> This parameter must be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("UserName")
    public String userName;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static ModifyDtsJobPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobPasswordRequest self = new ModifyDtsJobPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobPasswordRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobPasswordRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ModifyDtsJobPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyDtsJobPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobPasswordRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDtsJobPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifyDtsJobPasswordRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
