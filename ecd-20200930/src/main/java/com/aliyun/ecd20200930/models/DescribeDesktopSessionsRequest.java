// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopSessionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to turn on the switch to check session status of cloud computers.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckOsSession")
    public Boolean checkOsSession;

    /**
     * <p>The IDs of the cloud computers. You can specify the IDs of 1 to 100 cloud computers.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The name of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoComputer</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-13T02:51:43Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the end user.</p>
     * 
     * <strong>example:</strong>
     * <p>testUser</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserIdFilter")
    public String endUserIdFilter;

    /**
     * <p>The ID of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The state of the session.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Connected</li>
     * <li>Disconnected</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Connected</p>
     */
    @NameInMap("SessionStatus")
    public String sessionStatus;

    /**
     * <p>The start of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-28T02:31:43Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The billing method of cloud computers.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>duration: hourly plan (available for users in the whitelist)</li>
     * <li>postPaid: pay-as-you-go</li>
     * <li>monthPackage: monthly subscription (the 120-hour/250-hour computing plan)</li>
     * <li>prePaid: monthly subscription (the Unlimited computing plan)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>monthPackage</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    public static DescribeDesktopSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopSessionsRequest self = new DescribeDesktopSessionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopSessionsRequest setCheckOsSession(Boolean checkOsSession) {
        this.checkOsSession = checkOsSession;
        return this;
    }
    public Boolean getCheckOsSession() {
        return this.checkOsSession;
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

    public DescribeDesktopSessionsRequest setEndUserIdFilter(String endUserIdFilter) {
        this.endUserIdFilter = endUserIdFilter;
        return this;
    }
    public String getEndUserIdFilter() {
        return this.endUserIdFilter;
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

    public DescribeDesktopSessionsRequest setSubPayType(String subPayType) {
        this.subPayType = subPayType;
        return this;
    }
    public String getSubPayType() {
        return this.subPayType;
    }

}
