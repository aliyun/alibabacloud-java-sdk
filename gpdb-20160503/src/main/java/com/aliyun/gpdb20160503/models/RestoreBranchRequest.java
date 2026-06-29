// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RestoreBranchRequest extends TeaModel {
    /**
     * <p>The branch ID that uniquely identifies a Supabase branch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>br-xxxx</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The client idempotency token that ensures the idempotence of retry requests.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The backup branch name. If specified, automatic creation of a backup branch is performed before recovery.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-main</p>
     */
    @NameInMap("PreserveUnderName")
    public String preserveUnderName;

    /**
     * <p>The Supabase project ID associated with the primary branch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spb-xxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID. This parameter is required when you create a primary branch. When you create a sub-branch, the region is inherited from the primary branch by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the source branch from which to recover.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>br-main</p>
     */
    @NameInMap("SourceBranchId")
    public String sourceBranchId;

    /**
     * <p>The LSN of the source branch to recover to.</p>
     * 
     * <strong>example:</strong>
     * <p>0/3522648</p>
     */
    @NameInMap("SourceBranchLsn")
    public String sourceBranchLsn;

    /**
     * <p>The point in time of the source branch to recover to. The value must be within the recoverable time window.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-08T09:11:12Z</p>
     */
    @NameInMap("SourceBranchTimestamp")
    public String sourceBranchTimestamp;

    public static RestoreBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreBranchRequest self = new RestoreBranchRequest();
        return TeaModel.build(map, self);
    }

    public RestoreBranchRequest setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public RestoreBranchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestoreBranchRequest setPreserveUnderName(String preserveUnderName) {
        this.preserveUnderName = preserveUnderName;
        return this;
    }
    public String getPreserveUnderName() {
        return this.preserveUnderName;
    }

    public RestoreBranchRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RestoreBranchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestoreBranchRequest setSourceBranchId(String sourceBranchId) {
        this.sourceBranchId = sourceBranchId;
        return this;
    }
    public String getSourceBranchId() {
        return this.sourceBranchId;
    }

    public RestoreBranchRequest setSourceBranchLsn(String sourceBranchLsn) {
        this.sourceBranchLsn = sourceBranchLsn;
        return this;
    }
    public String getSourceBranchLsn() {
        return this.sourceBranchLsn;
    }

    public RestoreBranchRequest setSourceBranchTimestamp(String sourceBranchTimestamp) {
        this.sourceBranchTimestamp = sourceBranchTimestamp;
        return this;
    }
    public String getSourceBranchTimestamp() {
        return this.sourceBranchTimestamp;
    }

}
