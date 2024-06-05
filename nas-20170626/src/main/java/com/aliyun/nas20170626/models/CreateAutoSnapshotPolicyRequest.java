// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The name of the automatic snapshot policy.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The name must be 2 to 128 characters in length.</p>
     * <p>*   The name must start with a letter.</p>
     * <p>*   The name can contain digits, colons (:), underscores (_), and hyphens (-). It cannot start with `http://` or `https://`.</p>
     * <p>*   This parameter is empty by default.</p>
     */
    @NameInMap("AutoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    /**
     * <p>The type of the file system.</p>
     * <br>
     * <p>Valid value: extreme, which indicates Extreme NAS file systems.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The days of a week on which to create automatic snapshots.</p>
     * <br>
     * <p>Cycle: week.</p>
     * <br>
     * <p>Valid values: 1 to 7. The values from 1 to 7 indicate the seven days in a week from Monday to Sunday.</p>
     * <br>
     * <p>If you want to create multiple auto snapshots within a week, you can specify multiple days from Monday to Sunday and separate the days with commas (,). You can specify a maximum of seven days.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RepeatWeekdays")
    public String repeatWeekdays;

    /**
     * <p>The retention period of auto snapshots.</p>
     * <br>
     * <p>Unit: days.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   \\-1 (default). Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.</p>
     * <p>*   1 to 65536: Auto snapshots are retained for the specified days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The points in time at which auto snapshots were created.</p>
     * <br>
     * <p>Unit: hours.</p>
     * <br>
     * <p>Valid values: 0 to 23. The values from 0 to 23 indicate a total of 24 hours from 00:00 to 23:00. For example, the value 1 indicates 01:00.</p>
     * <br>
     * <p>If you want to create multiple auto snapshots within a day, you can specify multiple points in time and separate the points in time with commas (,). You can specify a maximum of 24 points in time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimePoints")
    public String timePoints;

    public static CreateAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyRequest self = new CreateAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyRequest setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
        return this;
    }
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public CreateAutoSnapshotPolicyRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
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

    public CreateAutoSnapshotPolicyRequest setTimePoints(String timePoints) {
        this.timePoints = timePoints;
        return this;
    }
    public String getTimePoints() {
        return this.timePoints;
    }

}
