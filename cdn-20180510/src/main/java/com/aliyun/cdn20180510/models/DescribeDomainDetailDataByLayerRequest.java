// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailDataByLayerRequest extends TeaModel {
    /**
     * <p>The bandwidth. Unit: bit/s.</p>
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
     * <p>The number of queries per second.</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The amount of network traffic. Unit: bytes.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeDomainDetailDataByLayer**.</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The number of IPv6 requests per second.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
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
