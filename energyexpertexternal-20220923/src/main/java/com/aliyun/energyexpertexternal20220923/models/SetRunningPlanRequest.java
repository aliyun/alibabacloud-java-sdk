// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SetRunningPlanRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>2024-07-21</p>
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
     * <p>2.1</p>
     */
    @NameInMap("maxCarbonDioxide")
    public Double maxCarbonDioxide;

    /**
     * <strong>example:</strong>
     * <p>3.1</p>
     */
    @NameInMap("maxTem")
    public Double maxTem;

    /**
     * <strong>example:</strong>
     * <p>2.1</p>
     */
    @NameInMap("minTem")
    public Double minTem;

    /**
     * <strong>example:</strong>
     * <p>ib</p>
     */
    @NameInMap("pKey")
    public String pKey;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("seasonMode")
    public Integer seasonMode;

    /**
     * <strong>example:</strong>
     * <p>2024-07-20</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>2024-07-31</p>
     */
    @NameInMap("statisticsTime")
    public String statisticsTime;

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

    public static SetRunningPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRunningPlanRequest self = new SetRunningPlanRequest();
        return TeaModel.build(map, self);
    }

    public SetRunningPlanRequest setControlType(Integer controlType) {
        this.controlType = controlType;
        return this;
    }
    public Integer getControlType() {
        return this.controlType;
    }

    public SetRunningPlanRequest setDateType(Integer dateType) {
        this.dateType = dateType;
        return this;
    }
    public Integer getDateType() {
        return this.dateType;
    }

    public SetRunningPlanRequest setEarliestStartupTime(String earliestStartupTime) {
        this.earliestStartupTime = earliestStartupTime;
        return this;
    }
    public String getEarliestStartupTime() {
        return this.earliestStartupTime;
    }

    public SetRunningPlanRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SetRunningPlanRequest setFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }
    public String getFactoryId() {
        return this.factoryId;
    }

    public SetRunningPlanRequest setLatestShutdownTime(String latestShutdownTime) {
        this.latestShutdownTime = latestShutdownTime;
        return this;
    }
    public String getLatestShutdownTime() {
        return this.latestShutdownTime;
    }

    public SetRunningPlanRequest setMaxCarbonDioxide(Double maxCarbonDioxide) {
        this.maxCarbonDioxide = maxCarbonDioxide;
        return this;
    }
    public Double getMaxCarbonDioxide() {
        return this.maxCarbonDioxide;
    }

    public SetRunningPlanRequest setMaxTem(Double maxTem) {
        this.maxTem = maxTem;
        return this;
    }
    public Double getMaxTem() {
        return this.maxTem;
    }

    public SetRunningPlanRequest setMinTem(Double minTem) {
        this.minTem = minTem;
        return this;
    }
    public Double getMinTem() {
        return this.minTem;
    }

    public SetRunningPlanRequest setPKey(String pKey) {
        this.pKey = pKey;
        return this;
    }
    public String getPKey() {
        return this.pKey;
    }

    public SetRunningPlanRequest setSeasonMode(Integer seasonMode) {
        this.seasonMode = seasonMode;
        return this;
    }
    public Integer getSeasonMode() {
        return this.seasonMode;
    }

    public SetRunningPlanRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SetRunningPlanRequest setStatisticsTime(String statisticsTime) {
        this.statisticsTime = statisticsTime;
        return this;
    }
    public String getStatisticsTime() {
        return this.statisticsTime;
    }

    public SetRunningPlanRequest setSystemId(String systemId) {
        this.systemId = systemId;
        return this;
    }
    public String getSystemId() {
        return this.systemId;
    }

    public SetRunningPlanRequest setWorkingEndTime(String workingEndTime) {
        this.workingEndTime = workingEndTime;
        return this;
    }
    public String getWorkingEndTime() {
        return this.workingEndTime;
    }

    public SetRunningPlanRequest setWorkingStartTime(String workingStartTime) {
        this.workingStartTime = workingStartTime;
        return this;
    }
    public String getWorkingStartTime() {
        return this.workingStartTime;
    }

}
