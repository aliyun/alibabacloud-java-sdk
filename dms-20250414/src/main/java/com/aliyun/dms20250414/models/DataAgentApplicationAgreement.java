// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DataAgentApplicationAgreement extends TeaModel {
    /**
     * <p>The expiration time of the agreement in ISO 8601 UTC string format. This field is omitted if the agreement is unsigned. The agreement expires when this time is reached. The default validity period is 10 calendar years from the signing date.</p>
     * 
     * <strong>example:</strong>
     * <p>2036-11-23T08:00:00Z</p>
     */
    @NameInMap("ExpiresAt")
    public String expiresAt;

    /**
     * <p>The region of the workspace to which the agreement belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The signing time in ISO 8601 UTC string format. This field is omitted if the agreement is unsigned. Repeated signing within the validity period retains the original time, and re-signing after expiration updates the time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-23T08:00:00Z</p>
     */
    @NameInMap("SignedAt")
    public String signedAt;

    /**
     * <p>The agreement status. Valid values: NOT_SIGNED (unsigned), EXPIRED (expired), and SIGNED (signed and valid). Both NOT_SIGNED and EXPIRED are business statuses returned upon a successful query.</p>
     * 
     * <strong>example:</strong>
     * <p>SIGNED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The stable identifier of the workspace to which the agreement belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>62q1xxxxxxxxxxxxxxxxxxx0</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DataAgentApplicationAgreement build(java.util.Map<String, ?> map) throws Exception {
        DataAgentApplicationAgreement self = new DataAgentApplicationAgreement();
        return TeaModel.build(map, self);
    }

    public DataAgentApplicationAgreement setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public DataAgentApplicationAgreement setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DataAgentApplicationAgreement setSignedAt(String signedAt) {
        this.signedAt = signedAt;
        return this;
    }
    public String getSignedAt() {
        return this.signedAt;
    }

    public DataAgentApplicationAgreement setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataAgentApplicationAgreement setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
