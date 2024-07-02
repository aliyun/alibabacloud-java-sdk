// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LogisticsOrderListResult extends TeaModel {
    @NameInMap("logisticsOrderList")
    public java.util.List<LogisticsOrderResult> logisticsOrderList;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static LogisticsOrderListResult build(java.util.Map<String, ?> map) throws Exception {
        LogisticsOrderListResult self = new LogisticsOrderListResult();
        return TeaModel.build(map, self);
    }

    public LogisticsOrderListResult setLogisticsOrderList(java.util.List<LogisticsOrderResult> logisticsOrderList) {
        this.logisticsOrderList = logisticsOrderList;
        return this;
    }
    public java.util.List<LogisticsOrderResult> getLogisticsOrderList() {
        return this.logisticsOrderList;
    }

    public LogisticsOrderListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
