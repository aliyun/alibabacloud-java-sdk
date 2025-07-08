// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillInfoLeafNewResponseBody extends TeaModel {
    @NameInMap("CouponPayment")
    public String couponPayment;

    @NameInMap("IsSeparatedPrice")
    public Boolean isSeparatedPrice;

    @NameInMap("LayeredBillDOList")
    public java.util.List<QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList> layeredBillDOList;

    @NameInMap("PackageAmount")
    public String packageAmount;

    @NameInMap("RealPayment")
    public String realPayment;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalPayment")
    public String totalPayment;

    public static QueryMonthlyBillInfoLeafNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillInfoLeafNewResponseBody self = new QueryMonthlyBillInfoLeafNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillInfoLeafNewResponseBody setCouponPayment(String couponPayment) {
        this.couponPayment = couponPayment;
        return this;
    }
    public String getCouponPayment() {
        return this.couponPayment;
    }

    public QueryMonthlyBillInfoLeafNewResponseBody setIsSeparatedPrice(Boolean isSeparatedPrice) {
        this.isSeparatedPrice = isSeparatedPrice;
        return this;
    }
    public Boolean getIsSeparatedPrice() {
        return this.isSeparatedPrice;
    }

    public QueryMonthlyBillInfoLeafNewResponseBody setLayeredBillDOList(java.util.List<QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList> layeredBillDOList) {
        this.layeredBillDOList = layeredBillDOList;
        return this;
    }
    public java.util.List<QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList> getLayeredBillDOList() {
        return this.layeredBillDOList;
    }

    public QueryMonthlyBillInfoLeafNewResponseBody setPackageAmount(String packageAmount) {
        this.packageAmount = packageAmount;
        return this;
    }
    public String getPackageAmount() {
        return this.packageAmount;
    }

    public QueryMonthlyBillInfoLeafNewResponseBody setRealPayment(String realPayment) {
        this.realPayment = realPayment;
        return this;
    }
    public String getRealPayment() {
        return this.realPayment;
    }

    public QueryMonthlyBillInfoLeafNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonthlyBillInfoLeafNewResponseBody setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
        return this;
    }
    public String getTotalPayment() {
        return this.totalPayment;
    }

    public static class QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList extends TeaModel {
        @NameInMap("AddCount")
        public Long addCount;

        @NameInMap("AddUnit")
        public String addUnit;

        @NameInMap("BillAmount")
        public String billAmount;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("PackageBill")
        public String packageBill;

        @NameInMap("SinglePrice")
        public String singlePrice;

        @NameInMap("SubjectItemId")
        public String subjectItemId;

        @NameInMap("SubjectName")
        public String subjectName;

        public static QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList self = new QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setAddCount(Long addCount) {
            this.addCount = addCount;
            return this;
        }
        public Long getAddCount() {
            return this.addCount;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setAddUnit(String addUnit) {
            this.addUnit = addUnit;
            return this;
        }
        public String getAddUnit() {
            return this.addUnit;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setBillAmount(String billAmount) {
            this.billAmount = billAmount;
            return this;
        }
        public String getBillAmount() {
            return this.billAmount;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setPackageBill(String packageBill) {
            this.packageBill = packageBill;
            return this;
        }
        public String getPackageBill() {
            return this.packageBill;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setSinglePrice(String singlePrice) {
            this.singlePrice = singlePrice;
            return this;
        }
        public String getSinglePrice() {
            return this.singlePrice;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setSubjectItemId(String subjectItemId) {
            this.subjectItemId = subjectItemId;
            return this;
        }
        public String getSubjectItemId() {
            return this.subjectItemId;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }
        public String getSubjectName() {
            return this.subjectName;
        }

    }

    public static class QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList extends TeaModel {
        @NameInMap("AddCount")
        public Long addCount;

        @NameInMap("AddUnit")
        public String addUnit;

        @NameInMap("BillAmount")
        public String billAmount;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("PackageBill")
        public String packageBill;

        @NameInMap("SinglePrice")
        public String singlePrice;

        @NameInMap("SubjectDetailList")
        public java.util.List<QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList> subjectDetailList;

        @NameInMap("SubjectItemId")
        public String subjectItemId;

        @NameInMap("SubjectName")
        public String subjectName;

        public static QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList self = new QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setAddCount(Long addCount) {
            this.addCount = addCount;
            return this;
        }
        public Long getAddCount() {
            return this.addCount;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setAddUnit(String addUnit) {
            this.addUnit = addUnit;
            return this;
        }
        public String getAddUnit() {
            return this.addUnit;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setBillAmount(String billAmount) {
            this.billAmount = billAmount;
            return this;
        }
        public String getBillAmount() {
            return this.billAmount;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setPackageBill(String packageBill) {
            this.packageBill = packageBill;
            return this;
        }
        public String getPackageBill() {
            return this.packageBill;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setSinglePrice(String singlePrice) {
            this.singlePrice = singlePrice;
            return this;
        }
        public String getSinglePrice() {
            return this.singlePrice;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setSubjectDetailList(java.util.List<QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList> subjectDetailList) {
            this.subjectDetailList = subjectDetailList;
            return this;
        }
        public java.util.List<QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOListSubjectDetailList> getSubjectDetailList() {
            return this.subjectDetailList;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setSubjectItemId(String subjectItemId) {
            this.subjectItemId = subjectItemId;
            return this;
        }
        public String getSubjectItemId() {
            return this.subjectItemId;
        }

        public QueryMonthlyBillInfoLeafNewResponseBodyLayeredBillDOList setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }
        public String getSubjectName() {
            return this.subjectName;
        }

    }

}
