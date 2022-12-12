// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataListRequest extends TeaModel {
    @NameInMap("DiskIds")
    public String diskIds;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Type")
    public String type;

    public static DescribeDiskMonitorDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataListRequest self = new DescribeDiskMonitorDataListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataListRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public DescribeDiskMonitorDataListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiskMonitorDataListRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiskMonitorDataListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskMonitorDataListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiskMonitorDataListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDiskMonitorDataListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
