// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ObservationChartsDTO extends TeaModel {
    @NameInMap("callVolume")
    public java.util.List<TimeSeriesPointDTO> callVolume;

    @NameInMap("concurrency")
    public java.util.List<TimeSeriesPointDTO> concurrency;

    @NameInMap("qpm")
    public java.util.List<TimeSeriesPointDTO> qpm;

    @NameInMap("responseTime")
    public java.util.List<TimeSeriesPointDTO> responseTime;

    @NameInMap("successRate")
    public java.util.List<TimeSeriesPointDTO> successRate;

    @NameInMap("tpm")
    public java.util.List<TimeSeriesPointDTO> tpm;

    public static ObservationChartsDTO build(java.util.Map<String, ?> map) throws Exception {
        ObservationChartsDTO self = new ObservationChartsDTO();
        return TeaModel.build(map, self);
    }

    public ObservationChartsDTO setCallVolume(java.util.List<TimeSeriesPointDTO> callVolume) {
        this.callVolume = callVolume;
        return this;
    }
    public java.util.List<TimeSeriesPointDTO> getCallVolume() {
        return this.callVolume;
    }

    public ObservationChartsDTO setConcurrency(java.util.List<TimeSeriesPointDTO> concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public java.util.List<TimeSeriesPointDTO> getConcurrency() {
        return this.concurrency;
    }

    public ObservationChartsDTO setQpm(java.util.List<TimeSeriesPointDTO> qpm) {
        this.qpm = qpm;
        return this;
    }
    public java.util.List<TimeSeriesPointDTO> getQpm() {
        return this.qpm;
    }

    public ObservationChartsDTO setResponseTime(java.util.List<TimeSeriesPointDTO> responseTime) {
        this.responseTime = responseTime;
        return this;
    }
    public java.util.List<TimeSeriesPointDTO> getResponseTime() {
        return this.responseTime;
    }

    public ObservationChartsDTO setSuccessRate(java.util.List<TimeSeriesPointDTO> successRate) {
        this.successRate = successRate;
        return this;
    }
    public java.util.List<TimeSeriesPointDTO> getSuccessRate() {
        return this.successRate;
    }

    public ObservationChartsDTO setTpm(java.util.List<TimeSeriesPointDTO> tpm) {
        this.tpm = tpm;
        return this;
    }
    public java.util.List<TimeSeriesPointDTO> getTpm() {
        return this.tpm;
    }

}
