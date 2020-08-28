// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyExRequest extends TeaModel {
    @NameInMap("regionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("autoSnapshotPolicyId")
    @Validation(required = true)
    public String autoSnapshotPolicyId;

    @NameInMap("autoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    @NameInMap("timePoints")
    public String timePoints;

    @NameInMap("repeatWeekdays")
    public String repeatWeekdays;

    @NameInMap("retentionDays")
    public Integer retentionDays;

    @NameInMap("EnableCrossRegionCopy")
    public Boolean enableCrossRegionCopy;

    @NameInMap("TargetCopyRegions")
    public String targetCopyRegions;

    @NameInMap("CopiedSnapshotsRetentionDays")
    public Integer copiedSnapshotsRetentionDays;

    public static ModifyAutoSnapshotPolicyExRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyExRequest self = new ModifyAutoSnapshotPolicyExRequest();
        return TeaModel.build(map, self);
    }

}
