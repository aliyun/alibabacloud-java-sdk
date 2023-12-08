// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainWebsocketTrafficDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * <br>
     * <p>Separate multiple domain names with commas (,). If you do not specify a value for this parameter, all accelerated domain names are queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity for a query. Unit: seconds.</p>
     * <br>
     * <p>The time granularity varies with the maximum time range per query. Valid values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see **Operation Description**.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the ISP.</p>
     * <br>
     * <p>You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query ISPs.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region.</p>
     * <br>
     * <p>You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query regions.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainWebsocketTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainWebsocketTrafficDataRequest self = new DescribeDcdnDomainWebsocketTrafficDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainWebsocketTrafficDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainWebsocketTrafficDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainWebsocketTrafficDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDcdnDomainWebsocketTrafficDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDcdnDomainWebsocketTrafficDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDcdnDomainWebsocketTrafficDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
