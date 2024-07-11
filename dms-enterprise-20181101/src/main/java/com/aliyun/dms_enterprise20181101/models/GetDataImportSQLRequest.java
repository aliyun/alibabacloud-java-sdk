// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataImportSQLRequest extends TeaModel {
    /**
     * <p>The ticket ID. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to query the ticket ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The SQL ID. You can call the ListDataImportSQLPreCheckDetail operation to query the SQL ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15****</p>
     */
    @NameInMap("SqlId")
    public Long sqlId;

    /**
     * <p>The tenant ID. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataImportSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataImportSQLRequest self = new GetDataImportSQLRequest();
        return TeaModel.build(map, self);
    }

    public GetDataImportSQLRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataImportSQLRequest setSqlId(Long sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public Long getSqlId() {
        return this.sqlId;
    }

    public GetDataImportSQLRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
