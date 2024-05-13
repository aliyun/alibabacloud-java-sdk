// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataImportSQLPreCheckDetailRequest extends TeaModel {
    /**
     * <p>The ticket ID. You can call the [ListOrders](https://help.aliyun.com/document_detail/144643.html) operation to query the ticket ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     */
    @NameInMap("PageNumer")
    public Long pageNumer;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The type of the SQL statement. Valid values:</p>
     * <br>
     * <p>*   **SELECT**</p>
     * <p>*   **INSERT**</p>
     * <p>*   **DELETE**</p>
     * <p>*   **CREATE_TABLE**</p>
     * <br>
     * <p>> You can log on to the Data Management (DMS) console and choose **Security and Specifications** > **Operation Audit** in the top navigation bar to view more types of SQL statements.</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The state of the ticket. If you leave this parameter empty, all the states are queried by default. Valid values:</p>
     * <br>
     * <p>*   **INIT**: The ticket is being initialized.</p>
     * <p>*   **RUNNING**: The ticket is in progress.</p>
     * <p>*   **SUCCESS**: The ticket is complete.</p>
     * <p>*   **TIMEOUT**: The ticket is skipped due to timeout.</p>
     * <p>*   **FAIL**: The ticket fails.</p>
     */
    @NameInMap("StatusCode")
    public String statusCode;

    /**
     * <p>The tenant ID. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to query the tenant ID.</p>
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
