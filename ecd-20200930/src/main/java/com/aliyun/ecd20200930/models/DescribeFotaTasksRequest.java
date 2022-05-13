// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaTasksRequest extends TeaModel {
    @NameInMap("FotaStatus")
    public String fotaStatus;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskUid")
    public java.util.List<String> taskUid;

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
