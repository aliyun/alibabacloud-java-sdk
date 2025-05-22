// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserDetailSolutionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<ListUserDetailSolutionsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2174AA97-56FB-50FA-B243-0460B9E4CE0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static ListUserDetailSolutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDetailSolutionsResponseBody self = new ListUserDetailSolutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDetailSolutionsResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public ListUserDetailSolutionsResponseBody setData(java.util.List<ListUserDetailSolutionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserDetailSolutionsResponseBodyData> getData() {
        return this.data;
    }

    public ListUserDetailSolutionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserDetailSolutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDetailSolutionsResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListUserDetailSolutionsResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListUserDetailSolutionsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>S20211222161651000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>esp.wangwen</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>15556223433</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>P20211222161651000001</p>
         */
        @NameInMap("DeliveryOrderBizId")
        public String deliveryOrderBizId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtInfo")
        public String extInfo;

        /**
         * <strong>example:</strong>
         * <p>A20211222161651000001</p>
         */
        @NameInMap("IntentionAssignBizId")
        public String intentionAssignBizId;

        /**
         * <strong>example:</strong>
         * <p>I20211222161651000001</p>
         */
        @NameInMap("IntentionBizId")
        public String intentionBizId;

        /**
         * <strong>example:</strong>
         * <p>jinsan</p>
         */
        @NameInMap("PartnerCode")
        public String partnerCode;

        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>15556223433</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <strong>example:</strong>
         * <p>1219541161213057</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUserDetailSolutionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserDetailSolutionsResponseBodyData self = new ListUserDetailSolutionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserDetailSolutionsResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListUserDetailSolutionsResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListUserDetailSolutionsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUserDetailSolutionsResponseBodyData setDeliveryOrderBizId(String deliveryOrderBizId) {
            this.deliveryOrderBizId = deliveryOrderBizId;
            return this;
        }
        public String getDeliveryOrderBizId() {
            return this.deliveryOrderBizId;
        }

        public ListUserDetailSolutionsResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListUserDetailSolutionsResponseBodyData setIntentionAssignBizId(String intentionAssignBizId) {
            this.intentionAssignBizId = intentionAssignBizId;
            return this;
        }
        public String getIntentionAssignBizId() {
            return this.intentionAssignBizId;
        }

        public ListUserDetailSolutionsResponseBodyData setIntentionBizId(String intentionBizId) {
            this.intentionBizId = intentionBizId;
            return this;
        }
        public String getIntentionBizId() {
            return this.intentionBizId;
        }

        public ListUserDetailSolutionsResponseBodyData setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public ListUserDetailSolutionsResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListUserDetailSolutionsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListUserDetailSolutionsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListUserDetailSolutionsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
