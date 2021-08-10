// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListUserHistoryProducesResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public java.util.List<ListUserHistoryProducesResponseBodyData> data;

    public static ListUserHistoryProducesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserHistoryProducesResponseBody self = new ListUserHistoryProducesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserHistoryProducesResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserHistoryProducesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserHistoryProducesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserHistoryProducesResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListUserHistoryProducesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserHistoryProducesResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public ListUserHistoryProducesResponseBody setData(java.util.List<ListUserHistoryProducesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserHistoryProducesResponseBodyData> getData() {
        return this.data;
    }

    public static class ListUserHistoryProducesResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("OrderPrice")
        public String orderPrice;

        @NameInMap("SolutionBizId")
        public String solutionBizId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("OrderTime")
        public String orderTime;

        @NameInMap("PartnerCode")
        public String partnerCode;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("IntentionBizId")
        public String intentionBizId;

        @NameInMap("OldOrder")
        public Boolean oldOrder;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static ListUserHistoryProducesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserHistoryProducesResponseBodyData self = new ListUserHistoryProducesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserHistoryProducesResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListUserHistoryProducesResponseBodyData setOrderPrice(String orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public String getOrderPrice() {
            return this.orderPrice;
        }

        public ListUserHistoryProducesResponseBodyData setSolutionBizId(String solutionBizId) {
            this.solutionBizId = solutionBizId;
            return this;
        }
        public String getSolutionBizId() {
            return this.solutionBizId;
        }

        public ListUserHistoryProducesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUserHistoryProducesResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListUserHistoryProducesResponseBodyData setOrderTime(String orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public String getOrderTime() {
            return this.orderTime;
        }

        public ListUserHistoryProducesResponseBodyData setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public ListUserHistoryProducesResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListUserHistoryProducesResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListUserHistoryProducesResponseBodyData setIntentionBizId(String intentionBizId) {
            this.intentionBizId = intentionBizId;
            return this;
        }
        public String getIntentionBizId() {
            return this.intentionBizId;
        }

        public ListUserHistoryProducesResponseBodyData setOldOrder(Boolean oldOrder) {
            this.oldOrder = oldOrder;
            return this;
        }
        public Boolean getOldOrder() {
            return this.oldOrder;
        }

        public ListUserHistoryProducesResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListUserHistoryProducesResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
