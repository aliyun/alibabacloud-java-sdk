// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeAddressOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAddressOverviewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAddressOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressOverviewResponseBody self = new DescribeAddressOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddressOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAddressOverviewResponseBody setData(DescribeAddressOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAddressOverviewResponseBodyData getData() {
        return this.data;
    }

    public DescribeAddressOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAddressOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAddressOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAddressOverviewResponseBodyData extends TeaModel {
        @NameInMap("Balance")
        public Float balance;

        @NameInMap("FirstSeen")
        public Long firstSeen;

        @NameInMap("LastSeen")
        public Long lastSeen;

        @NameInMap("ReceivedTxsCount")
        public Integer receivedTxsCount;

        @NameInMap("SpentTxsCount")
        public Integer spentTxsCount;

        @NameInMap("TotalReceived")
        public Float totalReceived;

        @NameInMap("TotalSpent")
        public Float totalSpent;

        @NameInMap("TxsCount")
        public Long txsCount;

        public static DescribeAddressOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressOverviewResponseBodyData self = new DescribeAddressOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAddressOverviewResponseBodyData setBalance(Float balance) {
            this.balance = balance;
            return this;
        }
        public Float getBalance() {
            return this.balance;
        }

        public DescribeAddressOverviewResponseBodyData setFirstSeen(Long firstSeen) {
            this.firstSeen = firstSeen;
            return this;
        }
        public Long getFirstSeen() {
            return this.firstSeen;
        }

        public DescribeAddressOverviewResponseBodyData setLastSeen(Long lastSeen) {
            this.lastSeen = lastSeen;
            return this;
        }
        public Long getLastSeen() {
            return this.lastSeen;
        }

        public DescribeAddressOverviewResponseBodyData setReceivedTxsCount(Integer receivedTxsCount) {
            this.receivedTxsCount = receivedTxsCount;
            return this;
        }
        public Integer getReceivedTxsCount() {
            return this.receivedTxsCount;
        }

        public DescribeAddressOverviewResponseBodyData setSpentTxsCount(Integer spentTxsCount) {
            this.spentTxsCount = spentTxsCount;
            return this;
        }
        public Integer getSpentTxsCount() {
            return this.spentTxsCount;
        }

        public DescribeAddressOverviewResponseBodyData setTotalReceived(Float totalReceived) {
            this.totalReceived = totalReceived;
            return this;
        }
        public Float getTotalReceived() {
            return this.totalReceived;
        }

        public DescribeAddressOverviewResponseBodyData setTotalSpent(Float totalSpent) {
            this.totalSpent = totalSpent;
            return this;
        }
        public Float getTotalSpent() {
            return this.totalSpent;
        }

        public DescribeAddressOverviewResponseBodyData setTxsCount(Long txsCount) {
            this.txsCount = txsCount;
            return this;
        }
        public Long getTxsCount() {
            return this.txsCount;
        }

    }

}
