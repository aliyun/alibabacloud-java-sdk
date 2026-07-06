// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataConnectorsRequest extends TeaModel {
    /**
     * <p>The list of collector IDs.</p>
     */
    @NameInMap("DataConnectorIds")
    public java.util.List<String> dataConnectorIds;

    /**
     * <p>The collector name.</p>
     * 
     * <strong>example:</strong>
     * <p>SAS-CTDR-2026070210****</p>
     */
    @NameInMap("DataConnectorName")
    public String dataConnectorName;

    /**
     * <p>The collector status. Valid values:</p>
     * <ul>
     * <li>&quot;enabled&quot;: enabled.</li>
     * <li>&quot;disabled&quot; (default): disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("DataConnectorStatus")
    public String dataConnectorStatus;

    /**
     * <p>The collector type. Valid values:</p>
     * <ul>
     * <li>oss</li>
     * <li>s3</li>
     * <li>kafka</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>s3</p>
     */
    @NameInMap("DataConnectorType")
    public String dataConnectorType;

    /**
     * <p>The destination data source ID. This parameter is required only for synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-5sfe68t122pxnti1cjpl</p>
     */
    @NameInMap("DestDataSourceId")
    public String destDataSourceId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of results to return when you use the NextToken-based pagination method. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. You do not need to set this parameter for the first request or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort field. Currently, only sorting by updateTime is supported. If OrderField is left empty, the default order returned by the database is used.</p>
     * 
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>&quot;asc&quot;: ascending order.</li>
     * <li>&quot;desc&quot; (default): descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center region based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator switches to when viewing as another member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The name of the Simple Log Service (SLS) data import job for the collector.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-oss-dc-1a2b3c4d5e6f7a8****</p>
     */
    @NameInMap("SlsIngestionJobName")
    public String slsIngestionJobName;

    /**
     * <p>The source data type.</p>
     * 
     * <strong>example:</strong>
     * <p>s3</p>
     */
    @NameInMap("SrcDataType")
    public String srcDataType;

    public static ListDataConnectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataConnectorsRequest self = new ListDataConnectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataConnectorsRequest setDataConnectorIds(java.util.List<String> dataConnectorIds) {
        this.dataConnectorIds = dataConnectorIds;
        return this;
    }
    public java.util.List<String> getDataConnectorIds() {
        return this.dataConnectorIds;
    }

    public ListDataConnectorsRequest setDataConnectorName(String dataConnectorName) {
        this.dataConnectorName = dataConnectorName;
        return this;
    }
    public String getDataConnectorName() {
        return this.dataConnectorName;
    }

    public ListDataConnectorsRequest setDataConnectorStatus(String dataConnectorStatus) {
        this.dataConnectorStatus = dataConnectorStatus;
        return this;
    }
    public String getDataConnectorStatus() {
        return this.dataConnectorStatus;
    }

    public ListDataConnectorsRequest setDataConnectorType(String dataConnectorType) {
        this.dataConnectorType = dataConnectorType;
        return this;
    }
    public String getDataConnectorType() {
        return this.dataConnectorType;
    }

    public ListDataConnectorsRequest setDestDataSourceId(String destDataSourceId) {
        this.destDataSourceId = destDataSourceId;
        return this;
    }
    public String getDestDataSourceId() {
        return this.destDataSourceId;
    }

    public ListDataConnectorsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataConnectorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataConnectorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataConnectorsRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListDataConnectorsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDataConnectorsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataConnectorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataConnectorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataConnectorsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListDataConnectorsRequest setSlsIngestionJobName(String slsIngestionJobName) {
        this.slsIngestionJobName = slsIngestionJobName;
        return this;
    }
    public String getSlsIngestionJobName() {
        return this.slsIngestionJobName;
    }

    public ListDataConnectorsRequest setSrcDataType(String srcDataType) {
        this.srcDataType = srcDataType;
        return this;
    }
    public String getSrcDataType() {
        return this.srcDataType;
    }

}
