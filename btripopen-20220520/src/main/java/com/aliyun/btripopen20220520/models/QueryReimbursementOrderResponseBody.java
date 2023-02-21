// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryReimbursementOrderResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public QueryReimbursementOrderResponseBodyModule module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static QueryReimbursementOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReimbursementOrderResponseBody self = new QueryReimbursementOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReimbursementOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryReimbursementOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryReimbursementOrderResponseBody setModule(QueryReimbursementOrderResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryReimbursementOrderResponseBodyModule getModule() {
        return this.module;
    }

    public QueryReimbursementOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReimbursementOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryReimbursementOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class QueryReimbursementOrderResponseBodyModuleExpenses extends TeaModel {
        @NameInMap("amount")
        public String amount;

        @NameInMap("currency")
        public String currency;

        @NameInMap("expense_city")
        public String expenseCity;

        @NameInMap("expense_time")
        public String expenseTime;

        @NameInMap("expense_type")
        public String expenseType;

        @NameInMap("expense_type_code")
        public String expenseTypeCode;

        @NameInMap("reimb_expense_id")
        public Long reimbExpenseId;

        @NameInMap("remark")
        public String remark;

        @NameInMap("settlement_type")
        public String settlementType;

        public static QueryReimbursementOrderResponseBodyModuleExpenses build(java.util.Map<String, ?> map) throws Exception {
            QueryReimbursementOrderResponseBodyModuleExpenses self = new QueryReimbursementOrderResponseBodyModuleExpenses();
            return TeaModel.build(map, self);
        }

        public QueryReimbursementOrderResponseBodyModuleExpenses setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryReimbursementOrderResponseBodyModuleExpenses setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryReimbursementOrderResponseBodyModuleExpenses setExpenseCity(String expenseCity) {
            this.expenseCity = expenseCity;
            return this;
        }
        public String getExpenseCity() {
            return this.expenseCity;
        }

        public QueryReimbursementOrderResponseBodyModuleExpenses setExpenseTime(String expenseTime) {
            this.expenseTime = expenseTime;
            return this;
        }
        public String getExpenseTime() {
            return this.expenseTime;
        }

        public QueryReimbursementOrderResponseBodyModuleExpenses setExpenseType(String expenseType) {
            this.expenseType = expenseType;
            return this;
        }
        public String getExpenseType() {
            return this.expenseType;
        }

        public QueryReimbursementOrderResponseBodyModuleExpenses setExpenseTypeCode(String expenseTypeCode) {
            this.expenseTypeCode = expenseTypeCode;
            return this;
        }
        public String getExpenseTypeCode() {
            return this.expenseTypeCode;
        }

        public QueryReimbursementOrderResponseBodyModuleExpenses setReimbExpenseId(Long reimbExpenseId) {
            this.reimbExpenseId = reimbExpenseId;
            return this;
        }
        public Long getReimbExpenseId() {
            return this.reimbExpenseId;
        }

        public QueryReimbursementOrderResponseBodyModuleExpenses setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryReimbursementOrderResponseBodyModuleExpenses setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

    }

    public static class QueryReimbursementOrderResponseBodyModuleItineraries extends TeaModel {
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("traffic_way")
        public String trafficWay;

        @NameInMap("trip_way")
        public String tripWay;

        public static QueryReimbursementOrderResponseBodyModuleItineraries build(java.util.Map<String, ?> map) throws Exception {
            QueryReimbursementOrderResponseBodyModuleItineraries self = new QueryReimbursementOrderResponseBodyModuleItineraries();
            return TeaModel.build(map, self);
        }

        public QueryReimbursementOrderResponseBodyModuleItineraries setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public QueryReimbursementOrderResponseBodyModuleItineraries setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public QueryReimbursementOrderResponseBodyModuleItineraries setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public QueryReimbursementOrderResponseBodyModuleItineraries setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public QueryReimbursementOrderResponseBodyModuleItineraries setTrafficWay(String trafficWay) {
            this.trafficWay = trafficWay;
            return this;
        }
        public String getTrafficWay() {
            return this.trafficWay;
        }

        public QueryReimbursementOrderResponseBodyModuleItineraries setTripWay(String tripWay) {
            this.tripWay = tripWay;
            return this;
        }
        public String getTripWay() {
            return this.tripWay;
        }

    }

    public static class QueryReimbursementOrderResponseBodyModulePaymentInfos extends TeaModel {
        @NameInMap("amount")
        public String amount;

        @NameInMap("payee_user_id")
        public String payeeUserId;

        public static QueryReimbursementOrderResponseBodyModulePaymentInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryReimbursementOrderResponseBodyModulePaymentInfos self = new QueryReimbursementOrderResponseBodyModulePaymentInfos();
            return TeaModel.build(map, self);
        }

        public QueryReimbursementOrderResponseBodyModulePaymentInfos setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryReimbursementOrderResponseBodyModulePaymentInfos setPayeeUserId(String payeeUserId) {
            this.payeeUserId = payeeUserId;
            return this;
        }
        public String getPayeeUserId() {
            return this.payeeUserId;
        }

    }

    public static class QueryReimbursementOrderResponseBodyModule extends TeaModel {
        @NameInMap("company_amount")
        public String companyAmount;

        @NameInMap("company_pay_amount")
        public String companyPayAmount;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("expenses")
        public java.util.List<QueryReimbursementOrderResponseBodyModuleExpenses> expenses;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modified")
        public String gmtModified;

        @NameInMap("itineraries")
        public java.util.List<QueryReimbursementOrderResponseBodyModuleItineraries> itineraries;

        @NameInMap("payment_infos")
        public java.util.List<QueryReimbursementOrderResponseBodyModulePaymentInfos> paymentInfos;

        @NameInMap("personal_amount")
        public String personalAmount;

        @NameInMap("reason")
        public String reason;

        @NameInMap("reimbursement_no")
        public String reimbursementNo;

        @NameInMap("remark")
        public String remark;

        @NameInMap("status")
        public String status;

        @NameInMap("travel_third_apply_id")
        public String travelThirdApplyId;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static QueryReimbursementOrderResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryReimbursementOrderResponseBodyModule self = new QueryReimbursementOrderResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryReimbursementOrderResponseBodyModule setCompanyAmount(String companyAmount) {
            this.companyAmount = companyAmount;
            return this;
        }
        public String getCompanyAmount() {
            return this.companyAmount;
        }

        public QueryReimbursementOrderResponseBodyModule setCompanyPayAmount(String companyPayAmount) {
            this.companyPayAmount = companyPayAmount;
            return this;
        }
        public String getCompanyPayAmount() {
            return this.companyPayAmount;
        }

        public QueryReimbursementOrderResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public QueryReimbursementOrderResponseBodyModule setExpenses(java.util.List<QueryReimbursementOrderResponseBodyModuleExpenses> expenses) {
            this.expenses = expenses;
            return this;
        }
        public java.util.List<QueryReimbursementOrderResponseBodyModuleExpenses> getExpenses() {
            return this.expenses;
        }

        public QueryReimbursementOrderResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryReimbursementOrderResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryReimbursementOrderResponseBodyModule setItineraries(java.util.List<QueryReimbursementOrderResponseBodyModuleItineraries> itineraries) {
            this.itineraries = itineraries;
            return this;
        }
        public java.util.List<QueryReimbursementOrderResponseBodyModuleItineraries> getItineraries() {
            return this.itineraries;
        }

        public QueryReimbursementOrderResponseBodyModule setPaymentInfos(java.util.List<QueryReimbursementOrderResponseBodyModulePaymentInfos> paymentInfos) {
            this.paymentInfos = paymentInfos;
            return this;
        }
        public java.util.List<QueryReimbursementOrderResponseBodyModulePaymentInfos> getPaymentInfos() {
            return this.paymentInfos;
        }

        public QueryReimbursementOrderResponseBodyModule setPersonalAmount(String personalAmount) {
            this.personalAmount = personalAmount;
            return this;
        }
        public String getPersonalAmount() {
            return this.personalAmount;
        }

        public QueryReimbursementOrderResponseBodyModule setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryReimbursementOrderResponseBodyModule setReimbursementNo(String reimbursementNo) {
            this.reimbursementNo = reimbursementNo;
            return this;
        }
        public String getReimbursementNo() {
            return this.reimbursementNo;
        }

        public QueryReimbursementOrderResponseBodyModule setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryReimbursementOrderResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryReimbursementOrderResponseBodyModule setTravelThirdApplyId(String travelThirdApplyId) {
            this.travelThirdApplyId = travelThirdApplyId;
            return this;
        }
        public String getTravelThirdApplyId() {
            return this.travelThirdApplyId;
        }

        public QueryReimbursementOrderResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryReimbursementOrderResponseBodyModule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
