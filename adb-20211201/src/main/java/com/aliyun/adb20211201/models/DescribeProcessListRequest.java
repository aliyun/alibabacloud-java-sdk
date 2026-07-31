// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessListRequest extends TeaModel {
    /**
     * <p>The cluster ID of the AnalyticDB for MySQL Data Lakehouse Edition.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to view details of all AnalyticDB for MySQL Data Lakehouse Edition clusters in the destination region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-xxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Filter keyword. Currently, only <strong>SELECT</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Sort by the specified field in JSON format, <code>[{&quot;Field&quot;:&quot;Time&quot;,&quot;Type&quot;:&quot;Desc&quot; },{ &quot;Field&quot;:&quot;User&quot;, &quot;Type&quot;:&quot;Asc&quot; }]</code>. Values:</p>
     * <ul>
     * <li><p><strong>Field</strong>: The name of the field to sort by. Supports Time, User, Host, and DB fields.</p>
     * </li>
     * <li><p><strong>Type</strong>: Sort type. <strong>Desc</strong> for descending order, <strong>Asc</strong> for ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;Field&quot;:&quot;Time&quot;,&quot;Type&quot;:&quot;Desc&quot; },  { &quot;Field&quot;:&quot;User&quot;, &quot;Type&quot;:&quot;Asc&quot; }]</p>
     */
    @NameInMap("Order")
    public String order;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Page number. Must be a positive integer. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of records per page. Values:</p>
     * <ul>
     * <li><p><strong>30</strong> (Default value)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Filter by running time. Displays queries that have run longer than the specified time. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RunningTime")
    public Integer runningTime;

    /**
     * <p>Specifies whether to display the full SQL statement. Values:</p>
     * <ul>
     * <li><p><strong>True</strong>: Displays the full SQL statement.</p>
     * </li>
     * <li><p><strong>False</strong>: Displays only the first 100 characters of the SQL statement.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Default value: False.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("ShowFull")
    public Boolean showFull;

    /**
     * <p>The database account.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeProcessListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessListRequest self = new DescribeProcessListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeProcessListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeProcessListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeProcessListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeProcessListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeProcessListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProcessListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProcessListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeProcessListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeProcessListRequest setRunningTime(Integer runningTime) {
        this.runningTime = runningTime;
        return this;
    }
    public Integer getRunningTime() {
        return this.runningTime;
    }

    public DescribeProcessListRequest setShowFull(Boolean showFull) {
        this.showFull = showFull;
        return this;
    }
    public Boolean getShowFull() {
        return this.showFull;
    }

    public DescribeProcessListRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
