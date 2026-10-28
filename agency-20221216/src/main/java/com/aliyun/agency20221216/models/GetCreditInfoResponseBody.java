// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCreditInfoResponseBody extends TeaModel {
    /**
     * <p>The result code. Valid values:</p>
     * <ul>
     * <li>200: OK.</li>
     * <li>1109: System error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetCreditInfoResponseBodyData data;

    /**
     * <p>The message information.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud uses this ID for error tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the current API call is successful. Valid values:</p>
     * <ul>
     * <li>True: Successful.</li>
     * <li>False: Failed.</li>
     * </ul>
     * <p>This does not indicate whether the subsequent business operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The credit control status of the sub-account. Valid values:</p>
         * <ol>
         * <li>normal: Normal.</li>
         * <li>arrearsNotShutdown: The account has an overdue payment but is not shut down.</li>
         * <li>shutdown: Shut down.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The percentage value. When the available credit drops below this percentage of the credit limit, an email notification is sent to the main account.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AlarmThreshold")
        public String alarmThreshold;

        /**
         * <p>The available credit.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("AvailableCredit")
        public String availableCredit;

        /**
         * <p>The total outstanding amount of virtual bills before simulated deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("ConsumedUndeductedValue")
        public String consumedUndeductedValue;

        /**
         * <p>The credit limit of the sub-account.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreditLine")
        public String creditLine;

        /**
         * <p>The credit amount consumed by the sub-account that has not yet been paid.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OutstandingBalance")
        public String outstandingBalance;

        /**
         * <p>The freeze status of pay-as-you-go. Valid values:</p>
         * <ul>
         * <li>freeze: Frozen.</li>
         * <li>normal: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PAYGFreezeStatus")
        public String PAYGFreezeStatus;

        /**
         * <p>The policy that the system uses to manage resources when the active credit is 0 or less. Valid values:</p>
         * <p>1: delayStop. Alibaba Cloud takes over the resources. Instances are shut down after the credit is exhausted with a delay epoch. If payment is not made within 15 days, storage resources are released.</p>
         * <p>2: noStop. The system does not manage the resource lifecycle of the non-trusteeship linked account. The partner must manage it manually.</p>
         * <p>3: immediatelyStop. Instances are shut down immediately when the account enters the overdue payment state, which triggers instance shutdown.</p>
         * 
         * <strong>example:</strong>
         * <p>delayStop</p>
         */
        @NameInMap("ZeroCreditShutdownPolicy")
        public String zeroCreditShutdownPolicy;

        /**
         * <p>The status that manages the purchase actions of the customer. Valid values:</p>
         * <ul>
         * <li>ban: New purchases are prohibited.</li>
         * <li>cancelBan: Normal status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ban</p>
         */
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

        public GetCreditInfoResponseBodyData setPAYGFreezeStatus(String PAYGFreezeStatus) {
            this.PAYGFreezeStatus = PAYGFreezeStatus;
            return this;
        }
        public String getPAYGFreezeStatus() {
            return this.PAYGFreezeStatus;
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
