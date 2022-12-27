// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionRequest extends TeaModel {
    // The billable region. Valid values:
    // 
    // *   **CN**: Chinese mainland
    // *   **OverSeas**: outside the Chinese mainland
    // *   **AP1**: Asia Pacific 1
    // *   **AP2**: Asia Pacific 2
    // *   **AP3**: Asia Pacific 3
    // *   **NA**: North America
    // *   **SA**: South America
    // *   **EU**: Europe
    // *   **MEAA**: Middle East and Africa
    // 
    // The default value is the current metering method. Regions inside and outside the Chinese mainland are classified into the **CN** or **OverSeas** billable regions. Billable regions inside the Chinese mainland include **CN**. Billable regions outside the Chinese mainland include **AP1**, **AP2**, **AP3**, **NA**, **SA**, **EU**, and **MEAA**.
    // 
    // >  For more information about billable regions, see [Billable regions](~~142221~~).
    @NameInMap("Area")
    public String area;

    // The billable item. A value of flow indicates bandwidth.
    @NameInMap("Dimension")
    public String dimension;

    // The default value is the current time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    // 
    // >  The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The default value is 00:00 on the first day of the current month. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCdnUserBillPredictionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillPredictionRequest self = new DescribeCdnUserBillPredictionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillPredictionRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeCdnUserBillPredictionRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeCdnUserBillPredictionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCdnUserBillPredictionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnUserBillPredictionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
