// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopUrlVisitRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for which you want to query data. If you do not set this parameter, frequently requested URLs of all accelerated domain names of your Alibaba Cloud account are queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time. The difference between the end time and the start time cannot exceed seven days.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The method that is used to sort the returned URLs.**** Valid values:</p>
     * <br>
     * <p>*   **traf**: network traffic</p>
     * <p>*   **pv**: by the number of page views. This is the default value.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * <br>
     * <p>If you want to query data within a specific day, we recommend that you set the value in the yyyy-MM-ddT16:00:00Z format.</p>
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
