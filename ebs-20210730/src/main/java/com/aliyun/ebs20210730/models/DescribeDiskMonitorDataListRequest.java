// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataListRequest extends TeaModel {
    /**
     * <p>The IDs of the disks. The value is a JSON array that contains multiple disk IDs. Separate the IDs with commas (,).</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The end of the time range during which you want to query the near real-time monitoring data of the disks. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of entries per page. If you specify this parameter, both `MaxResults` and `NextToken` are used for a paged query.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in this request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~354276~~) operation to query the list of regions that support CloudLens for EBS.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range during which you want to query the near real-time monitoring data of the disks. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of the monitoring data. Set the value to pro.</p>
     * <br>
     * <p>pro: burst performance data, such as burst I/O operations.</p>
     */
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
