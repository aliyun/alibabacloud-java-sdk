// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserBillPredictionRequest extends TeaModel {
    /**
     * <p>The end time. The time must be in UTC and follow the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-01T05:45:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. The time must be in UTC and follow the <em>yyyy-mm-dd</em>T<em>hh:mm:ss</em>Z format.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-01T05:40:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveUserBillPredictionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserBillPredictionRequest self = new DescribeLiveUserBillPredictionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserBillPredictionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveUserBillPredictionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveUserBillPredictionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveUserBillPredictionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
