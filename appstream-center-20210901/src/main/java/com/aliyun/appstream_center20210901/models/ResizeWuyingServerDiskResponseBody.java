// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ResizeWuyingServerDiskResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public ResizeWuyingServerDiskResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeWuyingServerDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeWuyingServerDiskResponseBody self = new ResizeWuyingServerDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeWuyingServerDiskResponseBody setData(ResizeWuyingServerDiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResizeWuyingServerDiskResponseBodyData getData() {
        return this.data;
    }

    public ResizeWuyingServerDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResizeWuyingServerDiskResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>23429322113****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static ResizeWuyingServerDiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResizeWuyingServerDiskResponseBodyData self = new ResizeWuyingServerDiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResizeWuyingServerDiskResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
