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

    public CreateAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAutoSnapshotPolicyRequest setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
        return this;
    }
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public CreateAutoSnapshotPolicyRequest setTimePoints(String timePoints) {
        this.timePoints = timePoints;
        return this;
    }
    public String getTimePoints() {
        return this.timePoints;
    }

    public CreateAutoSnapshotPolicyRequest setRepeatWeekdays(String repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    public CreateAutoSnapshotPolicyRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CreateAutoSnapshotPolicyRequest setEnableCrossRegionCopy(Boolean enableCrossRegionCopy) {
        this.enableCrossRegionCopy = enableCrossRegionCopy;
        return this;
    }
    public Boolean getEnableCrossRegionCopy() {
        return this.enableCrossRegionCopy;
    }

    public CreateAutoSnapshotPolicyRequest setTargetCopyRegions(String targetCopyRegions) {
        this.targetCopyRegions = targetCopyRegions;
        return this;
    }
    public String getTargetCopyRegions() {
        return this.targetCopyRegions;
    }

    public CreateAutoSnapshotPolicyRequest setCopiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
        this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
        return this;
    }
    public Integer getCopiedSnapshotsRetentionDays() {
        return this.copiedSnapshotsRetentionDays;
    }

    public CreateAutoSnapshotPolicyRequest setTag(java.util.List<CreateAutoSnapshotPolicyRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAutoSnapshotPolicyRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateAutoSnapshotPolicyRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAutoSnapshotPolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoSnapshotPolicyRequestTag self = new CreateAutoSnapshotPolicyRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAutoSnapshotPolicyRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoSnapshotPolicyRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
