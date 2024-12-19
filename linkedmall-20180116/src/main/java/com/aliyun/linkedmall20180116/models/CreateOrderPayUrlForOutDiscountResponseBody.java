// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderPayUrlForOutDiscountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateOrderPayUrlForOutDiscountResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>6103AD7B-21C2-523B-89D0-579DA58D08E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOrderPayUrlForOutDiscountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderPayUrlForOutDiscountResponseBody self = new CreateOrderPayUrlForOutDiscountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderPayUrlForOutDiscountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrderPayUrlForOutDiscountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrderPayUrlForOutDiscountResponseBody setModel(CreateOrderPayUrlForOutDiscountResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateOrderPayUrlForOutDiscountResponseBodyModel getModel() {
        return this.model;
    }

    public CreateOrderPayUrlForOutDiscountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderPayUrlForOutDiscountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOrderPayUrlForOutDiscountResponseBodyModel extends TeaModel {
        @NameInMap("AllIdsMap")
        public java.util.Map<String, java.util.Map<String, ?>> allIdsMap;

        @NameInMap("LmOrderList")
        public java.util.List<String> lmOrderList;

        @NameInMap("OrderIds")
        public java.util.List<String> orderIds;

        @NameInMap("PayTradeIds")
        public java.util.List<String> payTradeIds;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("RedirectUrl")
        public String redirectUrl;

        public static CreateOrderPayUrlForOutDiscountResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderPayUrlForOutDiscountResponseBodyModel self = new CreateOrderPayUrlForOutDiscountResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateOrderPayUrlForOutDiscountResponseBodyModel setAllIdsMap(java.util.Map<String, java.util.Map<String, ?>> allIdsMap) {
            this.allIdsMap = allIdsMap;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getAllIdsMap() {
            return this.allIdsMap;
        }

        public CreateOrderPayUrlForOutDiscountResponseBodyModel setLmOrderList(java.util.List<String> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<String> getLmOrderList() {
            return this.lmOrderList;
        }

        public CreateOrderPayUrlForOutDiscountResponseBodyModel setOrderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

        public CreateOrderPayUrlForOutDiscountResponseBodyModel setPayTradeIds(java.util.List<String> payTradeIds) {
            this.payTradeIds = payTradeIds;
            return this;
        }
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

        public CreateOrderPayUrlForOutDiscountResponseBodyModel setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

    }

}
