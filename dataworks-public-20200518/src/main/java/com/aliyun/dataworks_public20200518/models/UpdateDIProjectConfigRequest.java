// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIProjectConfigRequest extends TeaModel {
    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("ProjectConfig")
    public String projectConfig;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SourceType")
    public String sourceType;

    public static UpdateDIProjectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIProjectConfigRequest self = new UpdateDIProjectConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDIProjectConfigRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public UpdateDIProjectConfigRequest setProjectConfig(String projectConfig) {
        this.projectConfig = projectConfig;
        return this;
    }
    public String getProjectConfig() {
        return this.projectConfig;
    }

    public UpdateDIProjectConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDIProjectConfigRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
