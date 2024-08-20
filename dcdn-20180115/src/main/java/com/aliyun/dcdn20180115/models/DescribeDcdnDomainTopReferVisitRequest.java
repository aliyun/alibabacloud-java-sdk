// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopReferVisitRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><strong>traf</strong>: by network traffic</li>
     * <li><strong>pv</strong>: by the number of visits</li>
     * </ul>
     * <p>Default value: <strong>pv</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>pv</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>To query the data on a specified day, use the yyyy-MM-ddT16:00:00Z format.</p>
     * <p>If you do not set this parameter, data collected within the last 24 hours is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-10-03T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainTopReferVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTopReferVisitRequest self = new DescribeDcdnDomainTopReferVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTopReferVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainTopReferVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDcdnDomainTopReferVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
