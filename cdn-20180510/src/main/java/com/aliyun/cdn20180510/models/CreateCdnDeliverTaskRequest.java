// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnDeliverTaskRequest extends TeaModel {
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

    public static CreateCdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnDeliverTaskRequest self = new CreateCdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdnDeliverTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCdnDeliverTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateCdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public CreateCdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCdnDeliverTaskRequest setDeliver(java.util.Map<String, ?> deliver) {
        this.deliver = deliver;
        return this;
    }
    public java.util.Map<String, ?> getDeliver() {
        return this.deliver;
    }

    public CreateCdnDeliverTaskRequest setSchedule(java.util.Map<String, ?> schedule) {
        this.schedule = schedule;
        return this;
    }
    public java.util.Map<String, ?> getSchedule() {
        return this.schedule;
    }

}
