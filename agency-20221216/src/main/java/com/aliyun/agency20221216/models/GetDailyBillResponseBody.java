// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetDailyBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDailyBillResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDailyBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDailyBillResponseBody self = new GetDailyBillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDailyBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDailyBillResponseBody setData(GetDailyBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDailyBillResponseBodyData getData() {
        return this.data;
    }

    public GetDailyBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDailyBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDailyBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDailyBillResponseBodyData extends TeaModel {
        @NameInMap("BillLinkCSV")
        public String billLinkCSV;

        @NameInMap("BillLinkXLSX")
        public String billLinkXLSX;

        @NameInMap("BillOwner")
        public String billOwner;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("SpendingTime")
        public String spendingTime;

        public static GetDailyBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDailyBillResponseBodyData self = new GetDailyBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDailyBillResponseBodyData setBillLinkCSV(String billLinkCSV) {
            this.billLinkCSV = billLinkCSV;
            return this;
        }
        public String getBillLinkCSV() {
            return this.billLinkCSV;
        }

        public GetDailyBillResponseBodyData setBillLinkXLSX(String billLinkXLSX) {
            this.billLinkXLSX = billLinkXLSX;
            return this;
        }
        public String getBillLinkXLSX() {
            return this.billLinkXLSX;
        }

        public GetDailyBillResponseBodyData setBillOwner(String billOwner) {
            this.billOwner = billOwner;
            return this;
        }
        public String getBillOwner() {
            return this.billOwner;
        }

        public GetDailyBillResponseBodyData setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public GetDailyBillResponseBodyData setSpendingTime(String spendingTime) {
            this.spendingTime = spendingTime;
            return this;
        }
        public String getSpendingTime() {
            return this.spendingTime;
        }

    }

}
