// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataRequest extends TeaModel {
    /**
     * <p>The region code. Valid values:</p>
     * <ul>
     * <li><strong>CN</strong>: the Chinese mainland.</li>
     * <li><strong>OverSeas</strong>: outside the Chinese mainland.</li>
     * <li><strong>AP1</strong>: Asia-Pacific 1.</li>
     * <li><strong>AP2</strong>: Asia-Pacific 2.</li>
     * <li><strong>AP3</strong>: Asia-Pacific 3.</li>
     * <li><strong>NA</strong>: North America.</li>
     * <li><strong>SA</strong>: South America.</li>
     * <li><strong>EU</strong>: Europe.</li>
     * <li><strong>MEAA</strong>: Middle East and Africa.</li>
     * <li><strong>all</strong>: all regions.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the default value is the Chinese mainland. Regions outside the Chinese mainland: - Asia-Pacific 1: Hong Kong (China), Macao (China), Taiwan (China), Japan, and Southeast Asian countries except Vietnam and Indonesia. - Asia-Pacific 2: Indonesia, South Korea, and Vietnam. - Asia-Pacific 3: Australia and New Zealand. North America: the United States and Canada. - South America: Brazil. - Europe: Ukraine, the United Kingdom, France, the Netherlands, Spain, Italy, Sweden, and Germany. - Middle East and Africa: South Africa, Oman, the United Arab Emirates, and Kuwait.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The protocol of the data to retrieve. Valid values:</p>
     * <ul>
     * <li><p><strong>http</strong>: HTTP.</p>
     * </li>
     * <li><p><strong>https</strong>: HTTPS.</p>
     * </li>
     * <li><p><strong>quic</strong>: QUIC.</p>
     * </li>
     * <li><p><strong>all</strong> (default): all of the preceding protocols.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("DataProtocol")
    public String dataProtocol;

    /**
     * <p>The streaming domain.</p>
     * <ul>
     * <li><p>You can specify a single domain name or multiple domain names. Separate multiple domain names with commas (,).</p>
     * </li>
     * <li><p>If this parameter is empty, the merged data of all streaming domains is returned by default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>The end time must be later than the start time, and the difference between the end time and the start time cannot exceed <strong>31</strong> days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data type of the usage data to query. Valid values:</p>
     * <ul>
     * <li><p><strong>bps</strong>: playback bandwidth.</p>
     * </li>
     * <li><p><strong>traf</strong>: traffic.</p>
     * </li>
     * <li><p><strong>req_traf</strong>: when Type is set to push, this indicates stream ingest traffic. When Type is set to push_proxy, this indicates relay traffic.</p>
     * </li>
     * <li><p><strong>req_bps</strong>: when Type is set to push, this indicates stream ingest bandwidth. When Type is set to push_proxy, this indicates relay bandwidth.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>traf</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>Forces retrieval of data at the specified time granularity, in seconds. Valid values: <strong>300</strong> (5 minutes), <strong>3600</strong> (1 hour), and <strong>86400</strong> (1 day).</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of usage data to retrieve.</p>
     * <p>When <strong>Field</strong> is set to <strong>bps</strong> or <strong>traf</strong>, valid values:</p>
     * <ul>
     * <li><strong>rts</strong>: RTS bandwidth or traffic.</li>
     * <li><strong>quic</strong>: QUIC bandwidth or traffic.</li>
     * </ul>
     * <p>When <strong>Field</strong> is set to <strong>req_traf</strong> or <strong>req_bps</strong>, valid values:</p>
     * <ul>
     * <li><strong>push</strong>: stream ingest bandwidth or traffic.</li>
     * <li><strong>push_proxy</strong>: relay bandwidth or traffic.</li>
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
