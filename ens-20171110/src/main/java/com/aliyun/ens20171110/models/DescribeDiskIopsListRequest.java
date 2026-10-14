// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDiskIopsListRequest extends TeaModel {
    /**
     * <p>The disk ID in the format of d-***********.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-5tzm9wnhzlhjzcbtxo465****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The end time in the format of yyyy-MM-dd HH:mm:ss. The time span between the start time and end time cannot exceed one day.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-14 23:59:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start time in the format of yyyy-MM-dd HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-14 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDiskIopsListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskIopsListRequest self = new DescribeDiskIopsListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskIopsListRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeDiskIopsListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiskIopsListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
