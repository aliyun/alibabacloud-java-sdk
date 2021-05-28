// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ImportAppAlertRulesRequest extends TeaModel {
    @NameInMap("TemplateAlertId")
    public String templateAlertId;

    @NameInMap("Pids")
    public String pids;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    @NameInMap("TemplageAlertConfig")
    public String templageAlertConfig;

    public static ImportAppAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAppAlertRulesRequest self = new ImportAppAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public ImportAppAlertRulesRequest setTemplateAlertId(String templateAlertId) {
        this.templateAlertId = templateAlertId;
        return this;
    }
    public String getTemplateAlertId() {
        return this.templateAlertId;
    }

    public ImportAppAlertRulesRequest setPids(String pids) {
        this.pids = pids;
        return this;
    }
    public String getPids() {
        return this.pids;
    }

    public ImportAppAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportAppAlertRulesRequest setContactGroupIds(String contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    public ImportAppAlertRulesRequest setIsAutoStart(Boolean isAutoStart) {
        this.isAutoStart = isAutoStart;
        return this;
    }
    public Boolean getIsAutoStart() {
        return this.isAutoStart;
    }

    public ImportAppAlertRulesRequest setTemplageAlertConfig(String templageAlertConfig) {
        this.templageAlertConfig = templageAlertConfig;
        return this;
    }
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

}
