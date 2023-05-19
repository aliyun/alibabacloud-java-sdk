// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainUsageDataRequest extends TeaModel {
    /**
     * <p>The type of data that you want to query. Valid values:</p>
     * <br>
     * <p>*   **bps**: bandwidth</p>
     * <p>*   **traf**: traffic</p>
     * <p>*   **acc**: requests</p>
     * <br>
     * <p>> If the value is set to **acc**, the **Area** parameter is not supported.</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The billable region. Valid values:</p>
     * <br>
     * <p>*   **CN**: Chinese mainland</p>
     * <p>*   **OverSeas**: outside the Chinese mainland</p>
     * <p>*   **AP1**: Asia Pacific 1</p>
     * <p>*   **AP2**: Asia Pacific 2</p>
     * <p>*   **AP3**: Asia Pacific 3</p>
     * <p>*   **NA**: North America</p>
     * <p>*   **SA**: South America</p>
     * <p>*   **EU**: Europe</p>
     * <p>*   **MEAA**: Middle East and Africa</p>
     * <p>*   **all**: all the preceding billable regions</p>
     * <br>
     * <p>Default value: **CN**</p>
     */
    @NameInMap("DataProtocol")
    public String dataProtocol;

    /**
     * <p>domainName</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The minimum time granularity at which the data is queried is 5 minutes.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time. The maximum time range that can be queried is 31 days.</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The protocol of the data that you want query. Valid values:</p>
     * <br>
     * <p>*   **quic**: Quick UDP Internet Connections (QUIC)</p>
     * <p>*   **https**: HTTPS</p>
     * <p>*   **http**: HTTP</p>
     * <p>*   **all**: HTTP, HTTPS, and QUIC</p>
     * <br>
     * <p>Default value: **all**</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The accelerated domain name. You can specify up to 100 domain names in each request. Separate multiple domain names with commas (,).</p>
     * <br>
     * <p>> If you do not specify this parameter, the usage data of all accelerated domain names that belong to your Alibaba Cloud account is returned.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

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
