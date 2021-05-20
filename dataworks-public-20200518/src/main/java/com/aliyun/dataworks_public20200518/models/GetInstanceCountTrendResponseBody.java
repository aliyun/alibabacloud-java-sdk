// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceCountTrendResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceCounts")
    public java.util.List<GetInstanceCountTrendResponseBodyInstanceCounts> instanceCounts;

    public static GetInstanceCountTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCountTrendResponseBody self = new GetInstanceCountTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceCountTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceCountTrendResponseBody setInstanceCounts(java.util.List<GetInstanceCountTrendResponseBodyInstanceCounts> instanceCounts) {
        this.instanceCounts = instanceCounts;
        return this;
    }
    public java.util.List<GetInstanceCountTrendResponseBodyInstanceCounts> getInstanceCounts() {
        return this.instanceCounts;
    }

    public static class GetInstanceCountTrendResponseBodyInstanceCounts extends TeaModel {
        @NameInMap("Date")
        public Long date;

        @NameInMap("Count")
        public Integer count;

        public static GetInstanceCountTrendResponseBodyInstanceCounts build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceCountTrendResponseBodyInstanceCounts self = new GetInstanceCountTrendResponseBodyInstanceCounts();
            return TeaModel.build(map, self);
        }

        public GetInstanceCountTrendResponseBodyInstanceCounts setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public GetInstanceCountTrendResponseBodyInstanceCounts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
