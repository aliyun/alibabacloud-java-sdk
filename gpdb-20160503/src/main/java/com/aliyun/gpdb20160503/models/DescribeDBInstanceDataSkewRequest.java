// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDataSkewRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>order by condition</p>
     * 
     * <strong>example:</strong>
     * <p>{Field: TableSkew, Type: Desc}</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeDBInstanceDataSkewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDataSkewRequest self = new DescribeDBInstanceDataSkewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDataSkewRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceDataSkewRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeDBInstanceDataSkewRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeDBInstanceDataSkewRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceDataSkewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
