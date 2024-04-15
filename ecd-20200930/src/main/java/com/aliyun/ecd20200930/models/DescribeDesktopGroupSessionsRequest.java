// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupSessionsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the end user.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the session.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   0: single-session</p>
     * <p>*   1: multi-session</p>
     */
    @NameInMap("OwnType")
    public Integer ownType;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the session.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Connected</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Disconnected</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("SessionStatus")
    public String sessionStatus;

    /**
     * <p>The beginning of the time range to query.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDesktopGroupSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopGroupSessionsRequest self = new DescribeDesktopGroupSessionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopGroupSessionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDesktopGroupSessionsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeDesktopGroupSessionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopGroupSessionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopGroupSessionsRequest setOwnType(Integer ownType) {
        this.ownType = ownType;
        return this;
    }
    public Integer getOwnType() {
        return this.ownType;
    }

    public DescribeDesktopGroupSessionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopGroupSessionsRequest setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    public DescribeDesktopGroupSessionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
