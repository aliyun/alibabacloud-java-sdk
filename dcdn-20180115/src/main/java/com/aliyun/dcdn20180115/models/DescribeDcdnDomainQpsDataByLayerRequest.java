// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainQpsDataByLayerRequest extends TeaModel {
    /**
     * <p>The QPS returned at each time interval.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The number of queries per second outside the Chinese mainland.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The layer at which the data was collected.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>The minimum data granularity is 5 minutes.</p>
     * <br>
     * <p>If you do not set this parameter, data in the last 24 hours is queried.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time.</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The number of requests in the Chinese mainland.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainQpsDataByLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainQpsDataByLayerRequest self = new DescribeDcdnDomainQpsDataByLayerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainQpsDataByLayerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainQpsDataByLayerRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainQpsDataByLayerRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDcdnDomainQpsDataByLayerRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDcdnDomainQpsDataByLayerRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeDcdnDomainQpsDataByLayerRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDcdnDomainQpsDataByLayerRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
