// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryMonitorRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The timestamp when the monitoring ends.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metric type. The following metric types are supported:</p>
     * <br>
     * <p>[Basic system metrics]</p>
     * <br>
     * <p>*   cpuUsage</p>
     * <p>*   memoryUsage</p>
     * <p>*   diskUsage</p>
     * <p>*   gcCount</p>
     * <p>*   gcTime</p>
     * <br>
     * <p>[Nacos registry]</p>
     * <br>
     * <p>*   serviceCount</p>
     * <p>*   writeCostTime</p>
     * <p>*   readCostTime</p>
     * <p>*   TPS regCenterTps</p>
     * <p>*   QPS regCenterQps</p>
     * <br>
     * <p>[Nacos configuration center]</p>
     * <br>
     * <p>*   publish</p>
     * <p>*   getConfig</p>
     * <br>
     * <p>[zookeeper]</p>
     * <br>
     * <p>*   TPS zk_TpsCount</p>
     * <p>*   QPS zk_QpsCount</p>
     * <p>*   zookeeper_AvgRequestLatency</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MonitorType")
    public String monitorType;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The timestamp when the monitoring starts.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The interval between data points. Unit: seconds.</p>
     */
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
