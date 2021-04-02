// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceAmountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceCounts")
    @Validation(required = true)
    public java.util.List<ListInstanceAmountResponseInstanceCounts> instanceCounts;

    public static ListInstanceAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAmountResponse self = new ListInstanceAmountResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceAmountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceAmountResponse setInstanceCounts(java.util.List<ListInstanceAmountResponseInstanceCounts> instanceCounts) {
        this.instanceCounts = instanceCounts;
        return this;
    }
    public java.util.List<ListInstanceAmountResponseInstanceCounts> getInstanceCounts() {
        return this.instanceCounts;
    }

    public static class ListInstanceAmountResponseInstanceCounts extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public Long date;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static ListInstanceAmountResponseInstanceCounts build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceAmountResponseInstanceCounts self = new ListInstanceAmountResponseInstanceCounts();
            return TeaModel.build(map, self);
        }

        public ListInstanceAmountResponseInstanceCounts setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public ListInstanceAmountResponseInstanceCounts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
