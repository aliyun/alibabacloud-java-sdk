// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnDeliverTaskRequest extends TeaModel {
    // The method that is used to send operations reports. Operations reports are sent to you only by email. The settings must be escaped in JSON.
    @NameInMap("Deliver")
    public String deliver;

    // The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex).  
    // 
    // >  If you do not specify a domain name, the custom operations reports are created for all domain names that belong to your Alibaba Cloud account.
    @NameInMap("DomainName")
    public String domainName;

    // The name of the tracking task.
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The operations reports that are tracked by the task. The data must be escaped in JSON.
    @NameInMap("Reports")
    public String reports;

    // The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.
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

    public CreateCdnDeliverTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
