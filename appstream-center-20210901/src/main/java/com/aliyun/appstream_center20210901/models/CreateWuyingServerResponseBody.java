// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateWuyingServerResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public CreateWuyingServerResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWuyingServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWuyingServerResponseBody self = new CreateWuyingServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWuyingServerResponseBody setData(CreateWuyingServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWuyingServerResponseBodyData getData() {
        return this.data;
    }

    public CreateWuyingServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateWuyingServerResponseBodyData extends TeaModel {
        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23429322113****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The list of workstation IDs.</p>
         */
        @NameInMap("WuyingServerIdList")
        public java.util.List<String> wuyingServerIdList;

        public static CreateWuyingServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWuyingServerResponseBodyData self = new CreateWuyingServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWuyingServerResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CreateWuyingServerResponseBodyData setWuyingServerIdList(java.util.List<String> wuyingServerIdList) {
            this.wuyingServerIdList = wuyingServerIdList;
            return this;
        }
        public java.util.List<String> getWuyingServerIdList() {
            return this.wuyingServerIdList;
        }

    }

}
