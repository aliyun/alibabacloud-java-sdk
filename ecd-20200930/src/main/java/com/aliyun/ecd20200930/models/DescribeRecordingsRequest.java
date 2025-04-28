// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordingsRequest extends TeaModel {
    /**
     * <p>The cloud computer ID. If this parameter is not specified, the screen recording files on all cloud computers in the designated region will be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-hlh41mk78dugw****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The end time of the query. Specify the time in the <code>YYYYMMDDhhmmss</code> format. The time must be in UTC+8.</p>
     * 
     * <strong>example:</strong>
     * <p>20230424004441</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether to return a URL.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedSignedUrl")
    public Boolean needSignedUrl;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>aGN4YzAxQGNuLWhhbmd6aG91LjExNzU5NTMyNjgzMTQ1****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-gx2x1dhsmthe9****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The validity period of the returned URL. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SignedUrlExpireMinutes")
    public Integer signedUrlExpireMinutes;

    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-27T02:30:10Z</p>
     */
    @NameInMap("StandardEndTime")
    public String standardEndTime;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-27T02:20:10Z</p>
     */
    @NameInMap("StandardStartTime")
    public String standardStartTime;

    /**
     * <p>The start time of the query. Specify the time in the <code>YYYYMMDDhhmmss</code> format. The time must be in UTC+8.</p>
     * 
     * <strong>example:</strong>
     * <p>20230424000000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRecordingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordingsRequest self = new DescribeRecordingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordingsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeRecordingsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRecordingsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRecordingsRequest setNeedSignedUrl(Boolean needSignedUrl) {
        this.needSignedUrl = needSignedUrl;
        return this;
    }
    public Boolean getNeedSignedUrl() {
        return this.needSignedUrl;
    }

    public DescribeRecordingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRecordingsRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeRecordingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRecordingsRequest setSignedUrlExpireMinutes(Integer signedUrlExpireMinutes) {
        this.signedUrlExpireMinutes = signedUrlExpireMinutes;
        return this;
    }
    public Integer getSignedUrlExpireMinutes() {
        return this.signedUrlExpireMinutes;
    }

    public DescribeRecordingsRequest setStandardEndTime(String standardEndTime) {
        this.standardEndTime = standardEndTime;
        return this;
    }
    public String getStandardEndTime() {
        return this.standardEndTime;
    }

    public DescribeRecordingsRequest setStandardStartTime(String standardStartTime) {
        this.standardStartTime = standardStartTime;
        return this;
    }
    public String getStandardStartTime() {
        return this.standardStartTime;
    }

    public DescribeRecordingsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
