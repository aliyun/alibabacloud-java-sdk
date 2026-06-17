// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListAIServicesRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for PostgreSQL instance.</p>
     * <blockquote>
     * <p>To view details of all AnalyticDB for PostgreSQL instances in a region, including their instance IDs, call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p>20</p>
     * </li>
     * <li><p>50</p>
     * </li>
     * <li><p>100</p>
     * </li>
     * </ul>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The type of the AI service. Valid value: drama.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drama</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListAIServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIServicesRequest self = new ListAIServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListAIServicesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListAIServicesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAIServicesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAIServicesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
