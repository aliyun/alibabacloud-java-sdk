// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainBpsDataByLayerRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. Separate mutiple domain names with commas (,). You can specify up to 500 domain names in each request. The query results of multiple domain names are aggregated.</p>
     * <p>If you do not specify a domain name, data of all domain names is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the data entries. Unit: seconds.</p>
     * <p>The time granularity varies with the maximum time range per query. Valid values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see <strong>Usage notes</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The Internet service provider (ISP) name. You can call the <a href="https://help.aliyun.com/document_detail/207199.html">DescribeDcdnRegionAndIsp</a> operation to query the ISP name. If you do not specify this parameter, all ISPs are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The layer at which you want to query the bandwidth data. The network layer supports IPv4 and IPv6. The application layer supports http, https, and quic. You can also set the value to all.</p>
     * <p>Default value: all.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The region name. You can call the <a href="https://help.aliyun.com/document_detail/207199.html">DescribeDcdnRegionAndIsp</a> operation to query regions. If you do not specify this parameter, all regions are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>The minimum data granularity is 5 minutes.</p>
     * <p>If you do not set this parameter, data in the last 24 hours is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainBpsDataByLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainBpsDataByLayerRequest self = new DescribeDcdnDomainBpsDataByLayerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainBpsDataByLayerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainBpsDataByLayerRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainBpsDataByLayerRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDcdnDomainBpsDataByLayerRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDcdnDomainBpsDataByLayerRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeDcdnDomainBpsDataByLayerRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDcdnDomainBpsDataByLayerRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
