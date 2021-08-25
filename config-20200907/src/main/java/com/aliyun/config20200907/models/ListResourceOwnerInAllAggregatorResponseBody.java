// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceOwnerInAllAggregatorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccountInAggregator")
    public java.util.List<ListResourceOwnerInAllAggregatorResponseBodyAccountInAggregator> accountInAggregator;

    public static ListResourceOwnerInAllAggregatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceOwnerInAllAggregatorResponseBody self = new ListResourceOwnerInAllAggregatorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceOwnerInAllAggregatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceOwnerInAllAggregatorResponseBody setAccountInAggregator(java.util.List<ListResourceOwnerInAllAggregatorResponseBodyAccountInAggregator> accountInAggregator) {
        this.accountInAggregator = accountInAggregator;
        return this;
    }
    public java.util.List<ListResourceOwnerInAllAggregatorResponseBodyAccountInAggregator> getAccountInAggregator() {
        return this.accountInAggregator;
    }

    public static class ListResourceOwnerInAllAggregatorResponseBodyAccountInAggregator extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AccountName")
        public String accountName;

        public static ListResourceOwnerInAllAggregatorResponseBodyAccountInAggregator build(java.util.Map<String, ?> map) throws Exception {
            ListResourceOwnerInAllAggregatorResponseBodyAccountInAggregator self = new ListResourceOwnerInAllAggregatorResponseBodyAccountInAggregator();
            return TeaModel.build(map, self);
        }

        public ListResourceOwnerInAllAggregatorResponseBodyAccountInAggregator setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListResourceOwnerInAllAggregatorResponseBodyAccountInAggregator setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
