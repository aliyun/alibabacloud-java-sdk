// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDeliverTaskRequest extends TeaModel {
    /**
     * <p>The method that is used to send operations reports. Operations reports are sent to you only by email. The settings must be escaped in JSON.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;email&quot;:{&quot;subject&quot;:&quot;the email subject&quot;,&quot;to&quot;:[&quot;<a href="mailto:username@example.com">username@example.com</a>&quot;,&quot;<a href="mailto:username@example.org">username@example.org</a>&quot;]}}</p>
     */
    @NameInMap("Deliver")
    public String deliver;

    /**
     * <p>The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a>.</p>
     * <blockquote>
     * <p>If you do not specify a domain name, the tracking task is created for all domain names that belong to your Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.org</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the tracking task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Domain name report</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operations reports that are tracked by the task. The data must be escaped in JSON.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\\&quot;reportId\\&quot;:2,\\&quot;conditions\\&quot;:[{\\&quot;field\\&quot;:\\&quot;prov\\&quot;,\\&quot;op\\&quot;:\\&quot;in\\&quot;,\\&quot;value\\&quot;:[\\&quot;Heilongjiang\\&quot;,\\&quot;Beijing\\&quot;]}]}]</p>
     */
    @NameInMap("Reports")
    public String reports;

    /**
     * <p>The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;schedName&quot;:&quot;the name of the tracking task&quot;,&quot;description&quot;:&quot;the description&quot;,&quot;crontab&quot;:&quot;000\<em>\</em>?&quot;,&quot;frequency&quot;:&quot;d&quot;,&quot;status&quot;:&quot;enable&quot;,&quot;effectiveFrom&quot;:&quot;2020-09-17T00:00:00Z&quot;,&quot;effectiveEnd&quot;:&quot;2020-11-17T00:00:00Z&quot;}</p>
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
