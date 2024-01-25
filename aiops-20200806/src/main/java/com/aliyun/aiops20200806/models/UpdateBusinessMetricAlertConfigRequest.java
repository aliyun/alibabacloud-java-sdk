// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateBusinessMetricAlertConfigRequest extends TeaModel {
    @NameInMap("AlertConfigId")
    public Long alertConfigId;

    @NameInMap("Configs")
    public String configs;

    @NameInMap("MetricId")
    public Long metricId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdateBusinessMetricAlertConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessMetricAlertConfigRequest self = new UpdateBusinessMetricAlertConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessMetricAlertConfigRequest setAlertConfigId(Long alertConfigId) {
        this.alertConfigId = alertConfigId;
        return this;
    }
    public Long getAlertConfigId() {
        return this.alertConfigId;
    }

    public UpdateBusinessMetricAlertConfigRequest setConfigs(String configs) {
        this.configs = configs;
        return this;
    }
    public String getConfigs() {
        return this.configs;
    }

    public UpdateBusinessMetricAlertConfigRequest setMetricId(Long metricId) {
        this.metricId = metricId;
        return this;
    }
    public Long getMetricId() {
        return this.metricId;
    }

    public UpdateBusinessMetricAlertConfigRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
