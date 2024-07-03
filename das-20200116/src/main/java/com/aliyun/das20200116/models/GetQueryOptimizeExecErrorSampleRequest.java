// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorSampleRequest extends TeaModel {
    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PolarDBMySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The SQL template ID. You can call the <a href="https://help.aliyun.com/document_detail/405235.html">GetQueryOptimizeExecErrorStats</a> operation to obtain the SQL template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The date to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1642953600000</p>
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
