// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPartitionsHeatmapRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TimeRange")
    public String timeRange;

    @NameInMap("Type")
    public String type;

    public static GetPartitionsHeatmapRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionsHeatmapRequest self = new GetPartitionsHeatmapRequest();
        return TeaModel.build(map, self);
    }

    public GetPartitionsHeatmapRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetPartitionsHeatmapRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPartitionsHeatmapRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

    public GetPartitionsHeatmapRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
