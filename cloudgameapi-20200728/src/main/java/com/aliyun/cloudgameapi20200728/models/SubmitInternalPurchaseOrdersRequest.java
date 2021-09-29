// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseOrdersRequest extends TeaModel {
    @NameInMap("OrderList")
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
        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("FinalPrice")
        public Long finalPrice;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("GameId")
        public String gameId;

        @NameInMap("BatchNumber")
        public String batchNumber;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("OrderId")
        public String orderId;

        public static SubmitInternalPurchaseOrdersRequestOrderList build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseOrdersRequestOrderList self = new SubmitInternalPurchaseOrdersRequestOrderList();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setFinalPrice(Long finalPrice) {
            this.finalPrice = finalPrice;
            return this;
        }
        public Long getFinalPrice() {
            return this.finalPrice;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setBatchNumber(String batchNumber) {
            this.batchNumber = batchNumber;
            return this;
        }
        public String getBatchNumber() {
            return this.batchNumber;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public SubmitInternalPurchaseOrdersRequestOrderList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
