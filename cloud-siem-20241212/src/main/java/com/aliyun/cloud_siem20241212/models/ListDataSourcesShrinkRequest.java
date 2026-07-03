// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSourcesShrinkRequest extends TeaModel {
    /**
     * <p>The source of the data. Valid values:</p>
     * <ul>
     * <li><p>center</p>
     * </li>
     * <li><p>custom</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>center</p>
     */
    @NameInMap("DataSourceFrom")
    public String dataSourceFrom;

    /**
     * <p>The IDs of the data sources.</p>
     */
    @NameInMap("DataSourceIds")
    public String dataSourceIdsShrink;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_waf_alert_log</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>The status of the data source. Valid values:</p>
     * <ul>
     * <li><p>unconfigured</p>
     * </li>
     * <li><p>normal</p>
     * </li>
     * <li><p>abnormal</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>unconfigured</p>
     */
    @NameInMap("DataSourceStatus")
    public String dataSourceStatus;

    /**
     * <p>The status of the Logstore. Valid values:</p>
     * <ul>
     * <li><p>normal</p>
     * </li>
     * <li><p>abnormal</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DataSourceStoreStatus")
    public String dataSourceStoreStatus;

    /**
     * <p>The IDs of the data source templates.</p>
     */
    @NameInMap("DataSourceTemplateIds")
    public String dataSourceTemplateIdsShrink;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p>preset</p>
     * </li>
     * <li><p>custom</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the Simple Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
     */
    @NameInMap("LogProjectName")
    public String logProjectName;

    /**
     * <p>The ID of the log storage region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LogRegionId")
    public String logRegionId;

    /**
     * <p>The name of the Simple Log Service Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>audit-activity</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The IDs of the users who can access the data.</p>
     */
    @NameInMap("LogUserIds")
    public String logUserIdsShrink;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Set this parameter to the value of NextToken that is returned in the response to the previous query. Leave this parameter empty for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><p>desc</p>
     * </li>
     * <li><p>asc</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The sorting field.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateTime</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region where the Data Management Center of your threat analysis feature is located. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. You can use this parameter to switch the perspective to a member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListDataSourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesShrinkRequest self = new ListDataSourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesShrinkRequest setDataSourceFrom(String dataSourceFrom) {
        this.dataSourceFrom = dataSourceFrom;
        return this;
    }
    public String getDataSourceFrom() {
        return this.dataSourceFrom;
    }

    public ListDataSourcesShrinkRequest setDataSourceIdsShrink(String dataSourceIdsShrink) {
        this.dataSourceIdsShrink = dataSourceIdsShrink;
        return this;
    }
    public String getDataSourceIdsShrink() {
        return this.dataSourceIdsShrink;
    }

    public ListDataSourcesShrinkRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public ListDataSourcesShrinkRequest setDataSourceStatus(String dataSourceStatus) {
        this.dataSourceStatus = dataSourceStatus;
        return this;
    }
    public String getDataSourceStatus() {
        return this.dataSourceStatus;
    }

    public ListDataSourcesShrinkRequest setDataSourceStoreStatus(String dataSourceStoreStatus) {
        this.dataSourceStoreStatus = dataSourceStoreStatus;
        return this;
    }
    public String getDataSourceStoreStatus() {
        return this.dataSourceStoreStatus;
    }

    public ListDataSourcesShrinkRequest setDataSourceTemplateIdsShrink(String dataSourceTemplateIdsShrink) {
        this.dataSourceTemplateIdsShrink = dataSourceTemplateIdsShrink;
        return this;
    }
    public String getDataSourceTemplateIdsShrink() {
        return this.dataSourceTemplateIdsShrink;
    }

    public ListDataSourcesShrinkRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ListDataSourcesShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataSourcesShrinkRequest setLogProjectName(String logProjectName) {
        this.logProjectName = logProjectName;
        return this;
    }
    public String getLogProjectName() {
        return this.logProjectName;
    }

    public ListDataSourcesShrinkRequest setLogRegionId(String logRegionId) {
        this.logRegionId = logRegionId;
        return this;
    }
    public String getLogRegionId() {
        return this.logRegionId;
    }

    public ListDataSourcesShrinkRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public ListDataSourcesShrinkRequest setLogUserIdsShrink(String logUserIdsShrink) {
        this.logUserIdsShrink = logUserIdsShrink;
        return this;
    }
    public String getLogUserIdsShrink() {
        return this.logUserIdsShrink;
    }

    public ListDataSourcesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataSourcesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataSourcesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDataSourcesShrinkRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListDataSourcesShrinkRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSourcesShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDataSourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataSourcesShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
