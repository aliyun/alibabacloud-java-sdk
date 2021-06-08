// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDeliverTaskShrinkRequest extends TeaModel {
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
    public String deliverShrink;

    @NameInMap("Schedule")
    public String scheduleShrink;

    public static CreateDcdnDeliverTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnDeliverTaskShrinkRequest self = new CreateDcdnDeliverTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnDeliverTaskShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDcdnDeliverTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDcdnDeliverTaskShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateDcdnDeliverTaskShrinkRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public CreateDcdnDeliverTaskShrinkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDcdnDeliverTaskShrinkRequest setDeliverShrink(String deliverShrink) {
        this.deliverShrink = deliverShrink;
        return this;
    }
    public String getDeliverShrink() {
        return this.deliverShrink;
    }

    public CreateDcdnDeliverTaskShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

}
