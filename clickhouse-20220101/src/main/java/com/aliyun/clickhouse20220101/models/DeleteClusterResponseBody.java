// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DeleteClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteClusterResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterResponseBody self = new DeleteClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterResponseBody setData(DeleteClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteClusterResponseBodyData getData() {
        return this.data;
    }

    public DeleteClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteClusterResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        public static DeleteClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteClusterResponseBodyData self = new DeleteClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteClusterResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
