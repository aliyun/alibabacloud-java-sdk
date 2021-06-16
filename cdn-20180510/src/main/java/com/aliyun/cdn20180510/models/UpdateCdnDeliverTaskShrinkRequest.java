// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnDeliverTaskShrinkRequest extends TeaModel {
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

    public static UpdateCdnDeliverTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnDeliverTaskShrinkRequest self = new UpdateCdnDeliverTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCdnDeliverTaskShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCdnDeliverTaskShrinkRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public UpdateCdnDeliverTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCdnDeliverTaskShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateCdnDeliverTaskShrinkRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public UpdateCdnDeliverTaskShrinkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateCdnDeliverTaskShrinkRequest setDeliverShrink(String deliverShrink) {
        this.deliverShrink = deliverShrink;
        return this;
    }
    public String getDeliverShrink() {
        return this.deliverShrink;
    }

    public UpdateCdnDeliverTaskShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

}
