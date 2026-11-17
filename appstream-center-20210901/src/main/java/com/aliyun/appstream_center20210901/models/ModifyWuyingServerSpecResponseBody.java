// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyWuyingServerSpecResponseBody extends TeaModel {
    /**
     * <p>The processing result of the specification change.</p>
     */
    @NameInMap("ModifyWuyingServerSpecModel")
    public ModifyWuyingServerSpecResponseBodyModifyWuyingServerSpecModel modifyWuyingServerSpecModel;

    /**
     * <p>The ID of the request. It is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWuyingServerSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWuyingServerSpecResponseBody self = new ModifyWuyingServerSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWuyingServerSpecResponseBody setModifyWuyingServerSpecModel(ModifyWuyingServerSpecResponseBodyModifyWuyingServerSpecModel modifyWuyingServerSpecModel) {
        this.modifyWuyingServerSpecModel = modifyWuyingServerSpecModel;
        return this;
    }
    public ModifyWuyingServerSpecResponseBodyModifyWuyingServerSpecModel getModifyWuyingServerSpecModel() {
        return this.modifyWuyingServerSpecModel;
    }

    public ModifyWuyingServerSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyWuyingServerSpecResponseBodyModifyWuyingServerSpecModel extends TeaModel {
        /**
         * <p>The ID of the order generated for this specification change. Returning an order ID does not mean that the specification change is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>23429322113****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static ModifyWuyingServerSpecResponseBodyModifyWuyingServerSpecModel build(java.util.Map<String, ?> map) throws Exception {
            ModifyWuyingServerSpecResponseBodyModifyWuyingServerSpecModel self = new ModifyWuyingServerSpecResponseBodyModifyWuyingServerSpecModel();
            return TeaModel.build(map, self);
        }

        public ModifyWuyingServerSpecResponseBodyModifyWuyingServerSpecModel setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
