// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnDeliverTaskShrinkRequest extends TeaModel {
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

    public static CreateCdnDeliverTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnDeliverTaskShrinkRequest self = new CreateCdnDeliverTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdnDeliverTaskShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCdnDeliverTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCdnDeliverTaskShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateCdnDeliverTaskShrinkRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public CreateCdnDeliverTaskShrinkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCdnDeliverTaskShrinkRequest setDeliverShrink(String deliverShrink) {
        this.deliverShrink = deliverShrink;
        return this;
    }
    public String getDeliverShrink() {
        return this.deliverShrink;
    }

    public CreateCdnDeliverTaskShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

}
