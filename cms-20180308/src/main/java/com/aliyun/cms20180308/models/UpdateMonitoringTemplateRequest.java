// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class UpdateMonitoringTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertTemplatesJson")
    public String alertTemplatesJson;

    @NameInMap("Description")
    public String description;

    @NameInMap("HostAvailabilityTemplate")
    public String hostAvailabilityTemplate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProcessMonitorTemplates")
    public String processMonitorTemplates;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RestVersion")
    public Long restVersion;

    @NameInMap("SystemEventTemplates")
    public String systemEventTemplates;

    public static UpdateMonitoringTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitoringTemplateRequest self = new UpdateMonitoringTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMonitoringTemplateRequest setAlertTemplatesJson(String alertTemplatesJson) {
        this.alertTemplatesJson = alertTemplatesJson;
        return this;
    }
    public String getAlertTemplatesJson() {
        return this.alertTemplatesJson;
    }

    public UpdateMonitoringTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMonitoringTemplateRequest setHostAvailabilityTemplate(String hostAvailabilityTemplate) {
        this.hostAvailabilityTemplate = hostAvailabilityTemplate;
        return this;
    }
    public String getHostAvailabilityTemplate() {
        return this.hostAvailabilityTemplate;
    }

    public UpdateMonitoringTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMonitoringTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMonitoringTemplateRequest setProcessMonitorTemplates(String processMonitorTemplates) {
        this.processMonitorTemplates = processMonitorTemplates;
        return this;
    }
    public String getProcessMonitorTemplates() {
        return this.processMonitorTemplates;
    }

    public UpdateMonitoringTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateMonitoringTemplateRequest setRestVersion(Long restVersion) {
        this.restVersion = restVersion;
        return this;
    }
    public Long getRestVersion() {
        return this.restVersion;
    }

    public UpdateMonitoringTemplateRequest setSystemEventTemplates(String systemEventTemplates) {
        this.systemEventTemplates = systemEventTemplates;
        return this;
    }
    public String getSystemEventTemplates() {
        return this.systemEventTemplates;
    }

}
