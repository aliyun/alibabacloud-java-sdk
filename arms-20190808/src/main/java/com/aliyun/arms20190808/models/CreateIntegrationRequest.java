// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateIntegrationRequest extends TeaModel {
    // Specifies whether to automatically clear alert events. Valid values:
    // 
    // *   true (default)
    // *   false
    @NameInMap("AutoRecover")
    public Boolean autoRecover;

    // The description of the alert integration.
    @NameInMap("Description")
    public String description;

    // The name of the alert integration.
    @NameInMap("IntegrationName")
    public String integrationName;

    // The service of the alert integration. Valid values:
    // 
    // *   CLOUD_MONITOR: CloudMonitor
    // *   LOG_SERVICE: Log Service
    @NameInMap("IntegrationProductType")
    public String integrationProductType;

    // The time when alert events are automatically cleared. Unit: seconds. Default value: 300.
    @NameInMap("RecoverTime")
    public Long recoverTime;

    public static CreateIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegrationRequest self = new CreateIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntegrationRequest setAutoRecover(Boolean autoRecover) {
        this.autoRecover = autoRecover;
        return this;
    }
    public Boolean getAutoRecover() {
        return this.autoRecover;
    }

    public CreateIntegrationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIntegrationRequest setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
        return this;
    }
    public String getIntegrationName() {
        return this.integrationName;
    }

    public CreateIntegrationRequest setIntegrationProductType(String integrationProductType) {
        this.integrationProductType = integrationProductType;
        return this;
    }
    public String getIntegrationProductType() {
        return this.integrationProductType;
    }

    public CreateIntegrationRequest setRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
        return this;
    }
    public Long getRecoverTime() {
        return this.recoverTime;
    }

}
