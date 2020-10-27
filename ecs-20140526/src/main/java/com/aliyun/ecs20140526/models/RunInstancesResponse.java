// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TradePrice")
    @Validation(required = true)
    public Float tradePrice;

    @NameInMap("InstanceIdSets")
    @Validation(required = true)
    public RunInstancesResponseInstanceIdSets instanceIdSets;

    public static RunInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesResponse self = new RunInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RunInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunInstancesResponse setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public RunInstancesResponse setInstanceIdSets(RunInstancesResponseInstanceIdSets instanceIdSets) {
        this.instanceIdSets = instanceIdSets;
        return this;
    }
    public RunInstancesResponseInstanceIdSets getInstanceIdSets() {
        return this.instanceIdSets;
    }

    public static class RunInstancesResponseInstanceIdSets extends TeaModel {
        @NameInMap("InstanceIdSet")
        @Validation(required = true)
        public java.util.List<String> instanceIdSet;

        public static RunInstancesResponseInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesResponseInstanceIdSets self = new RunInstancesResponseInstanceIdSets();
            return TeaModel.build(map, self);
        }

        public RunInstancesResponseInstanceIdSets setInstanceIdSet(java.util.List<String> instanceIdSet) {
            this.instanceIdSet = instanceIdSet;
            return this;
        }
        public java.util.List<String> getInstanceIdSet() {
            return this.instanceIdSet;
        }

    }

}
