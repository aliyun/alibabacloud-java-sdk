// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class BatchUpdateSystemRunningPlanRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("controlType")
    public Integer controlType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("dateType")
    public Integer dateType;

    /**
     * <strong>example:</strong>
     * <p>05:00:00</p>
     */
    @NameInMap("earliestStartupTime")
    public String earliestStartupTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-30</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("factoryId")
    public String factoryId;

    /**
     * <strong>example:</strong>
     * <p>05:30:00</p>
     */
    @NameInMap("latestShutdownTime")
    public String latestShutdownTime;

    /**
     * <strong>example:</strong>
     * <p>37.1</p>
     */
    @NameInMap("maxCarbonDioxide")
    public Double maxCarbonDioxide;

    /**
     * <strong>example:</strong>
     * <p>25.3</p>
     */
    @NameInMap("maxTem")
    public Double maxTem;

    /**
     * <strong>example:</strong>
     * <p>20.1</p>
     */
    @NameInMap("minTem")
    public Double minTem;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("seasonMode")
    public Integer seasonMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-21</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>system1</p>
     */
    @NameInMap("systemId")
    public String systemId;

    /**
     * <strong>example:</strong>
     * <p>05:30:00</p>
     */
    @NameInMap("workingEndTime")
    public String workingEndTime;

    /**
     * <strong>example:</strong>
     * <p>05:00:00</p>
     */
    @NameInMap("workingStartTime")
    public String workingStartTime;

    public static BatchUpdateSystemRunningPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateSystemRunningPlanRequest self = new BatchUpdateSystemRunningPlanRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateSystemRunningPlanRequest setControlType(Integer controlType) {
        this.controlType = controlType;
        return this;
    }
    public Integer getControlType() {
        return this.controlType;
    }

    public BatchUpdateSystemRunningPlanRequest setDateType(Integer dateType) {
        this.dateType = dateType;
        return this;
    }
    public Integer getDateType() {
        return this.dateType;
    }

    public BatchUpdateSystemRunningPlanRequest setEarliestStartupTime(String earliestStartupTime) {
        this.earliestStartupTime = earliestStartupTime;
        return this;
    }
    public String getEarliestStartupTime() {
        return this.earliestStartupTime;
    }

    public BatchUpdateSystemRunningPlanRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public BatchUpdateSystemRunningPlanRequest setFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }
    public String getFactoryId() {
        return this.factoryId;
    }

    public BatchUpdateSystemRunningPlanRequest setLatestShutdownTime(String latestShutdownTime) {
        this.latestShutdownTime = latestShutdownTime;
        return this;
    }
    public String getLatestShutdownTime() {
        return this.latestShutdownTime;
    }

    public BatchUpdateSystemRunningPlanRequest setMaxCarbonDioxide(Double maxCarbonDioxide) {
        this.maxCarbonDioxide = maxCarbonDioxide;
        return this;
    }
    public Double getMaxCarbonDioxide() {
        return this.maxCarbonDioxide;
    }

    public BatchUpdateSystemRunningPlanRequest setMaxTem(Double maxTem) {
        this.maxTem = maxTem;
        return this;
    }
    public Double getMaxTem() {
        return this.maxTem;
    }

    public BatchUpdateSystemRunningPlanRequest setMinTem(Double minTem) {
        this.minTem = minTem;
        return this;
    }
    public Double getMinTem() {
        return this.minTem;
    }

    public BatchUpdateSystemRunningPlanRequest setSeasonMode(Integer seasonMode) {
        this.seasonMode = seasonMode;
        return this;
    }
    public Integer getSeasonMode() {
        return this.seasonMode;
    }

    public BatchUpdateSystemRunningPlanRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public BatchUpdateSystemRunningPlanRequest setSystemId(String systemId) {
        this.systemId = systemId;
        return this;
    }
    public String getSystemId() {
        return this.systemId;
    }

    public BatchUpdateSystemRunningPlanRequest setWorkingEndTime(String workingEndTime) {
        this.workingEndTime = workingEndTime;
        return this;
    }
    public String getWorkingEndTime() {
        return this.workingEndTime;
    }

    public BatchUpdateSystemRunningPlanRequest setWorkingStartTime(String workingStartTime) {
        this.workingStartTime = workingStartTime;
        return this;
    }
    public String getWorkingStartTime() {
        return this.workingStartTime;
    }

}
