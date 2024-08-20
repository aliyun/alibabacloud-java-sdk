// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnDeliverTaskRequest extends TeaModel {
    /**
     * <p>The method that is used to send operations reports. Operations reports are sent to you only by email. The settings need to be escaped in JSON.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;email&quot;:{&quot;subject&quot;:&quot;the email subject&quot;,&quot;to&quot;:[&quot;<a href="mailto:username@example.com">username@example.com</a>&quot;,&quot;<a href="mailto:username@example.com">username@example.com</a>&quot;]}}</p>
     */
    @NameInMap("Deliver")
    public String deliver;

    /**
     * <p>The ID of the tracking task that you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("DeliverId")
    public Long deliverId;

    /**
     * <p>The domain names from which the tracking task collects data. Separate domain names with commas (,). If you do not specify a domain name, the task collects data from all domain names that belong to your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>Domain name report</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operations reports that are tracked by the task. The data needs to be escaped in JSON.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\\&quot;reportId\\&quot;:2,\\&quot;conditions\\&quot;:[{\\&quot;field\\&quot;:\\&quot;prov\\&quot;,\\&quot;op\\&quot;:\\&quot;in\\&quot;,\\&quot;value\\&quot;:[\\&quot;Heilongjiang\\&quot;,\\&quot;Beijing\\&quot;]}]}]</p>
     */
    @NameInMap("Reports")
    public String reports;

    /**
     * <p>The parameters that specify the time interval at which the tracking task sends operations reports. The settings need to be escaped in JSON.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;schedName&quot;:&quot;the name of the tracking task&quot;,&quot;description&quot;:&quot;the description&quot;,&quot;crontab&quot;:&quot;000\<em>\</em>?&quot;,&quot;frequency&quot;:&quot;d&quot;,&quot;status&quot;:&quot;enable&quot;,&quot;effectiveFrom&quot;:&quot;2020-09-17T00:00:00Z&quot;,&quot;effectiveEnd&quot;:&quot;2020-11-17T00:00:00Z&quot;}</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    public static UpdateDcdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnDeliverTaskRequest self = new UpdateDcdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnDeliverTaskRequest setDeliver(String deliver) {
        this.deliver = deliver;
        return this;
    }
    public String getDeliver() {
        return this.deliver;
    }

    public UpdateDcdnDeliverTaskRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public UpdateDcdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDcdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDcdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public UpdateDcdnDeliverTaskRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

}
