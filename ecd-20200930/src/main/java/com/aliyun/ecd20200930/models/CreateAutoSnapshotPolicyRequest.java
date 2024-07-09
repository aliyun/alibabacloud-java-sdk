// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The CRON expression for periodic scheduling.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 2 ? * 1-7</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The name of the automatic snapshot policy. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-). This parameter is empty by default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_auto_policy</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    public static CreateAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyRequest self = new CreateAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateAutoSnapshotPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAutoSnapshotPolicyRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

}
