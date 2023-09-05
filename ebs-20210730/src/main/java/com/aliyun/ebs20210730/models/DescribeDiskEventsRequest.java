// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskEventsRequest extends TeaModel {
    /**
     * <p>The type of the disk. Valid values:</p>
     * <br>
     * <p>*   cloud_efficiency: ultra disk.</p>
     * <p>*   cloud_ssd: standard SSD.</p>
     * <p>*   cloud_essd: enhanced SSD (ESSD).</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The ID of the disk.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of entries per page. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default values:</p>
     * <br>
     * <p>*   If this parameter is not specified or is set to a value smaller than 10, the default value is 10.</p>
     * <p>*   If this parameter is set to a value greater than 100, the default value is 100.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in this request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of `NextToken`.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the disk. You can call the [DescribeRegions](~~354276~~) operation to query the list of regions that support CloudLens for EBS.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The event type. Set the value to DataNeedProtect, which indicates that the disk data needs to be protected.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDiskEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskEventsRequest self = new DescribeDiskEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskEventsRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public DescribeDiskEventsRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeDiskEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiskEventsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiskEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiskEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDiskEventsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
