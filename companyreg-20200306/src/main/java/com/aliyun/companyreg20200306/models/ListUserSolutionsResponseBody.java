// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserSolutionsResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<ListUserSolutionsResponseBodyData> data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static ListUserSolutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserSolutionsResponseBody self = new ListUserSolutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserSolutionsResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public ListUserSolutionsResponseBody setData(java.util.List<ListUserSolutionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserSolutionsResponseBodyData> getData() {
        return this.data;
    }

    public ListUserSolutionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserSolutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserSolutionsResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListUserSolutionsResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListUserSolutionsResponseBodyData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DeliveryOrderBizId")
        public String deliveryOrderBizId;

        @NameInMap("IntentionAssignBizId")
        public String intentionAssignBizId;

        @NameInMap("IntentionBizId")
        public String intentionBizId;

        @NameInMap("PartnerCode")
        public String partnerCode;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static ListUserSolutionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserSolutionsResponseBodyData self = new ListUserSolutionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserSolutionsResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListUserSolutionsResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListUserSolutionsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUserSolutionsResponseBodyData setDeliveryOrderBizId(String deliveryOrderBizId) {
            this.deliveryOrderBizId = deliveryOrderBizId;
            return this;
        }
        public String getDeliveryOrderBizId() {
            return this.deliveryOrderBizId;
        }

        public ListUserSolutionsResponseBodyData setIntentionAssignBizId(String intentionAssignBizId) {
            this.intentionAssignBizId = intentionAssignBizId;
            return this;
        }
        public String getIntentionAssignBizId() {
            return this.intentionAssignBizId;
        }

        public ListUserSolutionsResponseBodyData setIntentionBizId(String intentionBizId) {
            this.intentionBizId = intentionBizId;
            return this;
        }
        public String getIntentionBizId() {
            return this.intentionBizId;
        }

        public ListUserSolutionsResponseBodyData setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public ListUserSolutionsResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListUserSolutionsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListUserSolutionsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListUserSolutionsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
