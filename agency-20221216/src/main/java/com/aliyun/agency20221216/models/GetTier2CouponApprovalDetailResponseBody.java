// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetTier2CouponApprovalDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTier2CouponApprovalDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0b9a079e17691387754512757e6a1b</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTier2CouponApprovalDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTier2CouponApprovalDetailResponseBody self = new GetTier2CouponApprovalDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTier2CouponApprovalDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTier2CouponApprovalDetailResponseBody setData(GetTier2CouponApprovalDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTier2CouponApprovalDetailResponseBodyData getData() {
        return this.data;
    }

    public GetTier2CouponApprovalDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTier2CouponApprovalDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UNIVERSAL</p>
         */
        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        /**
         * <strong>example:</strong>
         * <p>2026-01-21 11:24</p>
         */
        @NameInMap("ApplicationTime")
        public String applicationTime;

        /**
         * <strong>example:</strong>
         * <p>ALL,BILLING</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>test account</p>
         */
        @NameInMap("T2PartnerName")
        public String t2PartnerName;

        /**
         * <strong>example:</strong>
         * <p>5248516846402795</p>
         */
        @NameInMap("T2PartnerUid")
        public Long t2PartnerUid;

        /**
         * <strong>example:</strong>
         * <p>2026-01-21 ~ 2199-12-31</p>
         */
        @NameInMap("ValidUntil")
        public String validUntil;

        public static GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo self = new GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo();
            return TeaModel.build(map, self);
        }

        public GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo setApplicationTime(String applicationTime) {
            this.applicationTime = applicationTime;
            return this;
        }
        public String getApplicationTime() {
            return this.applicationTime;
        }

        public GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo setT2PartnerName(String t2PartnerName) {
            this.t2PartnerName = t2PartnerName;
            return this;
        }
        public String getT2PartnerName() {
            return this.t2PartnerName;
        }

        public GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo setT2PartnerUid(Long t2PartnerUid) {
            this.t2PartnerUid = t2PartnerUid;
            return this;
        }
        public Long getT2PartnerUid() {
            return this.t2PartnerUid;
        }

        public GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo setValidUntil(String validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public String getValidUntil() {
            return this.validUntil;
        }

    }

    public static class GetTier2CouponApprovalDetailResponseBodyDataCouponReceiptUidList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("NominalValue")
        public String nominalValue;

        /**
         * <strong>example:</strong>
         * <p>1703016242044705</p>
         */
        @NameInMap("Uid")
        public Long uid;

        public static GetTier2CouponApprovalDetailResponseBodyDataCouponReceiptUidList build(java.util.Map<String, ?> map) throws Exception {
            GetTier2CouponApprovalDetailResponseBodyDataCouponReceiptUidList self = new GetTier2CouponApprovalDetailResponseBodyDataCouponReceiptUidList();
            return TeaModel.build(map, self);
        }

        public GetTier2CouponApprovalDetailResponseBodyDataCouponReceiptUidList setNominalValue(String nominalValue) {
            this.nominalValue = nominalValue;
            return this;
        }
        public String getNominalValue() {
            return this.nominalValue;
        }

        public GetTier2CouponApprovalDetailResponseBodyDataCouponReceiptUidList setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class GetTier2CouponApprovalDetailResponseBodyData extends TeaModel {
        @NameInMap("ApplicantInfo")
        public GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo applicantInfo;

        @NameInMap("ApplicationReason")
        public String applicationReason;

        /**
         * <strong>example:</strong>
         * <p>0b9a079e17691387754512757e6a1b</p>
         */
        @NameInMap("ApplicationSheetId")
        public String applicationSheetId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ApprovalStatus")
        public String approvalStatus;

        @NameInMap("CouponReceiptUidList")
        public java.util.List<GetTier2CouponApprovalDetailResponseBodyDataCouponReceiptUidList> couponReceiptUidList;

        /**
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        @NameInMap("RemainingQuota")
        public String remainingQuota;

        /**
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("TotalAmount")
        public String totalAmount;

        public static GetTier2CouponApprovalDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTier2CouponApprovalDetailResponseBodyData self = new GetTier2CouponApprovalDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTier2CouponApprovalDetailResponseBodyData setApplicantInfo(GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo applicantInfo) {
            this.applicantInfo = applicantInfo;
            return this;
        }
        public GetTier2CouponApprovalDetailResponseBodyDataApplicantInfo getApplicantInfo() {
            return this.applicantInfo;
        }

        public GetTier2CouponApprovalDetailResponseBodyData setApplicationReason(String applicationReason) {
            this.applicationReason = applicationReason;
            return this;
        }
        public String getApplicationReason() {
            return this.applicationReason;
        }

        public GetTier2CouponApprovalDetailResponseBodyData setApplicationSheetId(String applicationSheetId) {
            this.applicationSheetId = applicationSheetId;
            return this;
        }
        public String getApplicationSheetId() {
            return this.applicationSheetId;
        }

        public GetTier2CouponApprovalDetailResponseBodyData setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetTier2CouponApprovalDetailResponseBodyData setCouponReceiptUidList(java.util.List<GetTier2CouponApprovalDetailResponseBodyDataCouponReceiptUidList> couponReceiptUidList) {
            this.couponReceiptUidList = couponReceiptUidList;
            return this;
        }
        public java.util.List<GetTier2CouponApprovalDetailResponseBodyDataCouponReceiptUidList> getCouponReceiptUidList() {
            return this.couponReceiptUidList;
        }

        public GetTier2CouponApprovalDetailResponseBodyData setRemainingQuota(String remainingQuota) {
            this.remainingQuota = remainingQuota;
            return this;
        }
        public String getRemainingQuota() {
            return this.remainingQuota;
        }

        public GetTier2CouponApprovalDetailResponseBodyData setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

    }

}
