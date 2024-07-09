// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByTimeStampRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The names of the Internet service providers (ISPs). Separate multiple ISPs with commas (,).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uni***,tele***</p>
     */
    @NameInMap("IspNames")
    public String ispNames;

    /**
     * <p>The regions. Separate multiple regions with commas (,).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liaoning,guangxi</p>
     */
    @NameInMap("LocationNames")
    public String locationNames;

    /**
     * <p>The point in time to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The data is collected every 5 minutes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-11-30T05:40:00Z</p>
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
