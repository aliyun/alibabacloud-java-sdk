// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryMonitorRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The timestamp when the monitoring ends.
    @NameInMap("EndTime")
    public Long endTime;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The metric type. The following metrics are supported:
    // 
    // \[Basic system metrics]
    // 
    // *   cpuUsage
    // *   memoryUsage
    // *   diskUsage
    // *   gcCount
    // *   gcTime
    // 
    // \[Nacos registry]
    // 
    // *   serviceCount
    // *   writeCostTime
    // *   readCostTime
    // *   regCenterTps
    // *   regCenterQps
    // 
    // \[Nacos configuration center]
    // 
    // *   publish
    // *   getConfig
    // 
    // \[Zookeeper]
    // 
    // *   zk_TpsCount
    // *   zk_QpsCount
    // *   zookeeper_AvgRequestLatency
    @NameInMap("MonitorType")
    public String monitorType;

    // The extended request parameters in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    // The timestamp when the monitoring starts.
    @NameInMap("StartTime")
    public Long startTime;

    // The interval between data points. Unit: seconds.
    @NameInMap("Step")
    public Long step;

    public static QueryMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorRequest self = new QueryMonitorRequest();
        return TeaModel.build(map, self);
    }

    public QueryMonitorRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryMonitorRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMonitorRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMonitorRequest setMonitorType(String monitorType) {
        this.monitorType = monitorType;
        return this;
    }
    public String getMonitorType() {
        return this.monitorType;
    }

    public QueryMonitorRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public QueryMonitorRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryMonitorRequest setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

}
