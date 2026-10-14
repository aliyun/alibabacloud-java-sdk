// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CopySnapshotShrinkRequest extends TeaModel {
    /**
     * <p>The list of destination edge zone IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationRegionIds")
    public String destinationRegionIdsShrink;

    /**
     * <p>The description of the snapshot. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("DestinationSnapshotDescription")
    public String destinationSnapshotDescription;

    /**
     * <p>The display name of the snapshot. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testSnapshotName</p>
     */
    @NameInMap("DestinationSnapshotName")
    public String destinationSnapshotName;

    /**
     * <p>The billing cycle of the instance. Valid values:</p>
     * <ul>
     * <li>Hour</li>
     * <li>Day</li>
     * <li>Month</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("InstanceBillingCycle")
    public String instanceBillingCycle;

    /**
     * <p>The ID of the source snapshot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-bp1c0doj0taqyzzl****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static CopySnapshotShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CopySnapshotShrinkRequest self = new CopySnapshotShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CopySnapshotShrinkRequest setDestinationRegionIdsShrink(String destinationRegionIdsShrink) {
        this.destinationRegionIdsShrink = destinationRegionIdsShrink;
        return this;
    }
    public String getDestinationRegionIdsShrink() {
        return this.destinationRegionIdsShrink;
    }

    public CopySnapshotShrinkRequest setDestinationSnapshotDescription(String destinationSnapshotDescription) {
        this.destinationSnapshotDescription = destinationSnapshotDescription;
        return this;
    }
    public String getDestinationSnapshotDescription() {
        return this.destinationSnapshotDescription;
    }

    public CopySnapshotShrinkRequest setDestinationSnapshotName(String destinationSnapshotName) {
        this.destinationSnapshotName = destinationSnapshotName;
        return this;
    }
    public String getDestinationSnapshotName() {
        return this.destinationSnapshotName;
    }

    public CopySnapshotShrinkRequest setInstanceBillingCycle(String instanceBillingCycle) {
        this.instanceBillingCycle = instanceBillingCycle;
        return this;
    }
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    public CopySnapshotShrinkRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
