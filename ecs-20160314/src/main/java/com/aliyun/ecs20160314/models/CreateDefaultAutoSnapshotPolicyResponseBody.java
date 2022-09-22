// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDefaultAutoSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    @NameInMap("AutoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    @NameInMap("RepeatWeekdays")
    public String repeatWeekdays;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    @NameInMap("TimePoints")
    public String timePoints;

    public static CreateDefaultAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultAutoSnapshotPolicyResponseBody self = new CreateDefaultAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefaultAutoSnapshotPolicyResponseBody setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public CreateDefaultAutoSnapshotPolicyResponseBody setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
        return this;
    }
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public CreateDefaultAutoSnapshotPolicyResponseBody setRepeatWeekdays(String repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    public CreateDefaultAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDefaultAutoSnapshotPolicyResponseBody setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CreateDefaultAutoSnapshotPolicyResponseBody setTimePoints(String timePoints) {
        this.timePoints = timePoints;
        return this;
    }
    public String getTimePoints() {
        return this.timePoints;
    }

}
