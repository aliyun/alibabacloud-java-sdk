// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainUsageDataRequest extends TeaModel {
    /**
     * <p>The billable region. Valid values:</p>
     * <ul>
     * <li><strong>CN</strong>: Chinese mainland</li>
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
     * <p>Default value: <strong>CN</strong></p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The protocol of the data to query. Valid values:</p>
     * <ul>
     * <li><strong>quic</strong>: Quick UDP Internet Connections (QUIC)</li>
     * <li><strong>https</strong>: HTTPS</li>
     * <li><strong>http</strong>: HTTP</li>
     * <li><strong>all</strong>: all the preceding protocols</li>
     * </ul>
     * <p>Default value: <strong>all</strong></p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("DataProtocol")
    public String dataProtocol;

    /**
     * <p>The accelerated domain name. You can specify up to 100 domain names in each request. Separate multiple domain names with commas (,).</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the usage data of all accelerated domain names that belong to your Alibaba Cloud account is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time. The maximum time range that can be queried is 31 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T22:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of data that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>bps</strong>: bandwidth</li>
     * <li><strong>traf</strong>: traffic</li>
     * <li><strong>acc</strong>: requests</li>
     * </ul>
     * <blockquote>
     * <p> <strong>acc</strong> does not support the <strong>Area</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The time interval between the data entries to return. Unit: seconds.</p>
     * <p>The time interval varies with the maximum time range per query. Valid values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see <strong>Usage notes</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The minimum time granularity at which the data is queried is 5 minutes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of the requests. Valid values:</p>
     * <ul>
     * <li><strong>static</strong>: static requests</li>
     * <li><strong>dynamic</strong>: dynamic requests</li>
     * <li><strong>all</strong>: all requests</li>
     * </ul>
     * <p>Default value: <strong>all</strong></p>
     * 
     * <strong>example:</strong>
     * <p>dynamic</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDcdnDomainUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainUsageDataRequest self = new DescribeDcdnDomainUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainUsageDataRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeDcdnDomainUsageDataRequest setDataProtocol(String dataProtocol) {
        this.dataProtocol = dataProtocol;
        return this;
    }
    public String getDataProtocol() {
        return this.dataProtocol;
    }

    public DescribeDcdnDomainUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainUsageDataRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeDcdnDomainUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDcdnDomainUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainUsageDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
