// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalDesktopRecordsRequest extends TeaModel {
    /**
     * <p>The cloud computer IDs. You can specify 1 to 100 office network IDs.</p>
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

    @NameInMap("DesktopStatusList")
    public java.util.List<String> desktopStatusList;

    /**
     * <p>The cloud computer type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the IDs of the specifications supported by the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.enterprise_office.2c4g</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The end time. The interval between the start time and end time can be up to 30 days. Supported formats:</p>
     * <ul>
     * <li>Format: YYYY-MM-DDThh:mm:ssZ.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-08-31T06:56:45Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The end user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>TestUser</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("ExcludeDesktopStatusList")
    public java.util.List<String> excludeDesktopStatusList;

    /**
     * <p>The office network IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The sorting field. If this parameter is not provided, results are sorted by creation time in descending order. Valid values:</p>
     * <ul>
     * <li>uptime: indicates that the cloud computers are sorted by startup duration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uptime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number of the current page.\
     * Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <ul>
     * <li>China (Shanghai)</li>
     * <li>Singapore</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-3mtuc28rx95lx****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The query range. This parameter is empty by default. Optional values are:</p>
     * <ul>
     * <li>ADVANCED: indicates that statistics such as the connection duration are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ADVANCED</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The sorting method. Default value: ascending. Valid value:</p>
     * <ul>
     * <li>Asc: ascending order</li>
     * <li>Desc: descending.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The start time. Supported formats:</p>
     * <ul>
     * <li>Format: YYYY-MM-DDThh:mm:ssZ.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-03-23T04:10:21Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The way to purchase cloud computers. Valid values:</p>
     * <ul>
     * <li>prePaid: The monthly purchase is unlimited.</li>
     * <li>postPaid: pay-as-you-go</li>
     * <li>monthPackage: monthly duration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>monthPackage</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    public static DescribeGlobalDesktopRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDesktopRecordsRequest self = new DescribeGlobalDesktopRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDesktopRecordsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DescribeGlobalDesktopRecordsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribeGlobalDesktopRecordsRequest setDesktopStatusList(java.util.List<String> desktopStatusList) {
        this.desktopStatusList = desktopStatusList;
        return this;
    }
    public java.util.List<String> getDesktopStatusList() {
        return this.desktopStatusList;
    }

    public DescribeGlobalDesktopRecordsRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
    }

    public DescribeGlobalDesktopRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeGlobalDesktopRecordsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeGlobalDesktopRecordsRequest setExcludeDesktopStatusList(java.util.List<String> excludeDesktopStatusList) {
        this.excludeDesktopStatusList = excludeDesktopStatusList;
        return this;
    }
    public java.util.List<String> getExcludeDesktopStatusList() {
        return this.excludeDesktopStatusList;
    }

    public DescribeGlobalDesktopRecordsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeGlobalDesktopRecordsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeGlobalDesktopRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGlobalDesktopRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGlobalDesktopRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGlobalDesktopRecordsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeGlobalDesktopRecordsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DescribeGlobalDesktopRecordsRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public DescribeGlobalDesktopRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeGlobalDesktopRecordsRequest setSubPayType(String subPayType) {
        this.subPayType = subPayType;
        return this;
    }
    public String getSubPayType() {
        return this.subPayType;
    }

}
