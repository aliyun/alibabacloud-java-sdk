// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnDeliverTaskRequest extends TeaModel {
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

    public static UpdateDcdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnDeliverTaskRequest self = new UpdateDcdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnDeliverTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateDcdnDeliverTaskRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public UpdateDcdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDcdnDeliverTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateDcdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public UpdateDcdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDcdnDeliverTaskRequest setDeliver(java.util.Map<String, ?> deliver) {
        this.deliver = deliver;
        return this;
    }
    public java.util.Map<String, ?> getDeliver() {
        return this.deliver;
    }

    public UpdateDcdnDeliverTaskRequest setSchedule(java.util.Map<String, ?> schedule) {
        this.schedule = schedule;
        return this;
    }
    public java.util.Map<String, ?> getSchedule() {
        return this.schedule;
    }

}
