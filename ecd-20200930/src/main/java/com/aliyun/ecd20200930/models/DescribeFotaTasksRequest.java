// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaTasksRequest extends TeaModel {
    /**
     * <p>This parameter is not available to the public.</p>
     */
    @NameInMap("FotaStatus")
    public String fotaStatus;

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
    public java.util.List<String> taskUid;

    /**
     * <p>Specifies whether to automatically push the image update task.</p>
     */
    @NameInMap("UserStatus")
    public String userStatus;

    public static DescribeFotaTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFotaTasksRequest self = new DescribeFotaTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFotaTasksRequest setFotaStatus(String fotaStatus) {
        this.fotaStatus = fotaStatus;
        return this;
    }
    public String getFotaStatus() {
        return this.fotaStatus;
    }

    public DescribeFotaTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFotaTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFotaTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFotaTasksRequest setTaskUid(java.util.List<String> taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public java.util.List<String> getTaskUid() {
        return this.taskUid;
    }

    public DescribeFotaTasksRequest setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
