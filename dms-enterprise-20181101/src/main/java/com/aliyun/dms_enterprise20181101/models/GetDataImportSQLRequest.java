// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataImportSQLRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("SqlId")
    public Long sqlId;

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
