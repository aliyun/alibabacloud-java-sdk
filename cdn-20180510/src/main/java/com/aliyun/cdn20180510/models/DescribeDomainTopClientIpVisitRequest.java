// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopClientIpVisitRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).</p>
     * <p>By default, this operation queries client IP addresses for all accelerated domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-01T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of entries to return. Maximum value: 100.</p>
     * <p>Default value: 20. The default value specifies that the top 20 IP addresses are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>The name of the region. Separate multiple region names with commas (,).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a> operation to query regions.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The criterion by which you want to sort client IP addresses. Valid values:</p>
     * <ul>
     * <li><strong>traf</strong>: by network traffic. This is the default value.</li>
     * <li><strong>acc</strong>: by the number of requests.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>traf</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-30T16:00:00Z</p>
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
