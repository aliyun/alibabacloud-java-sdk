// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobPasswordRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>Specifies the database to which the password belongs. Valid values:</p>
     * <br>
     * <p>*   **src**: source database</p>
     * <p>*   **dest**: destination database</p>
     * <br>
     * <p>>  This parameter must be specified.</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The new password of the account.</p>
     * <br>
     * <p>>  This parameter must be specified and cannot be the same as the current password.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the region where the DTS instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The account of the source or destination database.</p>
     * <br>
     * <p>>  This parameter must be specified.</p>
     */
    @NameInMap("UserName")
    public String userName;

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

    public ModifyDtsJobPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
