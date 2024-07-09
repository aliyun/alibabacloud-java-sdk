// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopUrlVisitRequest extends TeaModel {
    /**
     * <p>The accelerated domain name that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The maximum time range that can be specified is seven days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-10-04T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The method that is used to sort the returned URLs. Default value: <strong>pv</strong>. Valid values:</p>
     * <ul>
     * <li><strong>traf</strong>: by network traffic</li>
     * <li><strong>pv</strong>: by the number of page views</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pv</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>If you want to query data of a specific day, we recommend that you set the value in the yyyy-MM-ddT16:00:00Z format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-04T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainTopUrlVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopUrlVisitRequest self = new DescribeDomainTopUrlVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopUrlVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainTopUrlVisitRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainTopUrlVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDomainTopUrlVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
