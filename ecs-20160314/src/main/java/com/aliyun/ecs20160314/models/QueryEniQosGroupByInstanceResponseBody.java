// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class QueryEniQosGroupByInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public Data data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryEniQosGroupByInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEniQosGroupByInstanceResponseBody self = new QueryEniQosGroupByInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEniQosGroupByInstanceResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public QueryEniQosGroupByInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Data extends TeaModel {
        @NameInMap("EniQosGroups")
        public java.util.List<String> eniQosGroups;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setEniQosGroups(java.util.List<String> eniQosGroups) {
            this.eniQosGroups = eniQosGroups;
            return this;
        }
        public java.util.List<String> getEniQosGroups() {
            return this.eniQosGroups;
        }

    }

}
