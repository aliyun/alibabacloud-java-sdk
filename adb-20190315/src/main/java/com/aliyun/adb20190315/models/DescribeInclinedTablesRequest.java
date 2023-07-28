// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeInclinedTablesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The order in which queries are sorted in the JSON format based on the specified fields. Specify the fields used to sort the queries and the order type.</p>
     * <br>
     * <p>Example:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>[</p>
     * <br>
     * <p>    {</p>
     * <br>
     * <p>        "Field":"Name",</p>
     * <br>
     * <p>        "Type":"Asc"</p>
     * <br>
     * <p>    }</p>
     * <br>
     * <p>]</p>
     * <p>```</p>
     * <br>
     * <p>In the preceding code, Field indicates the field used to sort queries. Set the value of Field to Name.</p>
     * <br>
     * <p>Type indicates the order type. Valid values of Type: Desc and Asc. A value of Desc indicates a descending order. A value of Asc indicates an ascending order.</p>
     * <br>
     * <p>Both fields are not case-sensitive.</p>
     */
    @NameInMap("Order")
    public String order;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <br>
     * <p>*   30</p>
     * <p>*   50</p>
     * <p>*   100</p>
     * <br>
     * <p>Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the table. Valid values:</p>
     * <br>
     * <p>*   FactTable</p>
     * <p>*   DimensionTable</p>
     */
    @NameInMap("TableType")
    public String tableType;

    public static DescribeInclinedTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInclinedTablesRequest self = new DescribeInclinedTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInclinedTablesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeInclinedTablesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeInclinedTablesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInclinedTablesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInclinedTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInclinedTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInclinedTablesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInclinedTablesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInclinedTablesRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
