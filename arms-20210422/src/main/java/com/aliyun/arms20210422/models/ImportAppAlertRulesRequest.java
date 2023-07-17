// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ImportAppAlertRulesRequest extends TeaModel {
    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    @NameInMap("Pids")
    public String pids;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplageAlertConfig")
    public String templageAlertConfig;

    @NameInMap("TemplateAlertId")
    public String templateAlertId;

    public static ImportAppAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAppAlertRulesRequest self = new ImportAppAlertRulesRequest();
        return TeaModel.build(map, self);
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

    public ImportAppAlertRulesRequest setTemplageAlertConfig(String templageAlertConfig) {
        this.templageAlertConfig = templageAlertConfig;
        return this;
    }
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

    public ImportAppAlertRulesRequest setTemplateAlertId(String templateAlertId) {
        this.templateAlertId = templateAlertId;
        return this;
    }
    public String getTemplateAlertId() {
        return this.templateAlertId;
    }

}
