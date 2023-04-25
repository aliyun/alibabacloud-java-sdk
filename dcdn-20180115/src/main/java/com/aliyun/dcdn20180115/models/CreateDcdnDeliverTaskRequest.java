// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDeliverTaskRequest extends TeaModel {
    /**
     * <p>The method that is used to send operations reports. Operations reports are sent to you only by email. The settings must be escaped in JSON.</p>
     */
    @NameInMap("Deliver")
    public String deliver;

    /**
     * <p>The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex).</p>
     * <br>
     * <p>> If you do not specify a domain name, the tracking task is created for all domain names that belong to your Alibaba Cloud account.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the tracking task.</p>
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
