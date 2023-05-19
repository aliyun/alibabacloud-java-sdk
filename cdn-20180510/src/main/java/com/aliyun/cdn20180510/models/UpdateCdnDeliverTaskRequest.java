// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnDeliverTaskRequest extends TeaModel {
    /**
     * <p>\[{\\"reportId\\":1,\\"conditions\\":\[{\\"field\\":\\"prov\\",\\"op\\":\\"in\\",\\"value\\":\[\\"Heilongjiang\\",\\"Beijing\\"]}]}]</p>
     */
    @NameInMap("Deliver")
    public String deliver;

    /**
     * <p>> You can call this operation up to three times per second per account.</p>
     */
    @NameInMap("DeliverId")
    public Long deliverId;

    /**
     * <p>The operations reports that are tracked by the task. The data must be escaped in JSON.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>**Fields in the ReDatas parameter**</p>
     * <br>
     * <p>|Field|Type|Required|Description|</p>
     * <p>|---|---|---|---|</p>
     * <p>|reportId|String|Yes|The ID of the report.|</p>
     * <p>|conditions|ConDatas\[\]|No|The filter conditions for the report.|</p>
     * <br>
     * <p>**Fields in the ConDatas parameter**</p>
     * <br>
     * <p>|Field|Type|Required|Description|</p>
     * <p>|---|---|---|---|</p>
     * <p>|field|String|No|The filter field.|</p>
     * <p>|op|String|No|The filter operation.|</p>
     * <p>|value|String\[\]|No|The array of field values.|</p>
     * <br>
     * <br>
     * <p>**Fields in the email parameter**</p>
     * <br>
     * <p>|Field|Type|Required|Description|</p>
     * <p>|---|---|---|---|</p>
     * <p>|subject|String|Yes|The email subject.|</p>
     * <p>|to|String\[\]|Yes|The email addresses to which operations reports are sent.|</p>
     * <br>
     * <br>
     * <p>**Fields in the Deliver parameter**</p>
     * <br>
     * <p>|Field|Type|Required|Description|</p>
     * <p>|---|---|---|---|</p>
     * <p>|subject|String|No|The email subject.|</p>
     * <p>|to|String\[\]|Yes|The email addresses to which operations reports are sent.|</p>
     * <br>
     * <br>
     * <p>**Fields in the Schedule parameter**</p>
     * <br>
     * <p>|Field|Type|Required|Description|</p>
     * <p>|---|---|---|---|</p>
     * <p>|schedName|String|No|The name of the tracking task.|</p>
     * <p>|description|String|No|The description of the tracking task.|</p>
     * <p>|crontab|String|Yes|Specifies the cycle in which the tracking task is scheduled to run.|</p>
     * <p>|frequency|String|Yes|The interval at which the reports are sent. Valid values:<br />**h**: by hour<br />**d**: by day<br />**w**: by week|</p>
     * <p>|status|String|No|The status of the tracking task. Valid values:<br />**enable**<br />**disable**|</p>
     * <p>|effectiveFrom|String|No|The start time of the tracking task.|</p>
     * <p>|effectiveEnd|String|No|The end time of the tracking task.|</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the tracking task.</p>
     */
    @NameInMap("Reports")
    public String reports;

    /**
     * <p>The method that is used to send operations reports. Operations reports are sent to you only by email. The settings must be escaped in JSON.</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    public static UpdateCdnDeliverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnDeliverTaskRequest self = new UpdateCdnDeliverTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCdnDeliverTaskRequest setDeliver(String deliver) {
        this.deliver = deliver;
        return this;
    }
    public String getDeliver() {
        return this.deliver;
    }

    public UpdateCdnDeliverTaskRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public UpdateCdnDeliverTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateCdnDeliverTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCdnDeliverTaskRequest setReports(String reports) {
        this.reports = reports;
        return this;
    }
    public String getReports() {
        return this.reports;
    }

    public UpdateCdnDeliverTaskRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

}
