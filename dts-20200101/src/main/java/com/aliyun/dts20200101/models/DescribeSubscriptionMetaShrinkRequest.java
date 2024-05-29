// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionMetaShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the distributed change tracking instance.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the region in which the change tracking instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the consumer group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The IDs of all subtasks in the distributed change tracking task. Separate multiple subtask IDs with commas (,).</p>
     * <br>
     * <p>>  You must specify at least one of the SubMigrationJobIds and **Topics** parameters. We recommend that you specify the SubMigrationJobIds parameter.</p>
     */
    @NameInMap("SubMigrationJobIds")
    public String subMigrationJobIdsShrink;

    /**
     * <p>The topics of all subtasks in the distributed change tracking task. Separate multiple topics with commas (,).</p>
     * <br>
     * <p>>  You must specify at least one of the **SubMigrationJobIds** and Topics parameters. We recommend that you specify the **SubMigrationJobIds** parameter.</p>
     */
    @NameInMap("Topics")
    public String topicsShrink;

    public static DescribeSubscriptionMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionMetaShrinkRequest self = new DescribeSubscriptionMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionMetaShrinkRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DescribeSubscriptionMetaShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSubscriptionMetaShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSubscriptionMetaShrinkRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public DescribeSubscriptionMetaShrinkRequest setSubMigrationJobIdsShrink(String subMigrationJobIdsShrink) {
        this.subMigrationJobIdsShrink = subMigrationJobIdsShrink;
        return this;
    }
    public String getSubMigrationJobIdsShrink() {
        return this.subMigrationJobIdsShrink;
    }

    public DescribeSubscriptionMetaShrinkRequest setTopicsShrink(String topicsShrink) {
        this.topicsShrink = topicsShrink;
        return this;
    }
    public String getTopicsShrink() {
        return this.topicsShrink;
    }

}
