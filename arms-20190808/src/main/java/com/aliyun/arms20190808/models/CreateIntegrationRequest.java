// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateIntegrationRequest extends TeaModel {
    // 是否开启恢复，默认true
    @NameInMap("AutoRecover")
    public Boolean autoRecover;

    // 集成描述
    @NameInMap("Description")
    public String description;

    // 集成名称
    @NameInMap("IntegrationName")
    public String integrationName;

    // 集成产品类型
    @NameInMap("IntegrationProductType")
    public String integrationProductType;

    // 恢复时间，默认300s
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
