// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListUserProducesResponseBody extends TeaModel {
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
    public java.util.List<ListUserProducesResponseBodyData> data;

    public static ListUserProducesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProducesResponseBody self = new ListUserProducesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProducesResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserProducesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserProducesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserProducesResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListUserProducesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserProducesResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public ListUserProducesResponseBody setData(java.util.List<ListUserProducesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserProducesResponseBodyData> getData() {
        return this.data;
    }

    public static class ListUserProducesResponseBodyData extends TeaModel {
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

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static ListUserProducesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserProducesResponseBodyData self = new ListUserProducesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserProducesResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListUserProducesResponseBodyData setOrderPrice(String orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public String getOrderPrice() {
            return this.orderPrice;
        }

        public ListUserProducesResponseBodyData setSolutionBizId(String solutionBizId) {
            this.solutionBizId = solutionBizId;
            return this;
        }
        public String getSolutionBizId() {
            return this.solutionBizId;
        }

        public ListUserProducesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUserProducesResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListUserProducesResponseBodyData setOrderTime(String orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public String getOrderTime() {
            return this.orderTime;
        }

        public ListUserProducesResponseBodyData setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public ListUserProducesResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListUserProducesResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListUserProducesResponseBodyData setIntentionBizId(String intentionBizId) {
            this.intentionBizId = intentionBizId;
            return this;
        }
        public String getIntentionBizId() {
            return this.intentionBizId;
        }

        public ListUserProducesResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListUserProducesResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListUserProducesResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListUserProducesResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
