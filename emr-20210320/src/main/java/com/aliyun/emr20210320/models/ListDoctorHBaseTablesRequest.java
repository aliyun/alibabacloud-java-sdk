// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHBaseTablesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The query date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The maximum number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Marks the current position to start reading. If this field is empty, the data is read from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The field that you use to sort the query results.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>tableSize</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tableSize</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the query results. Valid value:</p>
     * <ul>
     * <li>ASC: in ascending order</li>
     * <li>DESC: in descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The table names, which are used to filter the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("TableNames")
    public java.util.List<String> tableNames;

    public static ListDoctorHBaseTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHBaseTablesRequest self = new ListDoctorHBaseTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListDoctorHBaseTablesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDoctorHBaseTablesRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public ListDoctorHBaseTablesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorHBaseTablesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorHBaseTablesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDoctorHBaseTablesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDoctorHBaseTablesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDoctorHBaseTablesRequest setTableNames(java.util.List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

}
