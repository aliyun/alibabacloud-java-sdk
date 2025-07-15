// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataRequest extends TeaModel {
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
     * <li><strong>all</strong>: all regions</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, the default value CN is used. Alibaba Cloud supports the following countries and regions outside the Chinese mainland: - Asia Pacific 1: Hong Kong (China), Macao (China), Taiwan (China), Japan, and Southeast Asia excluding Vietnam and Indonesia. - Asia Pacific 2: Indonesia, South Korea, and Vietnam. - Asia Pacific 3: Australia and New Zealand. - North America: US and Canada. - South America: Brazil. Europe: Ukraine, UK, France, Netherlands, Spain, Italy, Sweden, and Germany. - Middle East and Africa: South Africa, Oman, UAE, and Kuwait.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The protocol of the data to query. Valid values:</p>
     * <ul>
     * <li><strong>http</strong>: HTTP</li>
     * <li><strong>https</strong>: HTTPS</li>
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
     * <p>The domain name.</p>
     * <ul>
     * <li>You can query one or more domain names. If you specify multiple domain names, separate them with commas (,).</li>
     * <li>If you leave this parameter empty, the data of all domain names within your Alibaba Cloud account is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>The end time must be later than the start time. The maximum time range that you can specify is <strong>31</strong> days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The category of the resource usage data to query. Valid values:</p>
     * <ul>
     * <li><strong>bps</strong>: streaming bandwidth</li>
     * <li><strong>traf</strong>: streaming traffic</li>
     * <li><strong>req_traf</strong>: stream ingest traffic if you set Type to push, or stream relay traffic if you set Type to push_proxy</li>
     * <li><strong>req_bps</strong>: stream ingest bandwidth if you set Type to push, or stream relay bandwidth if you set Type to push_proxy</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>traf</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The time interval between the data entries to return. Unit: seconds. Valid values: <strong>300</strong> (5 minutes), <strong>3600</strong> (1 hour), and <strong>86400</strong> (1 day).</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of the resource usage data to query.</p>
     * <p>Valid values if you set <strong>Field</strong> to <strong>bps</strong> or <strong>traf</strong>:</p>
     * <ul>
     * <li><strong>rts</strong>: bandwidth or traffic for Real-Time Streaming (RTS)</li>
     * <li><strong>quic</strong>: bandwidth or traffic for QUIC</li>
     * <li><strong>all</strong>: all bandwidth or traffic</li>
     * </ul>
     * <p>Valid values if you set <strong>Field</strong> to <strong>req_traf</strong> or <strong>req_bps</strong>:</p>
     * <ul>
     * <li><strong>push</strong>: stream ingest bandwidth or traffic</li>
     * <li><strong>push_proxy</strong>: stream relay bandwidth or traffic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
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

    public DescribeDomainUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainUsageDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
