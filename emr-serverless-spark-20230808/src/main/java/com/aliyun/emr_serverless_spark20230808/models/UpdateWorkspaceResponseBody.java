// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResponseBody extends TeaModel {
    @NameInMap("data")
    public UpdateWorkspaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>979071171373334529</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResponseBody self = new UpdateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResponseBody setData(UpdateWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public UpdateWorkspaceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateWorkspaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1005565802416783361</p>
         */
        @NameInMap("orderId")
        public String orderId;

        public static UpdateWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceResponseBodyData self = new UpdateWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
