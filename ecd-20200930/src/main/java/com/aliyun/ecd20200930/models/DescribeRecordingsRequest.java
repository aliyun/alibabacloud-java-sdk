// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRecordingsRequest extends TeaModel {
    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NeedSignedUrl")
    public Boolean needSignedUrl;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SignedUrlExpireMinutes")
    public Integer signedUrlExpireMinutes;

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
