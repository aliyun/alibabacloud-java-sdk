// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CopySnapshotShrinkRequest extends TeaModel {
    /**
     * <p>The destination nodes.</p>
     */
    @NameInMap("DestinationRegionIds")
    public String destinationRegionIdsShrink;

    /**
     * <p>The description of the snapshot. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("DestinationSnapshotDescription")
    public String destinationSnapshotDescription;

    /**
     * <p>The name of the snapshot. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("DestinationSnapshotName")
    public String destinationSnapshotName;

    /**
     * <p>The ID of the source snapshot.</p>
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

    public CopySnapshotShrinkRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
