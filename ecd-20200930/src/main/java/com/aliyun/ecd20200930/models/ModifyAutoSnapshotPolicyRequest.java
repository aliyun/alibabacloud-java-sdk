// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The cron expression.</p>
     * 
     * <strong>example:</strong>
     * <p>0 20 16 ? * 1,2,3,4,5,6,7</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("DiskType")
    public String diskType;

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
     * <p>The name of the automatic snapshot policy. The name must be 2 to 128 characters long, start with a letter or a Chinese character, and must not start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-). The default is an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>SystemAutoSnapshot</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to get a list of regions where Elastic Desktop Service is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of days to retain automatic snapshots. The value must be an integer from 1 to 180.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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

    public ModifyAutoSnapshotPolicyRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
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
