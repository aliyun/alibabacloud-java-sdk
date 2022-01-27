// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorSampleRequest extends TeaModel {
    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SqlId")
    public String sqlId;

    @NameInMap("Time")
    public String time;

    public static GetQueryOptimizeExecErrorSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeExecErrorSampleRequest self = new GetQueryOptimizeExecErrorSampleRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeExecErrorSampleRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeExecErrorSampleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQueryOptimizeExecErrorSampleRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetQueryOptimizeExecErrorSampleRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
