// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectionRecordsRequest extends TeaModel {
    // The duration when the cloud desktop is connected, which is the minimum value for condition filtering.
    @NameInMap("ConnectDurationFrom")
    public Long connectDurationFrom;

    // The duration when the cloud desktop is connected, which is the maximum value for condition filtering.
    @NameInMap("ConnectDurationTo")
    public Long connectDurationTo;

    // The time when the cloud desktop stops to be connected, which is the minimum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.
    @NameInMap("ConnectEndTimeFrom")
    public Long connectEndTimeFrom;

    // The time when the cloud desktop stops to be connected, which is the maximum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.
    @NameInMap("ConnectEndTimeTo")
    public Long connectEndTimeTo;

    // The time when the cloud desktop starts to be connected, which is the minimum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.
    @NameInMap("ConnectStartTimeFrom")
    public Long connectStartTimeFrom;

    // The time when the cloud desktop starts to be connected, which is the maximum value for condition filtering. The value is a UNIX timestamp. Unit: milliseconds.
    @NameInMap("ConnectStartTimeTo")
    public Long connectStartTimeTo;

    // The ID of the desktop group.
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    // The ID of the cloud desktop.
    @NameInMap("DesktopId")
    public String desktopId;

    // The user that you want to authorize to use the desktop group.
    @NameInMap("EndUserId")
    public String endUserId;

    // The account type of the user. Valid values:
    // 
    // *   SIMPLE: the convenience account type
    // *   AD_CONNECTOR: the enterprise Active Directory (AD) account type
    @NameInMap("EndUserType")
    public String endUserType;

    // The number of entries to return on each page. Maximum value: 100. Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that determines the start point of the next query. If this parameter is empty, all results are returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeUserConnectionRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConnectionRecordsRequest self = new DescribeUserConnectionRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserConnectionRecordsRequest setConnectDurationFrom(Long connectDurationFrom) {
        this.connectDurationFrom = connectDurationFrom;
        return this;
    }
    public Long getConnectDurationFrom() {
        return this.connectDurationFrom;
    }

    public DescribeUserConnectionRecordsRequest setConnectDurationTo(Long connectDurationTo) {
        this.connectDurationTo = connectDurationTo;
        return this;
    }
    public Long getConnectDurationTo() {
        return this.connectDurationTo;
    }

    public DescribeUserConnectionRecordsRequest setConnectEndTimeFrom(Long connectEndTimeFrom) {
        this.connectEndTimeFrom = connectEndTimeFrom;
        return this;
    }
    public Long getConnectEndTimeFrom() {
        return this.connectEndTimeFrom;
    }

    public DescribeUserConnectionRecordsRequest setConnectEndTimeTo(Long connectEndTimeTo) {
        this.connectEndTimeTo = connectEndTimeTo;
        return this;
    }
    public Long getConnectEndTimeTo() {
        return this.connectEndTimeTo;
    }

    public DescribeUserConnectionRecordsRequest setConnectStartTimeFrom(Long connectStartTimeFrom) {
        this.connectStartTimeFrom = connectStartTimeFrom;
        return this;
    }
    public Long getConnectStartTimeFrom() {
        return this.connectStartTimeFrom;
    }

    public DescribeUserConnectionRecordsRequest setConnectStartTimeTo(Long connectStartTimeTo) {
        this.connectStartTimeTo = connectStartTimeTo;
        return this;
    }
    public Long getConnectStartTimeTo() {
        return this.connectStartTimeTo;
    }

    public DescribeUserConnectionRecordsRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DescribeUserConnectionRecordsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeUserConnectionRecordsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeUserConnectionRecordsRequest setEndUserType(String endUserType) {
        this.endUserType = endUserType;
        return this;
    }
    public String getEndUserType() {
        return this.endUserType;
    }

    public DescribeUserConnectionRecordsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUserConnectionRecordsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserConnectionRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
