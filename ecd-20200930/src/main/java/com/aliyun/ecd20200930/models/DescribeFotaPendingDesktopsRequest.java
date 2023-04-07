// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaPendingDesktopsRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   Maximum value: 100</p>
     * <p>*   Default value: 20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. If this parameter is left empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the image update task. You can call the DescribeFotaTasks operation to obtain the value of this parameter.</p>
     */
    @NameInMap("TaskUid")
    public String taskUid;

    public static DescribeFotaPendingDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFotaPendingDesktopsRequest self = new DescribeFotaPendingDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFotaPendingDesktopsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFotaPendingDesktopsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFotaPendingDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFotaPendingDesktopsRequest setTaskUid(String taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public String getTaskUid() {
        return this.taskUid;
    }

}
