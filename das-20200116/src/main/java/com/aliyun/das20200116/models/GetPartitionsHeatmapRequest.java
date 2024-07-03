// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPartitionsHeatmapRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzrciqy62c****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The time range to be queried. Valid values:</p>
     * <ul>
     * <li><strong>LAST_ONE_HOURS</strong>: the last hour.</li>
     * <li><strong>LAST_SIX_HOURS</strong>: the last six hours.</li>
     * <li><strong>LAST_ONE_DAYS</strong>: the last day.</li>
     * <li><strong>LAST_THREE_DAYS</strong>: the last three days.</li>
     * <li><strong>LAST_SEVEN_DAYS</strong>: the last seven days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LAST_SIX_HOURS</p>
     */
    @NameInMap("TimeRange")
    public String timeRange;

    /**
     * <p>The type of the data to be queried. Valid values:</p>
     * <ul>
     * <li><strong>READ_ROWS</strong>: the read rows.</li>
     * <li><strong>WRITTEN_ROWS</strong>: the written rows.</li>
     * <li><strong>READ_WRITTEN_ROWS</strong>: the read and written rows.</li>
     * <li><strong>UPDATE_ROWS</strong>: the updated rows.</li>
     * <li><strong>INSERTED_ROWS</strong>: the inserted rows.</li>
     * <li><strong>DELETED_ROWS</strong>: the deleted rows.</li>
     * <li><strong>READ_ROWS_WITH_DN</strong>: the read rows returned from a data node.</li>
     * <li><strong>WRITTEN_ROWS_WITH_DN</strong>: the written rows returned from a data node.</li>
     * <li><strong>READ_WRITTEN_ROWS_WITH_DN</strong>: the read and written rows returned from a data node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WRITTEN_ROWS_WITH_DN</p>
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
