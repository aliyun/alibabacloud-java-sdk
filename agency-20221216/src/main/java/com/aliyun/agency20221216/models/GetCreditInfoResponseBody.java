// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCreditInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCreditInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCreditInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCreditInfoResponseBody self = new GetCreditInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCreditInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCreditInfoResponseBody setData(GetCreditInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCreditInfoResponseBodyData getData() {
        return this.data;
    }

    public GetCreditInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCreditInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCreditInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCreditInfoResponseBodyData extends TeaModel {
        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AlarmThreshold")
        public String alarmThreshold;

        @NameInMap("AvailableCredit")
        public String availableCredit;

        @NameInMap("ConsumedUndeductedValue")
        public String consumedUndeductedValue;

        @NameInMap("CreditLine")
        public String creditLine;

        @NameInMap("OutstandingBalance")
        public String outstandingBalance;

        @NameInMap("ZeroCreditShutdownPolicy")
        public String zeroCreditShutdownPolicy;

        @NameInMap("newBuyStatus")
        public String newBuyStatus;

        public static GetCreditInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCreditInfoResponseBodyData self = new GetCreditInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCreditInfoResponseBodyData setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public GetCreditInfoResponseBodyData setAlarmThreshold(String alarmThreshold) {
            this.alarmThreshold = alarmThreshold;
            return this;
        }
        public String getAlarmThreshold() {
            return this.alarmThreshold;
        }

        public GetCreditInfoResponseBodyData setAvailableCredit(String availableCredit) {
            this.availableCredit = availableCredit;
            return this;
        }
        public String getAvailableCredit() {
            return this.availableCredit;
        }

        public GetCreditInfoResponseBodyData setConsumedUndeductedValue(String consumedUndeductedValue) {
            this.consumedUndeductedValue = consumedUndeductedValue;
            return this;
        }
        public String getConsumedUndeductedValue() {
            return this.consumedUndeductedValue;
        }

        public GetCreditInfoResponseBodyData setCreditLine(String creditLine) {
            this.creditLine = creditLine;
            return this;
        }
        public String getCreditLine() {
            return this.creditLine;
        }

        public GetCreditInfoResponseBodyData setOutstandingBalance(String outstandingBalance) {
            this.outstandingBalance = outstandingBalance;
            return this;
        }
        public String getOutstandingBalance() {
            return this.outstandingBalance;
        }

        public GetCreditInfoResponseBodyData setZeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
            this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
            return this;
        }
        public String getZeroCreditShutdownPolicy() {
            return this.zeroCreditShutdownPolicy;
        }

        public GetCreditInfoResponseBodyData setNewBuyStatus(String newBuyStatus) {
            this.newBuyStatus = newBuyStatus;
            return this;
        }
        public String getNewBuyStatus() {
            return this.newBuyStatus;
        }

    }

}
