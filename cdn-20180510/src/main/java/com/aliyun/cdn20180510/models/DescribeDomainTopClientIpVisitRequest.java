// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopClientIpVisitRequest extends TeaModel {
    /**
     * <p>The ranking of the client IP address returned.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>A list of client IP addresses.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of entries to return. Maximum value: 100.</p>
     * <br>
     * <p>Default value: 20. The default value 20 specifies that the top 20 data entries are returned.</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>The client IP address returned. Only IPv4 addressed are supported.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The method that is used to sort the client IP addresses. Valid values:</p>
     * <br>
     * <p>*   **traf**: by network traffic. This is the default value.</p>
     * <p>*   **acc**: by the number of requests.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeDomainTopClientIpVisit**.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainTopClientIpVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopClientIpVisitRequest self = new DescribeDomainTopClientIpVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopClientIpVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainTopClientIpVisitRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainTopClientIpVisitRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DescribeDomainTopClientIpVisitRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainTopClientIpVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDomainTopClientIpVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
