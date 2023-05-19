// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    @NameInMap("Dimension")
    public String dimension;

    @NameInMap("EndTime")
    public String endTime;

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
