// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnDeliverTaskRequest extends TeaModel {
    /**
     * <p>The ID of the tracking task.</p>
     */
    @NameInMap("Deliver")
    public String deliver;

    /**
     * <p>The method that is used to send operations reports. Operations reports are sent to you only by email. The settings must be escaped in JSON.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>> You can call this operation up to three times per second per account.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operations reports that are tracked by the task. The data must be escaped in JSON.</p>
     */
    @NameInMap("Reports")
    public String reports;

    /**
     * <p>The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    public static CreateCdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnDeliverTaskRequest self = new CreateCdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdnDeliverTaskRequest setDeliver(String deliver) {
        this.deliver = deliver;
        return this;
    }
    public String getDeliver() {
        return this.deliver;
    }

    public CreateCdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public CreateCdnDeliverTaskRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

}
