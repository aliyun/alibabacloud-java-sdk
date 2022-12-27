// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRangeDataByLocateAndIspServiceRequest extends TeaModel {
    // The accelerated domain name.
    @NameInMap("DomainNames")
    public String domainNames;

    // The end of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    // 
    // >  The end time must be later than the start time. The interval between the end time and the start time cannot exceed 1 hour.
    @NameInMap("EndTime")
    public String endTime;

    // The name of the ISP. You can specify only one ISP name in each call.
    // 
    // You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISPs.
    @NameInMap("IspNames")
    public String ispNames;

    // The names of the regions. Separate regions with commas (,).
    // 
    // You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query the most recent region list.
    @NameInMap("LocationNames")
    public String locationNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The beginning of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
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

    public DescribeRangeDataByLocateAndIspServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRangeDataByLocateAndIspServiceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
