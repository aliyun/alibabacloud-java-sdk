// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryMonitorRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The timestamp when the monitoring ends.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1666678376</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metric type. The following metric types are supported:</p>
     * <p>[Basic system metrics]</p>
     * <ul>
     * <li>cpuUsage</li>
     * <li>memoryUsage</li>
     * <li>diskUsage</li>
     * <li>gcCount</li>
     * <li>gcTime</li>
     * </ul>
     * <p>[Nacos registry]</p>
     * <ul>
     * <li>serviceCount</li>
     * <li>writeCostTime</li>
     * <li>readCostTime</li>
     * <li>TPS regCenterTps</li>
     * <li>QPS regCenterQps</li>
     * </ul>
     * <p>[Nacos configuration center]</p>
     * <ul>
     * <li>publish</li>
     * <li>getConfig</li>
     * </ul>
     * <p>[zookeeper]</p>
     * <ul>
     * <li>TPS zk_TpsCount</li>
     * <li>QPS zk_QpsCount</li>
     * <li>zookeeper_AvgRequestLatency</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>regCenterQps</p>
     */
    @NameInMap("MonitorType")
    public String monitorType;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The timestamp when the monitoring starts.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1666678376</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The interval between data points. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
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
