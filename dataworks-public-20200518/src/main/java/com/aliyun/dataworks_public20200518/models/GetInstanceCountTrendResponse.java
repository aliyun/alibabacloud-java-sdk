// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceCountTrendResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceCounts")
    @Validation(required = true)
    public java.util.List<GetInstanceCountTrendResponseInstanceCounts> instanceCounts;

    public static GetInstanceCountTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCountTrendResponse self = new GetInstanceCountTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceCountTrendResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceCountTrendResponse setInstanceCounts(java.util.List<GetInstanceCountTrendResponseInstanceCounts> instanceCounts) {
        this.instanceCounts = instanceCounts;
        return this;
    }
    public java.util.List<GetInstanceCountTrendResponseInstanceCounts> getInstanceCounts() {
        return this.instanceCounts;
    }

    public static class GetInstanceCountTrendResponseInstanceCounts extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public Long date;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static GetInstanceCountTrendResponseInstanceCounts build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceCountTrendResponseInstanceCounts self = new GetInstanceCountTrendResponseInstanceCounts();
            return TeaModel.build(map, self);
        }

        public GetInstanceCountTrendResponseInstanceCounts setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public GetInstanceCountTrendResponseInstanceCounts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
