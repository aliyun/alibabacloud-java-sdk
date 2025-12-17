// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAppInstanceGroupResponseBody extends TeaModel {
    /**
     * <p>The delivery group.</p>
     */
    @NameInMap("AppInstanceGroupModel")
    public CreateAppInstanceGroupResponseBodyAppInstanceGroupModel appInstanceGroupModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceGroupResponseBody self = new CreateAppInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceGroupResponseBody setAppInstanceGroupModel(CreateAppInstanceGroupResponseBodyAppInstanceGroupModel appInstanceGroupModel) {
        this.appInstanceGroupModel = appInstanceGroupModel;
        return this;
    }
    public CreateAppInstanceGroupResponseBodyAppInstanceGroupModel getAppInstanceGroupModel() {
        return this.appInstanceGroupModel;
    }

    public CreateAppInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppInstanceGroupResponseBodyAppInstanceGroupModel extends TeaModel {
        /**
         * <p>The ID of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The ID of the resource group. This parameter is returned if a resource group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ew7va2g1wl3vm****</p>
         */
        @NameInMap("NodePoolId")
        public String nodePoolId;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static CreateAppInstanceGroupResponseBodyAppInstanceGroupModel build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceGroupResponseBodyAppInstanceGroupModel self = new CreateAppInstanceGroupResponseBodyAppInstanceGroupModel();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceGroupResponseBodyAppInstanceGroupModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public CreateAppInstanceGroupResponseBodyAppInstanceGroupModel setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public CreateAppInstanceGroupResponseBodyAppInstanceGroupModel setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
