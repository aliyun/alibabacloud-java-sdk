// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataRequest extends TeaModel {
    /**
     * <p>The ID of the billable region. Valid values:</p>
     * <br>
     * <p>*   **CN** (default): the Chinese mainland</p>
     * <p>*   **OverSeas**: outside the Chinese mainland</p>
     * <p>*   **AP1**: Asia Pacific 1</p>
     * <p>*   **AP2**: Asia Pacific 2</p>
     * <p>*   **AP3**: Asia Pacific 3</p>
     * <p>*   **NA**: North America</p>
     * <p>*   **SA**: South America</p>
     * <p>*   **EU**: Europe</p>
     * <p>*   **MEAA**: Middle East and Africa</p>
     * <p>*   **all**: all billable regions</p>
     * <br>
     * <p>>  For more information about billable regions, see [Billable regions](~~142221~~).</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The protocol by which the data is queried. Valid values:</p>
     * <br>
     * <p>*   **http**: HTTP</p>
     * <p>*   **https**: HTTPS</p>
     * <p>*   **quic**: QUIC</p>
     * <p>*   **all** (default): HTTP, HTTPS, and QUIC</p>
     */
    @NameInMap("DataProtocol")
    public String dataProtocol;

    /**
     * <p>The accelerated domain name. You can query the resource usage data for a maximum of 100 domain names in each call. Separate domain names with commas (,).</p>
     * <br>
     * <p>>  If you do not set this parameter, the usage data of all accelerated domain names within your Alibaba Cloud account is returned.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time. The maximum time range that can be queried is 31 days.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of data to be queried. Valid values:</p>
     * <br>
     * <p>*   **bps**: bandwidth</p>
     * <p>*   **traf**: network traffic</p>
     * <p>*   **acc**: requests</p>
     * <br>
     * <p>>  **acc** does not support the **Area** parameter.</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The time interval between the data entries. Unit: seconds.</p>
     * <br>
     * <p>The time granularity varies with the time range to query. Supported values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see **Usage notes**.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>>  The data is collected every 5 minutes.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of content based on which the data is queried. Valid values:</p>
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
