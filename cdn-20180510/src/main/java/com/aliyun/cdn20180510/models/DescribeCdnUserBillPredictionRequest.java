// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionRequest extends TeaModel {
    /**
     * <p>The billable region. Valid values:</p>
     * <br>
     * <p>*   **CN**: the Chinese mainland</p>
     * <p>*   **OverSeas**: outside the Chinese mainland</p>
     * <p>*   **AP1**: Asia Pacific 1</p>
     * <p>*   **AP2**: Asia Pacific 2</p>
     * <p>*   **AP3**: Asia Pacific 3</p>
     * <p>*   **NA**: North America</p>
     * <p>*   **SA**: South America</p>
     * <p>*   **EU**: Europe</p>
     * <p>*   **MEAA**: Middle East and Africa</p>
     * <br>
     * <p>By default, the value of this parameter is determined by the metering method that is currently used. Regions inside and outside the Chinese mainland are classified into the **CN** and **OverSeas** billable regions. Billable regions inside the Chinese mainland include **CN**. Billable regions outside the Chinese mainland include **AP1**, **AP2**, **AP3**, **NA**, **SA**, **EU**, and **MEAA**.</p>
     * <br>
     * <p>> For more information about billable regions, see [Billable regions](~~142221~~).</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The billable item. A value of flow specifies bandwidth.</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The end time of the estimation. The default value is the current time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start time of the estimation. The default value is 00:00 on the first day of the current month. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
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

    public DescribeCdnUserBillPredictionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
