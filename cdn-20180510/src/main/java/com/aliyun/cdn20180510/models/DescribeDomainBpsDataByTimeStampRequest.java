// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByTimeStampRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each query.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The names of the Internet service providers (ISPs). Separate multiple ISP names with commas (,).</p>
     * <br>
     * <p>You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.</p>
     */
    @NameInMap("IspNames")
    public String ispNames;

    /**
     * <p>The names of the regions. Separate multiple regions with commas (,).</p>
     * <br>
     * <p>You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.</p>
     */
    @NameInMap("LocationNames")
    public String locationNames;

    /**
     * <p>The beginning of the time range that was queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <br>
     * <p>The data is collected at an interval of five minutes.</p>
     */
    @NameInMap("TimePoint")
    public String timePoint;

    public static DescribeDomainBpsDataByTimeStampRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataByTimeStampRequest self = new DescribeDomainBpsDataByTimeStampRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataByTimeStampRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainBpsDataByTimeStampRequest setIspNames(String ispNames) {
        this.ispNames = ispNames;
        return this;
    }
    public String getIspNames() {
        return this.ispNames;
    }

    public DescribeDomainBpsDataByTimeStampRequest setLocationNames(String locationNames) {
        this.locationNames = locationNames;
        return this;
    }
    public String getLocationNames() {
        return this.locationNames;
    }

    public DescribeDomainBpsDataByTimeStampRequest setTimePoint(String timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public String getTimePoint() {
        return this.timePoint;
    }

}
