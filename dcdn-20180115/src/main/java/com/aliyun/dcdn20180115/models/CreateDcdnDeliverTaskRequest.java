// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDeliverTaskRequest extends TeaModel {
    @NameInMap("Deliver")
    public String deliver;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Reports")
    public String reports;

    @NameInMap("Schedule")
    public String schedule;

    public static CreateDcdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnDeliverTaskRequest self = new CreateDcdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnDeliverTaskRequest setDeliver(String deliver) {
        this.deliver = deliver;
        return this;
    }
    public String getDeliver() {
        return this.deliver;
    }

    public CreateDcdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDcdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDcdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public CreateDcdnDeliverTaskRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

}
