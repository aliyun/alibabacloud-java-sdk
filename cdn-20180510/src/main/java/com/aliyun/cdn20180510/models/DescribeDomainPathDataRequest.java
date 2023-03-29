// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPathDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * <br>
     * <p>>  You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The interval between the start time and end time must be less than 30 days. Example: 2016-10-21T04:00:00Z.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of the page to return. Pages start from page **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: integers from **1** to **1000**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The paths that you want to query. Separate paths with forward slashes (/). If you do not set this parameter, all paths are queried. If you set the value to a directory, it must end with a forward slash (/).</p>
     * <br>
     * <p>>  Fuzzy match is not supported. If you want data to be collected based on a directory, you can specify a specific directory, for example, directory/path/. In this case, bandwidth data is collected based on directory/path/.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>Example: 2016-10-20T04:00:00Z.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainPathDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPathDataRequest self = new DescribeDomainPathDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPathDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainPathDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainPathDataRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainPathDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainPathDataRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeDomainPathDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
