// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCreditInfoResponseBody extends TeaModel {
    /**
     * <p>Result Code:</p>
     * <ul>
     * <li>200 OK</li>
     * <li>1109 System Error</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetCreditInfoResponseBodyData data;

    /**
     * <p>Message Information</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, Alibaba Cloud will track errors with this.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
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
         * <p>The Credit Control status, Value Range:</br></p>
         * <ol>
         * <li>normal - Sub Account status is running as usual.</li>
         * <li>arrearsNotShutdown - Sub Account status is running as usual, but have outstanding bill(s).</li>
         * <li>shutdown -  Sub Account status is down.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>Percentage value, when the available credit limit is lower than this credit limit percentage, a notification E-mail will be sent to the main account.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AlarmThreshold")
        public String alarmThreshold;

        /**
         * <p>The Credit available to consume.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("AvailableCredit")
        public String availableCredit;

        /**
         * <p>Obtain total unpaid amount on demo bill before simulated deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("ConsumedUndeductedValue")
        public String consumedUndeductedValue;

        /**
         * <p>The Credit Line of Sub Account</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreditLine")
        public String creditLine;

        /**
         * <p>The Credit have been consumed by Sub Account, and haven\&quot;t be paid.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OutstandingBalance")
        public String outstandingBalance;

        @NameInMap("PAYGFreezeStatus")
        public String PAYGFreezeStatus;

        /**
         * <p>The systematic controlling policy for resource management, specifically when the available Credit of Sub Account falls to 0 or less.</br></p>
         * <ul>
         * <li>1: delayStop. The account have Shutdown-delay Privilege,  After Shutdown-delay Credit is ran out, Alibaba Cloud will take over resources and keep the instance for 15 days. In addition, the instance will be released if Sub Account failed to pay the bill within these 15 days.</br></li>
         * <li>2: noStop. Partner will manually manage Shutdown Status for Sub Account. Meanwhile, System would not manage the resource\&quot;s life-circle of Sub Account.</br></li>
         * <li>3: immediatelyStop. Once valid quota of Sub Account falls below 0 and be identified as defaulting account, it will trigger the instance shutdown immediately.</br></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delayStop</p>
         */
        @NameInMap("ZeroCreditShutdownPolicy")
        public String zeroCreditShutdownPolicy;

        /**
         * <p>Manage order operation.</p>
         * <ul>
         * <li>ban：Ban the new purchase action.</li>
         * <li>normal：The account could raise new purchase order as usual.</li>
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
