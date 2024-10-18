// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupOrder")
    public CreateResourceGroupResponseBodyResourceGroupOrder resourceGroupOrder;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupResponseBody self = new CreateResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceGroupResponseBody setResourceGroupOrder(CreateResourceGroupResponseBodyResourceGroupOrder resourceGroupOrder) {
        this.resourceGroupOrder = resourceGroupOrder;
        return this;
    }
    public CreateResourceGroupResponseBodyResourceGroupOrder getResourceGroupOrder() {
        return this.resourceGroupOrder;
    }

    public CreateResourceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateResourceGroupResponseBodyResourceGroupOrder extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2391982058XXXXX</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>c442b330-3b10-4584-959e-736e4edXXXXX</p>
         */
        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        public static CreateResourceGroupResponseBodyResourceGroupOrder build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceGroupResponseBodyResourceGroupOrder self = new CreateResourceGroupResponseBodyResourceGroupOrder();
            return TeaModel.build(map, self);
        }

        public CreateResourceGroupResponseBodyResourceGroupOrder setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateResourceGroupResponseBodyResourceGroupOrder setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CreateResourceGroupResponseBodyResourceGroupOrder setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

    }

}
