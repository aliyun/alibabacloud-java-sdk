// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetBackupLocalRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>Specifies whether to enable the feature to forcibly delete binary log files if the used storage space reaches 90% of the total storage space or the remaining storage space is less than 5 GB. Valid values: 1 and 0. A value of 1 specifies to enable this feature. A value of 0 specifies not to enable this feature.</p>
     */
    @NameInMap("HighSpaceUsageProtection")
    public String highSpaceUsageProtection;

    /**
     * <p>The number of hours for which log backup files are retained on the instance. Valid values: 0 to 168. Default value: 18. A value of 0 indicates that log backup files are not retained.</p>
     */
    @NameInMap("LocalLogRetentionHours")
    public String localLogRetentionHours;

    /**
     * <p>The maximum storage space usage that is allowed for log files on the instance. Valid values: 0 to 50. Default value: 30.</p>
     */
    @NameInMap("LocalLogRetentionSpace")
    public String localLogRetentionSpace;

    public static SetBackupLocalRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBackupLocalRequest self = new SetBackupLocalRequest();
        return TeaModel.build(map, self);
    }

    public SetBackupLocalRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetBackupLocalRequest setHighSpaceUsageProtection(String highSpaceUsageProtection) {
        this.highSpaceUsageProtection = highSpaceUsageProtection;
        return this;
    }
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    public SetBackupLocalRequest setLocalLogRetentionHours(String localLogRetentionHours) {
        this.localLogRetentionHours = localLogRetentionHours;
        return this;
    }
    public String getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    public SetBackupLocalRequest setLocalLogRetentionSpace(String localLogRetentionSpace) {
        this.localLogRetentionSpace = localLogRetentionSpace;
        return this;
    }
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

}
