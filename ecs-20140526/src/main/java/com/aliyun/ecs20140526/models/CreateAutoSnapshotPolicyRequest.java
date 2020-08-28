// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("regionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("autoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    @NameInMap("timePoints")
    @Validation(required = true)
    public String timePoints;

    @NameInMap("repeatWeekdays")
    @Validation(required = true)
    public String repeatWeekdays;

    @NameInMap("retentionDays")
    @Validation(required = true)
    public Integer retentionDays;

    @NameInMap("EnableCrossRegionCopy")
    public Boolean enableCrossRegionCopy;

    @NameInMap("TargetCopyRegions")
    public String targetCopyRegions;

    @NameInMap("CopiedSnapshotsRetentionDays")
    public Integer copiedSnapshotsRetentionDays;

    @NameInMap("Tag")
    public java.util.List<CreateAutoSnapshotPolicyRequestTag> tag;

    public static CreateAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyRequest self = new CreateAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateAutoSnapshotPolicyRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CreateAutoSnapshotPolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoSnapshotPolicyRequestTag self = new CreateAutoSnapshotPolicyRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
