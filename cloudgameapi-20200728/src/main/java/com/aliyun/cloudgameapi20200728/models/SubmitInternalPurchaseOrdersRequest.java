// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseOrdersRequest extends TeaModel {
    @NameInMap("OrderList")
    @Validation(required = true)
    public java.util.List<SubmitInternalPurchaseOrdersRequestOrderList> orderList;

    public static SubmitInternalPurchaseOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseOrdersRequest self = new SubmitInternalPurchaseOrdersRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseOrdersRequest setOrderList(java.util.List<SubmitInternalPurchaseOrdersRequestOrderList> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<SubmitInternalPurchaseOrdersRequestOrderList> getOrderList() {
        return this.orderList;
    }

    public static class SubmitInternalPurchaseOrdersRequestOrderList extends TeaModel {
        @NameInMap("BatchNumber")
        @Validation(required = true)
        public String batchNumber;

        @NameInMap("FinalPrice")
        @Validation(required = true)
        public Long finalPrice;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("RoleId")
        @Validation(required = true)
        public String roleId;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        public static SubmitInternalPurchaseOrdersRequestOrderList build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseOrdersRequestOrderList self = new SubmitInternalPurchaseOrdersRequestOrderList();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setBatchNumber(String batchNumber) {
            this.batchNumber = batchNumber;
            return this;
        }
        public String getBatchNumber() {
            return this.batchNumber;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setFinalPrice(Long finalPrice) {
            this.finalPrice = finalPrice;
            return this;
        }
        public Long getFinalPrice() {
            return this.finalPrice;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
