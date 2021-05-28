// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ImportCustomAlertRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    @NameInMap("TemplateAlertConfig")
    public String templateAlertConfig;

    @NameInMap("TemplageAlertConfig")
    public String templageAlertConfig;

    public static ImportCustomAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomAlertRulesRequest self = new ImportCustomAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public ImportCustomAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportCustomAlertRulesRequest setContactGroupIds(String contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    public ImportCustomAlertRulesRequest setIsAutoStart(Boolean isAutoStart) {
        this.isAutoStart = isAutoStart;
        return this;
    }
    public Boolean getIsAutoStart() {
        return this.isAutoStart;
    }

    public ImportCustomAlertRulesRequest setTemplateAlertConfig(String templateAlertConfig) {
        this.templateAlertConfig = templateAlertConfig;
        return this;
    }
    public String getTemplateAlertConfig() {
        return this.templateAlertConfig;
    }

    public ImportCustomAlertRulesRequest setTemplageAlertConfig(String templageAlertConfig) {
        this.templageAlertConfig = templageAlertConfig;
        return this;
    }
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

}
