// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupSetsRequest extends TeaModel {
    /**
     * <p>The ID of the DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The end of the query time which is in timestamp format (measured in millisecond) .</p>
     * <br>
     * <p>>  The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the query time which is in timestamp format (measured in millisecond).</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeBackupSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetsRequest self = new DescribeBackupSetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeBackupSetsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeBackupSetsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
