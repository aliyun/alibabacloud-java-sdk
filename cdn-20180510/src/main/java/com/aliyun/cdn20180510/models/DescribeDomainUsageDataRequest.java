// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataRequest extends TeaModel {
    /**
     * <p>The ID of the billable region. Valid values:</p>
     * <br>
     * <p>*   **CN** (default): inside the Chinese mainland</p>
     * <p>*   **OverSeas**: outside the Chinese mainland</p>
     * <p>*   **AP1**: Asia Pacific 1</p>
     * <p>*   **AP2**: Asia Pacific 2</p>
     * <p>*   **AP3**: Asia Pacific 3</p>
     * <p>*   **NA**: North America</p>
     * <p>*   **SA**: South America</p>
     * <p>*   **EU**: Europe</p>
     * <p>*   **MEAA**: Middle East and Africa</p>
     * <p>*   **all**: all the preceding billable regions</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The protocol of the data that you want to query. Valid values:</p>
     * <br>
     * <p>*   **http**: HTTP</p>
     * <p>*   **https**: HTTPS</p>
     * <p>*   **quic**: QUIC</p>
     * <p>*   **all** (default): HTTP, HTTPS, and QUIC</p>
     */
    @NameInMap("DataProtocol")
    public String dataProtocol;

    /**
     * <p>The accelerated domain name. You can specify up to 100 domain names in each request. Separate multiple domain names with commas (,).</p>
     * <br>
     * <p>> If you leave this parameter empty, the usage data of all accelerated domain names in your Alibaba Cloud account is returned.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time. The maximum time range that can be specified is 31 days.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the data that you want to query. Valid values:</p>
     * <br>
     * <p>*   **bps**: bandwidth</p>
     * <p>*   **traf**: traffic</p>
     * <p>*   **acc**: requests</p>
     * <br>
     * <p>> If you set this parameter to **acc**, the **Area** parameter is not supported.</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The time granularity of the data entries. Unit: seconds. Valid values: **300** (5 minutes), **3600** (1 hour), and **86400** (1 day).</p>
     * <br>
     * <p>*   If **Interval** is set to **300**, you can query usage data in the last 6 months. The maximum time range per query that can be specified is 3 days.</p>
     * <p>*   If **Interval** is set to **3600** or **86400**, you can query usage data of the previous year.</p>
     * <p>*   If you leave the **Interval** parameter empty, the maximum time range that you can query is 1 month. If you specify a time range of 1 to 3 days, the time interval between the entries that are returned is 1 hour. If you specify a time range of at least 4 days, the time interval between the entries that are returned is 1 day.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> Data is collected every 5 minutes.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of content that you want to query. Valid values:</p>
     * <br>
     * <p>*   **static**: static content</p>
     * <p>*   **dynamic**: dynamic content</p>
     * <p>*   **all** (default): both static and dynamic content</p>
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
