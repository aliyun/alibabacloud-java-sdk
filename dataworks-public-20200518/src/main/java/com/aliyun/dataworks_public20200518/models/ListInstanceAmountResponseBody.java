// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceAmountResponseBody extends TeaModel {
    @NameInMap("InstanceCounts")
    public java.util.List<ListInstanceAmountResponseBodyInstanceCounts> instanceCounts;

    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAmountResponseBody self = new ListInstanceAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceAmountResponseBody setInstanceCounts(java.util.List<ListInstanceAmountResponseBodyInstanceCounts> instanceCounts) {
        this.instanceCounts = instanceCounts;
        return this;
    }
    public java.util.List<ListInstanceAmountResponseBodyInstanceCounts> getInstanceCounts() {
        return this.instanceCounts;
    }

    public ListInstanceAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceAmountResponseBodyInstanceCounts extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Date")
        public Long date;

        public static ListInstanceAmountResponseBodyInstanceCounts build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAmountResponseBodyInstanceCounts self = new ListInstanceAmountResponseBodyInstanceCounts();
            return TeaModel.build(map, self);
        }

        public ListInstanceAmountResponseBodyInstanceCounts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListInstanceAmountResponseBodyInstanceCounts setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

    }

}
