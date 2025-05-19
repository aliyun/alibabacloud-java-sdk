// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class CreateMonitoringTemplateRequest extends TeaModel {
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
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ProcessMonitorTemplates")
    public String processMonitorTemplates;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SystemEventTemplates")
    public String systemEventTemplates;

    public static CreateMonitoringTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitoringTemplateRequest self = new CreateMonitoringTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitoringTemplateRequest setAlertTemplatesJson(String alertTemplatesJson) {
        this.alertTemplatesJson = alertTemplatesJson;
        return this;
    }
    public String getAlertTemplatesJson() {
        return this.alertTemplatesJson;
    }

    public CreateMonitoringTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMonitoringTemplateRequest setHostAvailabilityTemplate(String hostAvailabilityTemplate) {
        this.hostAvailabilityTemplate = hostAvailabilityTemplate;
        return this;
    }
    public String getHostAvailabilityTemplate() {
        return this.hostAvailabilityTemplate;
    }

    public CreateMonitoringTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMonitoringTemplateRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateMonitoringTemplateRequest setProcessMonitorTemplates(String processMonitorTemplates) {
        this.processMonitorTemplates = processMonitorTemplates;
        return this;
    }
    public String getProcessMonitorTemplates() {
        return this.processMonitorTemplates;
    }

    public CreateMonitoringTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMonitoringTemplateRequest setSystemEventTemplates(String systemEventTemplates) {
        this.systemEventTemplates = systemEventTemplates;
        return this;
    }
    public String getSystemEventTemplates() {
        return this.systemEventTemplates;
    }

}
