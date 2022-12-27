// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnDeliverTaskRequest extends TeaModel {
    // The method that is used to send operations reports. Operations reports are sent to you only by email. The settings must be escaped in JSON.
    @NameInMap("Deliver")
    public String deliver;

    // The ID of the tracking task that you want to update.
    @NameInMap("DeliverId")
    public Long deliverId;

    // The domain name that you want to track. You can specify multiple domain names and separate them with commas (,). You can specify at most 500 domain names in each call.
    // 
    // If you do not specify a domain name, the task collects data from all domain names that belong to your Alibaba Cloud account.
    @NameInMap("DomainName")
    public String domainName;

    // The name of the tracking task.
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The operations reports that are tracked by the task. The data must be escaped in JSON.
    @NameInMap("Reports")
    public String reports;

    // The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.
    @NameInMap("Schedule")
    public String schedule;

    public static UpdateCdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnDeliverTaskRequest self = new UpdateCdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCdnDeliverTaskRequest setDeliver(String deliver) {
        this.deliver = deliver;
        return this;
    }
    public String getDeliver() {
        return this.deliver;
    }

    public UpdateCdnDeliverTaskRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public UpdateCdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateCdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCdnDeliverTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public UpdateCdnDeliverTaskRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

}
