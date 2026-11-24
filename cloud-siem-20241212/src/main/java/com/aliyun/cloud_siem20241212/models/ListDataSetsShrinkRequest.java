// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSetsShrinkRequest extends TeaModel {
    @NameInMap("DataSetId")
    public String dataSetId;

    @NameInMap("DataSetIds")
    public String dataSetIdsShrink;

    @NameInMap("DataSetName")
    public String dataSetName;

    @NameInMap("DataSetStatus")
    public Integer dataSetStatus;

    @NameInMap("DataSetType")
    public String dataSetType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("OrderFieldName")
    public String orderFieldName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

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
