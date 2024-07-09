// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHttpCodeDataByLayerRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify up to 500 domain names in each request. Separate multiple domain names with commas (,).</p>
     * <p>If you do not specify this parameter, data of all accelerated domain names under your account is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-07-06T22:00:00Z</p>
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
     * <p>The name of the Internet service provider (ISP). You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query ISP names.</p>
     * <p>If you do not specify an ISP, data of all ISPs is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The protocol by which you want to query HTTP status codes. The network layer supports <strong>IPv4</strong> and <strong>IPv6</strong>. The application layer supports <strong>http</strong>, <strong>https</strong>, and <strong>quic</strong>. You can also set the value to <strong>all</strong>.</p>
     * <p>Default value: <strong>all</strong></p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The name of the region. You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query regions.</p>
     * <p>If you do not specify a region, data in all regions is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-05T22:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainHttpCodeDataByLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHttpCodeDataByLayerRequest self = new DescribeDomainHttpCodeDataByLayerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHttpCodeDataByLayerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainHttpCodeDataByLayerRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainHttpCodeDataByLayerRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDomainHttpCodeDataByLayerRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDomainHttpCodeDataByLayerRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeDomainHttpCodeDataByLayerRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainHttpCodeDataByLayerRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
