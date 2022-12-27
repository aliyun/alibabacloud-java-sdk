// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainUsageDataRequest extends TeaModel {
    // The ID of the billable region. Valid values:
    // 
    // *   **CN** (default): the Chinese mainland
    // *   **OverSeas**: outside the Chinese mainland
    // *   **AP1**: Asia Pacific 1
    // *   **AP2**: Asia Pacific 2
    // *   **AP3**: Asia Pacific 3
    // *   **NA**: North America
    // *   **SA**: South America
    // *   **EU**: Europe
    // *   **MEAA**: Middle East and Africa
    // *   **all**: all billable regions
    // 
    // >  For more information about billable regions, see [Billable regions](~~142221~~).
    @NameInMap("Area")
    public String area;

    // The protocol by which the data is queried. Valid values:
    // 
    // *   **http**: HTTP
    // *   **https**: HTTPS
    // *   **quic**: QUIC
    // *   **all** (default): HTTP, HTTPS, and QUIC
    @NameInMap("DataProtocol")
    public String dataProtocol;

    // The accelerated domain name. You can query the resource usage data for a maximum of 100 domain names in each call. Separate domain names with commas (,).
    // 
    // >  If you do not set this parameter, the usage data of all accelerated domain names within your Alibaba Cloud account is returned.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  The end time must be later than the start time. The maximum time range that can be queried is 31 days.
    @NameInMap("EndTime")
    public String endTime;

    // The type of data to be queried. Valid values:
    // 
    // *   **bps**: bandwidth
    // *   **traf**: network traffic
    // *   **acc**: requests
    // 
    // >  **acc** does not support the **Area** parameter.
    @NameInMap("Field")
    public String field;

    // The time interval between the data entries. Unit: seconds.
    // 
    // The time granularity varies with the time range to query. Supported values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see **Usage notes**.
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The beginning of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  The data is collected every 5 minutes.
    @NameInMap("StartTime")
    public String startTime;

    // The type of content based on which the data is queried. Valid values:
    // 
    // *   **static**: static content
    // *   **dynamic**: dynamic content
    // *   **all** (default): both static and dynamic content
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

    public DescribeDomainUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
