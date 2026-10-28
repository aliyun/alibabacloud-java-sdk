// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobPasswordRequest extends TeaModel {
    /**
     * <p>The instance ID of the data migration, data synchronization, or subscribe instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsl3m1213ye7l****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>l3m1213ye7l****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The database to which the account and password to be modified belong. Valid values:</p>
     * <ul>
     * <li><strong>src</strong>: The source database.</li>
     * <li><strong>dest</strong>: The destination database.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>src</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The new password of the database account.</p>
     * <blockquote>
     * <p>This parameter is required and cannot be the same as the current password.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies the synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong>: Forward.</li>
     * <li><strong>Reverse</strong>: Reverse.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>Forward</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>This parameter is required only when the synchronization topology of the data synchronization instance is two-way synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>The name of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>Specifies whether the node is a seamless integration (Zero-ETL) node. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static ModifyDtsJobPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobPasswordRequest self = new ModifyDtsJobPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobPasswordRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
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

    public ModifyDtsJobPasswordRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
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
