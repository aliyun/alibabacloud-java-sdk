// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSetsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
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
    public String dataSetIdsShrink;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>lmftest</p>
     */
    @NameInMap("DataSetName")
    public String dataSetName;

    /**
     * <p>The status of the dataset. Valid values:</p>
     * <ul>
     * <li><p>0: deleted.</p>
     * </li>
     * <li><p>1: enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DataSetStatus")
    public Integer dataSetStatus;

    /**
     * <p>The type of the dataset. Valid values:</p>
     * <ul>
     * <li><p>custom: custom.</p>
     * </li>
     * <li><p>preset: predefined.</p>
     * </li>
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
     * <p>The maximum number of results to return for the request. This parameter is used for queries that use NextToken. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>asc</strong> (default): ascending.</p>
     * </li>
     * <li><p><strong>desc</strong>: descending.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    /**
     * <p>The field to use for sorting. Valid values:</p>
     * <ul>
     * <li><p>GmtCreate: creation time.</p>
     * </li>
     * <li><p>GmtModified: update time.</p>
     * </li>
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
     * <p>The region where the Data Management Center for threat analysis is deployed. Select a region based on the location of your assets. Valid values:</p>
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
     * <p>The user ID that an administrator uses to switch to the perspective of a member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListDataSetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetsShrinkRequest self = new ListDataSetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSetsShrinkRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public ListDataSetsShrinkRequest setDataSetIdsShrink(String dataSetIdsShrink) {
        this.dataSetIdsShrink = dataSetIdsShrink;
        return this;
    }
    public String getDataSetIdsShrink() {
        return this.dataSetIdsShrink;
    }

    public ListDataSetsShrinkRequest setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
        return this;
    }
    public String getDataSetName() {
        return this.dataSetName;
    }

    public ListDataSetsShrinkRequest setDataSetStatus(Integer dataSetStatus) {
        this.dataSetStatus = dataSetStatus;
        return this;
    }
    public Integer getDataSetStatus() {
        return this.dataSetStatus;
    }

    public ListDataSetsShrinkRequest setDataSetType(String dataSetType) {
        this.dataSetType = dataSetType;
        return this;
    }
    public String getDataSetType() {
        return this.dataSetType;
    }

    public ListDataSetsShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataSetsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataSetsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataSetsShrinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListDataSetsShrinkRequest setOrderFieldName(String orderFieldName) {
        this.orderFieldName = orderFieldName;
        return this;
    }
    public String getOrderFieldName() {
        return this.orderFieldName;
    }

    public ListDataSetsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSetsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSetsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataSetsShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
