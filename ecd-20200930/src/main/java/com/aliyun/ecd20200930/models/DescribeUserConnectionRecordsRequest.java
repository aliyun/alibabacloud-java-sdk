// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectionRecordsRequest extends TeaModel {
    /**
     * <p>The minimum connection duration used as a filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ConnectDurationFrom")
    public Long connectDurationFrom;

    /**
     * <p>The maximum connection duration used as a filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ConnectDurationTo")
    public Long connectDurationTo;

    /**
     * <p>The minimum end time of the connection used as a filter condition. The time is formatted as a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1631266200000</p>
     */
    @NameInMap("ConnectEndTimeFrom")
    public Long connectEndTimeFrom;

    /**
     * <p>The maximum end time of the connection used as a filter condition. The time is formatted as a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1631268000000</p>
     */
    @NameInMap("ConnectEndTimeTo")
    public Long connectEndTimeTo;

    /**
     * <p>The minimum start time of the connection used as a filter condition. The time is formatted as a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1631239200000</p>
     */
    @NameInMap("ConnectStartTimeFrom")
    public Long connectStartTimeFrom;

    /**
     * <p>The maximum start time of the connection used as a filter condition. The time is formatted as a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1631241000000</p>
     */
    @NameInMap("ConnectStartTimeTo")
    public Long connectStartTimeTo;

    /**
     * <p>The ID of the cloud computer pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The ID of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-138dsptkrt00u****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The ID of the authorized user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The type of the user account system.</p>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("EndUserType")
    public String endUserType;

    /**
     * <p>The number of entries to return per page in a paging query.
     * Maximum value: 100.
     * Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query. An empty NextToken indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
