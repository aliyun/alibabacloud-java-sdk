// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    @NameInMap("TemplageAlertConfig")
    public String templageAlertConfig;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("AlertId")
    public Long alertId;

    public static UpdateAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRuleRequest self = new UpdateAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public UpdateAlertRuleRequest setTemplageAlertConfig(String templageAlertConfig) {
        this.templageAlertConfig = templageAlertConfig;
        return this;
    }
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

    public UpdateAlertRuleRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public UpdateAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

}
