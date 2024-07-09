// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataRequest extends TeaModel {
    /**
     * <p>The billable region. Valid values:</p>
     * <ul>
     * <li><strong>CN</strong> (default): inside the Chinese mainland</li>
     * <li><strong>OverSeas</strong>: outside the Chinese mainland</li>
     * <li><strong>AP1</strong>: Asia Pacific 1</li>
     * <li><strong>AP2</strong>: Asia Pacific 2</li>
     * <li><strong>AP3</strong>: Asia Pacific 3</li>
     * <li><strong>NA</strong>: North America</li>
     * <li><strong>SA</strong>: South America</li>
     * <li><strong>EU</strong>: Europe</li>
     * <li><strong>MEAA</strong>: Middle East and Africa</li>
     * <li><strong>all</strong>: all the preceding billable regions</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The protocol of the data that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>http:</strong> HTTP</li>
     * <li><strong>https:</strong> HTTPS</li>
     * <li><strong>quic</strong>: QUIC</li>
     * <li><strong>all</strong> (default): HTTP, HTTPS, and QUIC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("DataProtocol")
    public String dataProtocol;

    /**
     * <p>The accelerated domain name. You can specify up to 100 domain names in each request. Separate multiple domain names with commas (,).</p>
     * <blockquote>
     * <p>If you leave this parameter empty, the usage data of all accelerated domain names in your Alibaba Cloud account is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The maximum time range that can be specified is 31 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T22:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the data that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>bps</strong>: bandwidth</li>
     * <li><strong>traf</strong>: traffic</li>
     * <li><strong>acc</strong>: requests</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>acc</strong>, the <strong>Area</strong> parameter is not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The time granularity of the data entries. Unit: seconds. Valid values: <strong>300</strong> (5 minutes), <strong>3600</strong> (1 hour), and <strong>86400</strong> (1 day).</p>
     * <ul>
     * <li>If <strong>Interval</strong> is set to <strong>300</strong>, you can query usage data in the last 6 months. The maximum time range per query that can be specified is 3 days.</li>
     * <li>If <strong>Interval</strong> is set to <strong>3600</strong> or <strong>86400</strong>, you can query usage data of the previous year.</li>
     * <li>If you leave the <strong>Interval</strong> parameter empty, the maximum time range that you can query is 1 month. If you specify a time range of 1 to 3 days, the time interval between the entries that are returned is 1 hour. If you specify a time range of at least 4 days, the time interval between the entries that are returned is 1 day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>Data is collected every 5 minutes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of content that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>static</strong>: static content</li>
     * <li><strong>dynamic</strong>: dynamic content</li>
     * <li><strong>all</strong> (default): both static and dynamic content</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDomainUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainUsageDataRequest self = new DescribeDomainUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainUsageDataRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeDomainUsageDataRequest setDataProtocol(String dataProtocol) {
        this.dataProtocol = dataProtocol;
        return this;
    }
    public String getDataProtocol() {
        return this.dataProtocol;
    }

    public DescribeDomainUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainUsageDataRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeDomainUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDomainUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainUsageDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
