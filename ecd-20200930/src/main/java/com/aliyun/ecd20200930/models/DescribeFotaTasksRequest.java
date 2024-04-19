// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaTasksRequest extends TeaModel {
    /**
     * <p>>  This parameter is not publicly available.</p>
     */
    @NameInMap("FotaStatus")
    public String fotaStatus;

    /**
     * <p>The language of the image version to update.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   en: English.</p>
     * <p>*   zh: Simplified Chinese.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>*   Valid values: 1 to 100</p>
     * <p>*   Default value: 20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the NextToken parameter is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the regions supported by WUYING Workspace.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the image update tasks.</p>
     */
    @NameInMap("TaskUid")
    public java.util.List<String> taskUid;

    /**
     * <p>Specifies whether to automatically push the image update task.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Running: automatically pushes the image update task.</p>
     * <p>*   Pending: does not automatically push the image update task.</p>
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

    public DescribeFotaTasksRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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
