// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListTier2CouponApprovalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTier2CouponApprovalResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListTier2CouponApprovalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTier2CouponApprovalResponseBody self = new ListTier2CouponApprovalResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTier2CouponApprovalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTier2CouponApprovalResponseBody setData(java.util.List<ListTier2CouponApprovalResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTier2CouponApprovalResponseBodyData> getData() {
        return this.data;
    }

    public ListTier2CouponApprovalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTier2CouponApprovalResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListTier2CouponApprovalResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTier2CouponApprovalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTier2CouponApprovalResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListTier2CouponApprovalResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d54ca949-9b88-4514-add3-c6029c4027f4</p>
         */
        @NameInMap("ApplicationSheetId")
        public String applicationSheetId;

        /**
         * <strong>example:</strong>
         * <p>2026-01-21 11:24</p>
         */
        @NameInMap("ApplicationTime")
        public String applicationTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApprovalStatus")
        public String approvalStatus;

        /**
         * <strong>example:</strong>
         * <p>test account</p>
         */
        @NameInMap("T2PartnerName")
        public String t2PartnerName;

        /**
         * <strong>example:</strong>
         * <p>5248516956402795</p>
         */
        @NameInMap("T2PartnerUid")
        public Long t2PartnerUid;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalAmount")
        public String totalAmount;

        public static ListTier2CouponApprovalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTier2CouponApprovalResponseBodyData self = new ListTier2CouponApprovalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTier2CouponApprovalResponseBodyData setApplicationSheetId(String applicationSheetId) {
            this.applicationSheetId = applicationSheetId;
            return this;
        }
        public String getApplicationSheetId() {
            return this.applicationSheetId;
        }

        public ListTier2CouponApprovalResponseBodyData setApplicationTime(String applicationTime) {
            this.applicationTime = applicationTime;
            return this;
        }
        public String getApplicationTime() {
            return this.applicationTime;
        }

        public ListTier2CouponApprovalResponseBodyData setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        public ListTier2CouponApprovalResponseBodyData setT2PartnerName(String t2PartnerName) {
            this.t2PartnerName = t2PartnerName;
            return this;
        }
        public String getT2PartnerName() {
            return this.t2PartnerName;
        }

        public ListTier2CouponApprovalResponseBodyData setT2PartnerUid(Long t2PartnerUid) {
            this.t2PartnerUid = t2PartnerUid;
            return this;
        }
        public Long getT2PartnerUid() {
            return this.t2PartnerUid;
        }

        public ListTier2CouponApprovalResponseBodyData setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

    }

}
