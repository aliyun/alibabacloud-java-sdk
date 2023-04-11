// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataImportSQLPreCheckDetailRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("PageNumer")
    public Long pageNumer;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SqlType")
    public String sqlType;

    @NameInMap("StatusCode")
    public String statusCode;

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
