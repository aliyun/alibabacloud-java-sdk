// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The CRON expression.</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The ID of the automatic snapshot policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The name of the automatic snapshot policy. The name must be 2 to 128 characters in length. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter but cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). Default value: null.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The ID of the region where the automatic snapshot policy is created.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The retention period of automatic snapshots. Unit: days. Valid values:</p>
     * <br>
     * <p>*   1 (default): The automatic snapshots are permanently retained.</p>
     * <p>*   1 to 65536: The automatic snapshots are retained for the specified number of days.</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    public static ModifyAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyRequest self = new ModifyAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public ModifyAutoSnapshotPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ModifyAutoSnapshotPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ModifyAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAutoSnapshotPolicyRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

}
