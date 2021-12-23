// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Format")
    public String format;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeResourceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageRequest self = new DescribeResourceUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeResourceUsageRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public DescribeResourceUsageRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResourceUsageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeResourceUsageRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeResourceUsageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
