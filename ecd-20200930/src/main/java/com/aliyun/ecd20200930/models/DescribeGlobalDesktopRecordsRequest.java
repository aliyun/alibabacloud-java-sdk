// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalDesktopRecordsRequest extends TeaModel {
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The IDs of the cloud desktops. You can specify up to 100 IDs.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The name of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoComputer</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("DesktopStatusList")
    public java.util.List<String> desktopStatusList;

    /**
     * <p>The desktop type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the IDs of the supported desktop types.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.enterprise_office.2c4g</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The end time of the query. The time must be in UTC and in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The interval between the start and end times cannot exceed 30 days.</p>
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
     * <p>The ID of the end user.</p>
     * <ul>
     * <li><p>Asc: ascending order</p>
     * </li>
     * <li><p>Desc: descending order</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TestUser</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("ExcludeDesktopStatusList")
    public java.util.List<String> excludeDesktopStatusList;

    /**
     * <p>The ID of the office site.</p>
     * <ul>
     * <li><p>China (Shanghai)</p>
     * </li>
     * <li><p>Singapore</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The field by which to sort the results. If you do not specify this parameter, the results are sorted by creation time in descending order. Valid value:</p>
     * <ul>
     * <li><code>uptime</code>: Sorts the results by cloud desktop uptime.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uptime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number to return.<br>Default value: 1.<br></p>
     * <ul>
     * <li>Format: YYYY-MM-DDThh:mm:ssZ.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <ul>
     * <li><p>Shanghai</p>
     * </li>
     * <li><p>Singapore</p>
     * </li>
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
     * <p>The query scope. This parameter is empty by default. Valid value:</p>
     * <ul>
     * <li><p><code>ADVANCED</code>: Queries statistical records, such as connection duration.</p>
     * </li>
     * <li><p>postPaid: Pay-as-you-go.</p>
     * </li>
     * <li><p>monthPackage: monthly time-based package.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ADVANCED</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The sort order. The default is <code>Asc</code>. Valid values:</p>
     * <ul>
     * <li><code>Asc</code>: ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The start time of the query. The time must be in UTC and in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-23T04:10:21Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The billing method of the cloud desktop. Valid values:</p>
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

    public DescribeGlobalDesktopRecordsRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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
