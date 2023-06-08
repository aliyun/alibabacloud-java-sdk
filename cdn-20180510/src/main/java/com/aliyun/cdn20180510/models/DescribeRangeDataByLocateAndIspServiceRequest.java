// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRangeDataByLocateAndIspServiceRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time. The maximum time range that can be specified is 1 hour.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the ISP. You can specify only one ISP name in each call.</p>
     * <br>
     * <p>You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISPs.</p>
     */
    @NameInMap("IspNames")
    public String ispNames;

    /**
     * <p>The names of the regions. Separate multiple region names with commas (,).</p>
     * <br>
     * <p>You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query the most recent region list.</p>
     */
    @NameInMap("LocationNames")
    public String locationNames;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
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
