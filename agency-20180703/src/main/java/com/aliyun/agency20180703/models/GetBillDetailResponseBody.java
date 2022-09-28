// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetBillDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBillDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static GetBillDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBillDetailResponseBody self = new GetBillDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBillDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBillDetailResponseBody setData(GetBillDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBillDetailResponseBodyData getData() {
        return this.data;
    }

    public GetBillDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBillDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBillDetailResponseBodyDataRegionInfoListRegionInfo extends TeaModel {
        @NameInMap("DiscountFee")
        public String discountFee;

        @NameInMap("RegionCode")
        public String regionCode;

        @NameInMap("RequirePayAmount")
        public String requirePayAmount;

        @NameInMap("TotalFee")
        public String totalFee;

        @NameInMap("YouhuiquanPayAmount")
        public String youhuiquanPayAmount;

        public static GetBillDetailResponseBodyDataRegionInfoListRegionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBillDetailResponseBodyDataRegionInfoListRegionInfo self = new GetBillDetailResponseBodyDataRegionInfoListRegionInfo();
            return TeaModel.build(map, self);
        }

        public GetBillDetailResponseBodyDataRegionInfoListRegionInfo setDiscountFee(String discountFee) {
            this.discountFee = discountFee;
            return this;
        }
        public String getDiscountFee() {
            return this.discountFee;
        }

        public GetBillDetailResponseBodyDataRegionInfoListRegionInfo setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public GetBillDetailResponseBodyDataRegionInfoListRegionInfo setRequirePayAmount(String requirePayAmount) {
            this.requirePayAmount = requirePayAmount;
            return this;
        }
        public String getRequirePayAmount() {
            return this.requirePayAmount;
        }

        public GetBillDetailResponseBodyDataRegionInfoListRegionInfo setTotalFee(String totalFee) {
            this.totalFee = totalFee;
            return this;
        }
        public String getTotalFee() {
            return this.totalFee;
        }

        public GetBillDetailResponseBodyDataRegionInfoListRegionInfo setYouhuiquanPayAmount(String youhuiquanPayAmount) {
            this.youhuiquanPayAmount = youhuiquanPayAmount;
            return this;
        }
        public String getYouhuiquanPayAmount() {
            return this.youhuiquanPayAmount;
        }

    }

    public static class GetBillDetailResponseBodyDataRegionInfoList extends TeaModel {
        @NameInMap("regionInfo")
        public java.util.List<GetBillDetailResponseBodyDataRegionInfoListRegionInfo> regionInfo;

        public static GetBillDetailResponseBodyDataRegionInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetBillDetailResponseBodyDataRegionInfoList self = new GetBillDetailResponseBodyDataRegionInfoList();
            return TeaModel.build(map, self);
        }

        public GetBillDetailResponseBodyDataRegionInfoList setRegionInfo(java.util.List<GetBillDetailResponseBodyDataRegionInfoListRegionInfo> regionInfo) {
            this.regionInfo = regionInfo;
            return this;
        }
        public java.util.List<GetBillDetailResponseBodyDataRegionInfoListRegionInfo> getRegionInfo() {
            return this.regionInfo;
        }

    }

    public static class GetBillDetailResponseBodyData extends TeaModel {
        @NameInMap("BillEndTime")
        public String billEndTime;

        @NameInMap("BillId")
        public String billId;

        @NameInMap("BillStartTime")
        public String billStartTime;

        @NameInMap("Offering")
        public String offering;

        @NameInMap("PayStatus")
        public String payStatus;

        @NameInMap("Period")
        public String period;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("RegionInfoList")
        public GetBillDetailResponseBodyDataRegionInfoList regionInfoList;

        public static GetBillDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBillDetailResponseBodyData self = new GetBillDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBillDetailResponseBodyData setBillEndTime(String billEndTime) {
            this.billEndTime = billEndTime;
            return this;
        }
        public String getBillEndTime() {
            return this.billEndTime;
        }

        public GetBillDetailResponseBodyData setBillId(String billId) {
            this.billId = billId;
            return this;
        }
        public String getBillId() {
            return this.billId;
        }

        public GetBillDetailResponseBodyData setBillStartTime(String billStartTime) {
            this.billStartTime = billStartTime;
            return this;
        }
        public String getBillStartTime() {
            return this.billStartTime;
        }

        public GetBillDetailResponseBodyData setOffering(String offering) {
            this.offering = offering;
            return this;
        }
        public String getOffering() {
            return this.offering;
        }

        public GetBillDetailResponseBodyData setPayStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public String getPayStatus() {
            return this.payStatus;
        }

        public GetBillDetailResponseBodyData setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public GetBillDetailResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetBillDetailResponseBodyData setRegionInfoList(GetBillDetailResponseBodyDataRegionInfoList regionInfoList) {
            this.regionInfoList = regionInfoList;
            return this;
        }
        public GetBillDetailResponseBodyDataRegionInfoList getRegionInfoList() {
            return this.regionInfoList;
        }

    }

}
