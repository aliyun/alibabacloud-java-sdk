// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructRefreshJobModel extends TeaModel {
    /**
     * <p>The end time of the refresh task.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-15 10:12:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The materialized view name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_mv</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2025103010xxxxxxx</p>
     */
    @NameInMap("Processid")
    public String processid;

    /**
     * <p>The refresh interval.</p>
     * 
     * <strong>example:</strong>
     * <p>30s</p>
     */
    @NameInMap("RefreshInterval")
    public String refreshInterval;

    /**
     * <p>The refresh model.</p>
     * <ul>
     * <li>FAST</li>
     * <li>COMPLETE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FAST</p>
     */
    @NameInMap("RefreshModel")
    public String refreshModel;

    /**
     * <p>The resource group used for the refresh.</p>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The scheduled start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-15 10:11:00</p>
     */
    @NameInMap("ScheduledStartTime")
    public String scheduledStartTime;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The actual start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-15 10:11:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the queried refresh task.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    public static OpenStructRefreshJobModel build(java.util.Map<String, ?> map) throws Exception {
        OpenStructRefreshJobModel self = new OpenStructRefreshJobModel();
        return TeaModel.build(map, self);
    }

    public OpenStructRefreshJobModel setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public OpenStructRefreshJobModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenStructRefreshJobModel setProcessid(String processid) {
        this.processid = processid;
        return this;
    }
    public String getProcessid() {
        return this.processid;
    }

    public OpenStructRefreshJobModel setRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
        return this;
    }
    public String getRefreshInterval() {
        return this.refreshInterval;
    }

    public OpenStructRefreshJobModel setRefreshModel(String refreshModel) {
        this.refreshModel = refreshModel;
        return this;
    }
    public String getRefreshModel() {
        return this.refreshModel;
    }

    public OpenStructRefreshJobModel setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public OpenStructRefreshJobModel setScheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }
    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    public OpenStructRefreshJobModel setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public OpenStructRefreshJobModel setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public OpenStructRefreshJobModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
