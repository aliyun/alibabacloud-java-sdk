// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRangeDataByLocateAndIspServiceRequest extends TeaModel {
    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IspNames")
    public String ispNames;

    @NameInMap("LocationNames")
    public String locationNames;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRangeDataByLocateAndIspServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRangeDataByLocateAndIspServiceRequest self = new DescribeRangeDataByLocateAndIspServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRangeDataByLocateAndIspServiceRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public DescribeRangeDataByLocateAndIspServiceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRangeDataByLocateAndIspServiceRequest setIspNames(String ispNames) {
        this.ispNames = ispNames;
        return this;
    }
    public String getIspNames() {
        return this.ispNames;
    }

    public DescribeRangeDataByLocateAndIspServiceRequest setLocationNames(String locationNames) {
        this.locationNames = locationNames;
        return this;
    }
    public String getLocationNames() {
        return this.locationNames;
    }

    public DescribeRangeDataByLocateAndIspServiceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
