// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnDeliverTaskShrinkRequest extends TeaModel {
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
    public String deliverShrink;

    @NameInMap("Schedule")
    public String scheduleShrink;

    public static UpdateDcdnDeliverTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnDeliverTaskShrinkRequest self = new UpdateDcdnDeliverTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnDeliverTaskShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateDcdnDeliverTaskShrinkRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public UpdateDcdnDeliverTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDcdnDeliverTaskShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateDcdnDeliverTaskShrinkRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public UpdateDcdnDeliverTaskShrinkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDcdnDeliverTaskShrinkRequest setDeliverShrink(String deliverShrink) {
        this.deliverShrink = deliverShrink;
        return this;
    }
    public String getDeliverShrink() {
        return this.deliverShrink;
    }

    public UpdateDcdnDeliverTaskShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

}
