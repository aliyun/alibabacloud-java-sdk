// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceAmountResponseBody extends TeaModel {
    /**
     * <p>The trend of the number of auto triggered node instances within the specified period of time.</p>
     */
    @NameInMap("InstanceCounts")
    public java.util.List<ListInstanceAmountResponseBodyInstanceCounts> instanceCounts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95279527adhfj****</p>
     */
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
        /**
         * <p>The number of auto triggered node instances.</p>
         * 
         * <strong>example:</strong>
         * <p>9527</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The data timestamp at which the number of auto triggered node instances was obtained. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1623772800000</p>
         */
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
