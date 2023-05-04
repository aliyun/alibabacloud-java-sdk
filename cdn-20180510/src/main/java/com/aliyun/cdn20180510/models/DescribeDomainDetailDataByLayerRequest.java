// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailDataByLayerRequest extends TeaModel {
    /**
     * <p>The name of the Internet service provider (ISP) for your Alibaba Cloud CDN service. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISP names.</p>
     * <br>
     * <p>If you do not specify an ISP, data of all ISPs is queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The protocol by which you want to query data. Valid values: **http**, **https**, **quic**, and **all**.</p>
     * <br>
     * <p>The default value is **all**.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time.</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The amount of network traffic. Unit: bytes.</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The detailed data of the accelerated domain names.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The name of the region. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.</p>
     * <br>
     * <p>If you do not specify a region, data in all regions is queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainDetailDataByLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDetailDataByLayerRequest self = new DescribeDomainDetailDataByLayerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDetailDataByLayerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainDetailDataByLayerRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainDetailDataByLayerRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeDomainDetailDataByLayerRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDomainDetailDataByLayerRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeDomainDetailDataByLayerRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainDetailDataByLayerRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
