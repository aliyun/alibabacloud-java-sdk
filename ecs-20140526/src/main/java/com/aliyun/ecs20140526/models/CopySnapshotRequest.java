// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopySnapshotRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<CopySnapshotRequestTag> tag;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DestinationRegionId")
    @Validation(required = true)
    public String destinationRegionId;

    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    @NameInMap("DestinationSnapshotName")
    @Validation(required = true)
    public String destinationSnapshotName;

    @NameInMap("DestinationSnapshotDescription")
    @Validation(required = true)
    public String destinationSnapshotDescription;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    public static CopySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CopySnapshotRequest self = new CopySnapshotRequest();
        return TeaModel.build(map, self);
    }

    public static class CopySnapshotRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CopySnapshotRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CopySnapshotRequestTag self = new CopySnapshotRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
