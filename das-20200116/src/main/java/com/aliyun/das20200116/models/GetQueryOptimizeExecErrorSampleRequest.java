// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorSampleRequest extends TeaModel {
    /**
     * <p>The database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PolarDBMySQL**</p>
     * <p>*   **PostgreSQL**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The SQL template ID. You can call the [GetQueryOptimizeExecErrorStats](~~405235~~) operation to obtain the SQL template ID.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The date to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
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
