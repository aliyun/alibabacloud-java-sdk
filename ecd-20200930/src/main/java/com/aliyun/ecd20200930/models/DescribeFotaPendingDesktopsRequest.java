// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaPendingDesktopsRequest extends TeaModel {
    /**
     * <p>The cloud computer ID.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The cloud computer name.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>*   Valid values: 1 to 100.</p>
     * <p>*   Default value: 20.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network ID. You can call the [DescribeOfficeSites](~~216071~~) operation to obtain the office network ID.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the image update task. You can call the DescribeFotaTasks operation to obtain the task ID.</p>
     */
    @NameInMap("TaskUid")
    public String taskUid;

    public static DescribeFotaPendingDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFotaPendingDesktopsRequest self = new DescribeFotaPendingDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFotaPendingDesktopsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeFotaPendingDesktopsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
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

    public DescribeFotaPendingDesktopsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
