// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnDeliverTaskRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Deliver")
    public String deliver;

    /**
     * <p>Domain Subscription</p>
     */
    @NameInMap("DeliverId")
    public Long deliverId;

    /**
     * <p>{"schedName":"subscription task name","description":"description","crontab":"000**?","frequency":"d","status":"enable","effectiveFrom": "2020-09-17T00:00:00Z","effectiveEnd":"2020-11-17T00:00:00Z"}</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the tracking task.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operations reports that are tracked by the task. The data must be escaped in JSON.</p>
     */
    @NameInMap("Reports")
    public String reports;

    /**
     * <p>The method that is used to send operations reports. Operations reports are sent to you only by email. The settings must be escaped in JSON.</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    public static UpdateDcdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnDeliverTaskRequest self = new UpdateDcdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnDeliverTaskRequest setDeliver(String deliver) {
        this.deliver = deliver;
        return this;
    }
    public String getDeliver() {
        return this.deliver;
    }

    public UpdateDcdnDeliverTaskRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public UpdateDcdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDcdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDcdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public UpdateDcdnDeliverTaskRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

}
