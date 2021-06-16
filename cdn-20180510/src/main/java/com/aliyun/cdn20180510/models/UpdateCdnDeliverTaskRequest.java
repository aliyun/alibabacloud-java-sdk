// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnDeliverTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DeliverId")
    public Long deliverId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Status")
    public String status;

    @NameInMap("Reports")
    public String reports;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Deliver")
    public java.util.Map<String, ?> deliver;

    @NameInMap("Schedule")
    public java.util.Map<String, ?> schedule;

    public static UpdateCdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnDeliverTaskRequest self = new UpdateCdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCdnDeliverTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCdnDeliverTaskRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public UpdateCdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCdnDeliverTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateCdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public UpdateCdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateCdnDeliverTaskRequest setDeliver(java.util.Map<String, ?> deliver) {
        this.deliver = deliver;
        return this;
    }
    public java.util.Map<String, ?> getDeliver() {
        return this.deliver;
    }

    public UpdateCdnDeliverTaskRequest setSchedule(java.util.Map<String, ?> schedule) {
        this.schedule = schedule;
        return this;
    }
    public java.util.Map<String, ?> getSchedule() {
        return this.schedule;
    }

}
