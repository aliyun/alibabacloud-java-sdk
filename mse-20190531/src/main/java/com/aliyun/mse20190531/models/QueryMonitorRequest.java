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
     * <p>systemError</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("MonitorType")
    public String monitorType;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>system error</p>
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
