// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopUrlVisitRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The sorting method. Valid values:</p>
     * <br>
     * <p>*   **traf**: by network traffic</p>
     * <p>*   **pv**: by the number of visits</p>
     * <br>
     * <p>Default value: **pv**</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>To query the data on a specified day, use the format: yyyy-MM-ddT16:00:00Z.</p>
     * <br>
     * <p>> If you do not specify this parameter, the data in the last 24 hours is queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainTopUrlVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTopUrlVisitRequest self = new DescribeDcdnDomainTopUrlVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTopUrlVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainTopUrlVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDcdnDomainTopUrlVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
