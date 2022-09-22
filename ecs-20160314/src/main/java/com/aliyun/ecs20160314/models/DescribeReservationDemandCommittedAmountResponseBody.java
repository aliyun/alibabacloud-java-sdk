// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservationDemandCommittedAmountResponseBody extends TeaModel {
    @NameInMap("CommittedAmountInfo")
    public CommittedAmountInfo committedAmountInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeReservationDemandCommittedAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservationDemandCommittedAmountResponseBody self = new DescribeReservationDemandCommittedAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservationDemandCommittedAmountResponseBody setCommittedAmountInfo(CommittedAmountInfo committedAmountInfo) {
        this.committedAmountInfo = committedAmountInfo;
        return this;
    }
    public CommittedAmountInfo getCommittedAmountInfo() {
        return this.committedAmountInfo;
    }

    public DescribeReservationDemandCommittedAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CommittedAmountInfo extends TeaModel {
        @NameInMap("CommittedAmount")
        public Float committedAmount;

        @NameInMap("Currency")
        public String currency;

        public static CommittedAmountInfo build(java.util.Map<String, ?> map) throws Exception {
            CommittedAmountInfo self = new CommittedAmountInfo();
            return TeaModel.build(map, self);
        }

        public CommittedAmountInfo setCommittedAmount(Float committedAmount) {
            this.committedAmount = committedAmount;
            return this;
        }
        public Float getCommittedAmount() {
            return this.committedAmount;
        }

        public CommittedAmountInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

    }

}
