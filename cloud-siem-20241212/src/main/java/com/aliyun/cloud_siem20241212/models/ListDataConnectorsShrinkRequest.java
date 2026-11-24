// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataConnectorsShrinkRequest extends TeaModel {
    /**
     * <p>The list of data connector IDs.</p>
     */
    @NameInMap("DataConnectorIds")
    public String dataConnectorIdsShrink;

    /**
     * <p>The name of the data connector.</p>
     * 
     * <strong>example:</strong>
     * <p>SAS-CTDR-2026070210****</p>
     */
    @NameInMap("DataConnectorName")
    public String dataConnectorName;

    /**
     * <p>The enabled status of the data connector. Valid values:</p>
     * <ul>
     * <li>&quot;enabled&quot;: Enabled.</li>
     * <li>&quot;disabled&quot; (default): Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("DataConnectorStatus")
    public String dataConnectorStatus;

    /**
     * <p>The type of the data connector. Valid values:</p>
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
     * <p>The ID of the destination data source. This parameter is required only for synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-5sfe68t122pxnti1cjpl</p>
     */
    @NameInMap("DestDataSourceId")
    public String destDataSourceId;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Note: This parameter is required in actual API calls. If this parameter is not provided, the service returns a 400 error with the message &quot;The specified Lang can not be empty.&quot; Explicitly pass the language code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return for a single query when you use the NextToken method. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to query the next page. You do not need to specify this parameter for the first query or when no next page exists. If a next page exists, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The field used for sorting.
     * Currently, only sorting by updateTime is supported.
     * If OrderField is empty, the default order returned by the database is used.</p>
     * 
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>&quot;asc&quot;</li>
     * <li>&quot;desc&quot; (default)</li>
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
     * <p>The number of entries per page. Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the data management center for threat analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets are located outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose perspective the administrator assumes.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The name of the Simple Log Service (SLS) data import job for the data connector.</p>
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

    public static ListDataConnectorsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataConnectorsShrinkRequest self = new ListDataConnectorsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataConnectorsShrinkRequest setDataConnectorIdsShrink(String dataConnectorIdsShrink) {
        this.dataConnectorIdsShrink = dataConnectorIdsShrink;
        return this;
    }
    public String getDataConnectorIdsShrink() {
        return this.dataConnectorIdsShrink;
    }

    public ListDataConnectorsShrinkRequest setDataConnectorName(String dataConnectorName) {
        this.dataConnectorName = dataConnectorName;
        return this;
    }
    public String getDataConnectorName() {
        return this.dataConnectorName;
    }

    public ListDataConnectorsShrinkRequest setDataConnectorStatus(String dataConnectorStatus) {
        this.dataConnectorStatus = dataConnectorStatus;
        return this;
    }
    public String getDataConnectorStatus() {
        return this.dataConnectorStatus;
    }

    public ListDataConnectorsShrinkRequest setDataConnectorType(String dataConnectorType) {
        this.dataConnectorType = dataConnectorType;
        return this;
    }
    public String getDataConnectorType() {
        return this.dataConnectorType;
    }

    public ListDataConnectorsShrinkRequest setDestDataSourceId(String destDataSourceId) {
        this.destDataSourceId = destDataSourceId;
        return this;
    }
    public String getDestDataSourceId() {
        return this.destDataSourceId;
    }

    public ListDataConnectorsShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataConnectorsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataConnectorsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataConnectorsShrinkRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListDataConnectorsShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDataConnectorsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataConnectorsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataConnectorsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataConnectorsShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListDataConnectorsShrinkRequest setSlsIngestionJobName(String slsIngestionJobName) {
        this.slsIngestionJobName = slsIngestionJobName;
        return this;
    }
    public String getSlsIngestionJobName() {
        return this.slsIngestionJobName;
    }

    public ListDataConnectorsShrinkRequest setSrcDataType(String srcDataType) {
        this.srcDataType = srcDataType;
        return this;
    }
    public String getSrcDataType() {
        return this.srcDataType;
    }

}
