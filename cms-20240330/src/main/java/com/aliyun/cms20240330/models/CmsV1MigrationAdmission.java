// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CmsV1MigrationAdmission extends TeaModel {
    /**
     * <p>The real-time new migration eligibility evaluated for the current target primary account, which does not replace RAM, account ownership, or workspace validations.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("newMigrationAllowed")
    public Boolean newMigrationAllowed;

    /**
     * <p>The summary of the normalized policy, which excludes the UID list and is not an authorization credential.</p>
     * 
     * <strong>example:</strong>
     * <p>03ac8b5b92cb9c2675119d64c31d2520c069647aa9b88979df1bb115472c02b4</p>
     */
    @NameInMap("policyRevision")
    public String policyRevision;

    /**
     * <p>The reason why the new migration is denied. CMSV1_MIGRATION_NOT_ADMITTED indicates that the migration is not admitted, and CMSV1_MIGRATION_POLICY_UNAVAILABLE indicates that the policy is unavailable. Historical tasks remain queryable.</p>
     * 
     * <strong>example:</strong>
     * <p>CMSV1_MIGRATION_NOT_ADMITTED</p>
     */
    @NameInMap("reason")
    public String reason;

    public static CmsV1MigrationAdmission build(java.util.Map<String, ?> map) throws Exception {
        CmsV1MigrationAdmission self = new CmsV1MigrationAdmission();
        return TeaModel.build(map, self);
    }

    public CmsV1MigrationAdmission setNewMigrationAllowed(Boolean newMigrationAllowed) {
        this.newMigrationAllowed = newMigrationAllowed;
        return this;
    }
    public Boolean getNewMigrationAllowed() {
        return this.newMigrationAllowed;
    }

    public CmsV1MigrationAdmission setPolicyRevision(String policyRevision) {
        this.policyRevision = policyRevision;
        return this;
    }
    public String getPolicyRevision() {
        return this.policyRevision;
    }

    public CmsV1MigrationAdmission setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
