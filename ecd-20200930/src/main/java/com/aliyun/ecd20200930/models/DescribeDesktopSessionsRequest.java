// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopSessionsRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computers.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The name of the cloud computer.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

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
     * <p>The workspace ID.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session status. Valid values:</p>
     * <br>
     * <p>*   Connected</p>
     * <p>*   Disconnected</p>
     */
    @NameInMap("SessionStatus")
    public String sessionStatus;

    /**
     * <p>The start of the time range to query.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDesktopSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopSessionsRequest self = new DescribeDesktopSessionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopSessionsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DescribeDesktopSessionsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribeDesktopSessionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDesktopSessionsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeDesktopSessionsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopSessionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDesktopSessionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDesktopSessionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopSessionsRequest setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    public DescribeDesktopSessionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
