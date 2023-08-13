// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPartitionsHeatmapRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The time range to be queried. Valid values:</p>
     * <br>
     * <p>*   **LAST_ONE_HOURS**: the last hour.</p>
     * <p>*   **LAST_SIX_HOURS**: the last six hours.</p>
     * <p>*   **LAST_ONE_DAYS**: the last day.</p>
     * <p>*   **LAST_THREE_DAYS**: the last three days.</p>
     * <p>*   **LAST_SEVEN_DAYS**: the last seven days.</p>
     */
    @NameInMap("TimeRange")
    public String timeRange;

    /**
     * <p>The type of the data to be queried. Valid values:</p>
     * <br>
     * <p>*   **READ_ROWS**: the read rows.</p>
     * <p>*   **WRITTEN_ROWS**: the written rows.</p>
     * <p>*   **READ_WRITTEN_ROWS**: the read and written rows.</p>
     * <p>*   **UPDATE_ROWS**: the updated rows.</p>
     * <p>*   **INSERTED_ROWS**: the inserted rows.</p>
     * <p>*   **DELETED_ROWS**: the deleted rows.</p>
     * <p>*   **READ_ROWS_WITH_DN**: the read rows returned from a data node.</p>
     * <p>*   **WRITTEN_ROWS_WITH_DN**: the written rows returned from a data node.</p>
     * <p>*   **READ_WRITTEN_ROWS_WITH_DN**: the read and written rows returned from a data node.</p>
     */
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
