// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TradePrice")
    @Validation(required = true)
    public Double tradePrice;

    @NameInMap("InstanceIdSets")
    @Validation(required = true)
    public RunInstancesResponseInstanceIdSets instanceIdSets;

    public static RunInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesResponse self = new RunInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class RunInstancesResponseInstanceIdSets extends TeaModel {
        @NameInMap("InstanceIdSet")
        @Validation(required = true)
        public java.util.List<String> instanceIdSet;

        public static RunInstancesResponseInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesResponseInstanceIdSets self = new RunInstancesResponseInstanceIdSets();
            return TeaModel.build(map, self);
        }

    }

}
