// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDeliverTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

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

    public static CreateDcdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnDeliverTaskRequest self = new CreateDcdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnDeliverTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDcdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDcdnDeliverTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateDcdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public CreateDcdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDcdnDeliverTaskRequest setDeliver(java.util.Map<String, ?> deliver) {
        this.deliver = deliver;
        return this;
    }
    public java.util.Map<String, ?> getDeliver() {
        return this.deliver;
    }

    public CreateDcdnDeliverTaskRequest setSchedule(java.util.Map<String, ?> schedule) {
        this.schedule = schedule;
        return this;
    }
    public java.util.Map<String, ?> getSchedule() {
        return this.schedule;
    }

}
