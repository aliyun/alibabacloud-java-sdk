// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataImportSQLPreCheckDetailRequest extends TeaModel {
    /**
     * <p>The ticket ID. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to query the ticket ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumer")
    public Long pageNumer;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The type of the SQL statement. Valid values:</p>
     * <ul>
     * <li><strong>SELECT</strong></li>
     * <li><strong>INSERT</strong></li>
     * <li><strong>DELETE</strong></li>
     * <li><strong>CREATE_TABLE</strong></li>
     * </ul>
     * <blockquote>
     * <p>You can log on to the Data Management (DMS) console and choose <strong>Security and Specifications</strong> &gt; <strong>Operation Audit</strong> in the top navigation bar to view more types of SQL statements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>INSERT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The state of the ticket. If you leave this parameter empty, all the states are queried by default. Valid values:</p>
     * <ul>
     * <li><strong>INIT</strong>: The ticket is being initialized.</li>
     * <li><strong>RUNNING</strong>: The ticket is in progress.</li>
     * <li><strong>SUCCESS</strong>: The ticket is complete.</li>
     * <li><strong>TIMEOUT</strong>: The ticket is skipped due to timeout.</li>
     * <li><strong>FAIL</strong>: The ticket fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("StatusCode")
    public String statusCode;

    /**
     * <p>The tenant ID. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListDataImportSQLPreCheckDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataImportSQLPreCheckDetailRequest self = new ListDataImportSQLPreCheckDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListDataImportSQLPreCheckDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListDataImportSQLPreCheckDetailRequest setPageNumer(Long pageNumer) {
        this.pageNumer = pageNumer;
        return this;
    }
    public Long getPageNumer() {
        return this.pageNumer;
    }

    public ListDataImportSQLPreCheckDetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataImportSQLPreCheckDetailRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public ListDataImportSQLPreCheckDetailRequest setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public ListDataImportSQLPreCheckDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
