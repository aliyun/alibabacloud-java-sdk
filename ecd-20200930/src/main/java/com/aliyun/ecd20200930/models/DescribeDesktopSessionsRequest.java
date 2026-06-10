// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopSessionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to check the session status within the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckOsSession")
    public Boolean checkOsSession;

    /**
     * <p>The ID of the cloud computer. You can specify 1 to 100 IDs.</p>
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
     * <p>The end time of the query.</p>
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
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the end user. This parameter is the same as the <code>EndUserId</code> parameter. Specify only one of them.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserIdFilter")
    public String endUserIdFilter;

    /**
     * <p>Specifies whether to return information about the terminal.</p>
     */
    @NameInMap("FillHardwareInfo")
    public Boolean fillHardwareInfo;

    /**
     * <p>The language of the returned information.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The ID of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The page number for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries to return on each page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region. Call <a href="t2167755.xdita#"></a>to obtain a list of regions that Elastic Desktop Service (EDS) supports.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The connection status of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>Connected</p>
     */
    @NameInMap("SessionStatus")
    public String sessionStatus;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-28T02:31:43Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The billing method of the cloud computer.</p>
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

    public DescribeDesktopSessionsRequest setFillHardwareInfo(Boolean fillHardwareInfo) {
        this.fillHardwareInfo = fillHardwareInfo;
        return this;
    }
    public Boolean getFillHardwareInfo() {
        return this.fillHardwareInfo;
    }

    public DescribeDesktopSessionsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
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

    public DescribeDesktopSessionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
