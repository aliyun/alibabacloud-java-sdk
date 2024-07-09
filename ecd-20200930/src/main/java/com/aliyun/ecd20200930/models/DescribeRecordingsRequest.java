// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordingsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ecd-hlh41mk78dugw****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <strong>example:</strong>
     * <p>20230424004441</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedSignedUrl")
    public Boolean needSignedUrl;

    /**
     * <strong>example:</strong>
     * <p>aGN4YzAxQGNuLWhhbmd6aG91LjExNzU5NTMyNjgzMTQ1****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>pg-gx2x1dhsmthe9****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SignedUrlExpireMinutes")
    public Integer signedUrlExpireMinutes;

    /**
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

    public DescribeRecordingsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
