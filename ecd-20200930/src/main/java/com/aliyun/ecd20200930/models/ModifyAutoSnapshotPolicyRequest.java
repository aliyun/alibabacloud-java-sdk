// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The CRON expression.</p>
     * 
     * <strong>example:</strong>
     * <p>0 20 16 ? * 1,2,3,4,5,6,7</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The ID of the automatic snapshot policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-itcmrhqt01tdo****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The name of the automatic snapshot policy. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-). This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>Automatic system snapshot</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The retention period of the automatic snapshots. Unit: days. Valid values: 1 to 180.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
