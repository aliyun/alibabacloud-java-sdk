// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class ListDayAmountResponseBody extends TeaModel {
    @NameInMap("DayAmounts")
    public java.util.List<ListDayAmountResponseBodyDayAmounts> dayAmounts;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDayAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDayAmountResponseBody self = new ListDayAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDayAmountResponseBody setDayAmounts(java.util.List<ListDayAmountResponseBodyDayAmounts> dayAmounts) {
        this.dayAmounts = dayAmounts;
        return this;
    }
    public java.util.List<ListDayAmountResponseBodyDayAmounts> getDayAmounts() {
        return this.dayAmounts;
    }

    public ListDayAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDayAmountResponseBodyDayAmounts extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("Date")
        public String date;

        public static ListDayAmountResponseBodyDayAmounts build(java.util.Map<String, ?> map) throws Exception {
            ListDayAmountResponseBodyDayAmounts self = new ListDayAmountResponseBodyDayAmounts();
            return TeaModel.build(map, self);
        }

        public ListDayAmountResponseBodyDayAmounts setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListDayAmountResponseBodyDayAmounts setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

}
