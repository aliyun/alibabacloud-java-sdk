// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeTagRequest extends TeaModel {
    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SqlId")
    public String sqlId;

    public static GetQueryOptimizeTagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeTagRequest self = new GetQueryOptimizeTagRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeTagRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQueryOptimizeTagRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

}
