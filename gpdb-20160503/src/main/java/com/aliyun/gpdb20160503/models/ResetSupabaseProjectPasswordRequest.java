// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResetSupabaseProjectPasswordRequest extends TeaModel {
    /**
     * <p>The password of the database account.</p>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Pw123456</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Supabase Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-tyarplz****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResetSupabaseProjectPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetSupabaseProjectPasswordRequest self = new ResetSupabaseProjectPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetSupabaseProjectPasswordRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public ResetSupabaseProjectPasswordRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ResetSupabaseProjectPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
