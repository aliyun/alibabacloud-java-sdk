// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule.</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    /**
     * <p>The IDs of the alert contact groups. The value must be a JSON array.</p>
     */
    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    /**
     * <p>Specifies whether to enable the alert rule after it is created. Default value: `false`.</p>
     * <br>
     * <p>*   `true`: enables the alert rule.</p>
     * <p>*   `false`: disables the alert rule.</p>
     */
    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configurations of the alert template based on which you want to create an alert rule. The value must be a JSON string. You must set at least one of the **TemplateAlertId** and **TemplageAlertConfig** parameters. If you set both parameters, the **TemplateAlertId** parameter prevails. For more information about the TemplageAlertConfig parameter, see the following **additional information about the TemplageAlertConfig parameter**.</p>
     */
    @NameInMap("TemplageAlertConfig")
    public String templageAlertConfig;

    public static UpdateAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRuleRequest self = new UpdateAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public UpdateAlertRuleRequest setContactGroupIds(String contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    public UpdateAlertRuleRequest setIsAutoStart(Boolean isAutoStart) {
        this.isAutoStart = isAutoStart;
        return this;
    }
    public Boolean getIsAutoStart() {
        return this.isAutoStart;
    }

    public UpdateAlertRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAlertRuleRequest setTemplageAlertConfig(String templageAlertConfig) {
        this.templageAlertConfig = templageAlertConfig;
        return this;
    }
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

}
