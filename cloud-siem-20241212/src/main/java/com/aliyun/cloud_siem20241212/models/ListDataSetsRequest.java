// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSetsRequest extends TeaModel {
    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset-qt0n8246gs9nackg****</p>
     */
    @NameInMap("DataSetId")
    public String dataSetId;

    /**
     * <p>The list of dataset IDs.</p>
     */
    @NameInMap("DataSetIds")
    public java.util.List<String> dataSetIds;

    /**
     * <p>The dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>lmftest</p>
     */
    @NameInMap("DataSetName")
    public String dataSetName;

    /**
     * <p>The dataset status. Valid values:</p>
     * <ul>
     * <li>0: deleted.</li>
     * <li>1: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DataSetStatus")
    public Integer dataSetStatus;

    /**
     * <p>The dataset type. Valid values:</p>
     * <ul>
     * <li>custom: custom dataset.</li>
     * <li>preset: predefined dataset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("DataSetType")
    public String dataSetType;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * This parameter is required in practice. If you do not specify this parameter, the API returns a 400 error (The specified Lang can not be empty.). Valid values: zh and en.</li>
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
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong> (default): ascending order.</li>
     * <li><strong>desc</strong>: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    /**
     * <p>The field used for sorting. Valid values:</p>
     * <ul>
     * <li>GmtCreate: creation time.</li>
     * <li>GmtModified: update time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreate</p>
     */
    @NameInMap("OrderFieldName")
    public String orderFieldName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
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
     * <p>The ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListDataSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetsRequest self = new ListDataSetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSetsRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public ListDataSetsRequest setDataSetIds(java.util.List<String> dataSetIds) {
        this.dataSetIds = dataSetIds;
        return this;
    }
    public java.util.List<String> getDataSetIds() {
        return this.dataSetIds;
    }

    public ListDataSetsRequest setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
        return this;
    }
    public String getDataSetName() {
        return this.dataSetName;
    }

    public ListDataSetsRequest setDataSetStatus(Integer dataSetStatus) {
        this.dataSetStatus = dataSetStatus;
        return this;
    }
    public Integer getDataSetStatus() {
        return this.dataSetStatus;
    }

    public ListDataSetsRequest setDataSetType(String dataSetType) {
        this.dataSetType = dataSetType;
        return this;
    }
    public String getDataSetType() {
        return this.dataSetType;
    }

    public ListDataSetsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataSetsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataSetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataSetsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListDataSetsRequest setOrderFieldName(String orderFieldName) {
        this.orderFieldName = orderFieldName;
        return this;
    }
    public String getOrderFieldName() {
        return this.orderFieldName;
    }

    public ListDataSetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataSetsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
