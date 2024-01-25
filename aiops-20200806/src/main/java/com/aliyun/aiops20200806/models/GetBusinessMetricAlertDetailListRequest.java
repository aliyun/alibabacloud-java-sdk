// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricAlertDetailListRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetBusinessMetricAlertDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricAlertDetailListRequest self = new GetBusinessMetricAlertDetailListRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricAlertDetailListRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetBusinessMetricAlertDetailListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetBusinessMetricAlertDetailListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetBusinessMetricAlertDetailListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
