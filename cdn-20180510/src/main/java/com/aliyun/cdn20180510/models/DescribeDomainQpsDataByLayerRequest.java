// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsDataByLayerRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,).</p>
     * <p>By default, this operation queries the QPS of all accelerated domain names that belong to your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format in the ISO 8601 standard. The time is displayed in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-11-30T05:40:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time interval between the data entries to return. Unit: seconds.</p>
     * <p>The time granularity varies with the maximum time range per query. Valid values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see <strong>Description</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Internet service provider (ISP) for your Alibaba Cloud CDN service. You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query ISPs. If you do not set this parameter, all ISPs are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>unicom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The layers at which you want to query the number of queries per second. Valid values:</p>
     * <ul>
     * <li><strong>Network layer</strong>: <strong>IPv4</strong>and <strong>IPv6</strong>.</li>
     * <li><strong>Application layer</strong>: <strong>http</strong>, <strong>https</strong>, and <strong>quic</strong>.</li>
     * <li><strong>all</strong>: The default value. Both the network and application layers are included.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The name of the region. You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query the most recent region list. If you do not set this parameter, all regions are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format in the ISO 8601 standard. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-11-30T05:33:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainQpsDataByLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsDataByLayerRequest self = new DescribeDomainQpsDataByLayerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsDataByLayerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainQpsDataByLayerRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainQpsDataByLayerRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDomainQpsDataByLayerRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDomainQpsDataByLayerRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeDomainQpsDataByLayerRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainQpsDataByLayerRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
