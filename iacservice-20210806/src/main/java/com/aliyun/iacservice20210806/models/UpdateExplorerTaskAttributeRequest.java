// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateExplorerTaskAttributeRequest extends TeaModel {
    @NameInMap("autoApply")
    public Boolean autoApply;

    @NameInMap("explorerTaskName")
    public String explorerTaskName;

    @NameInMap("moduleId")
    public String moduleId;

    @NameInMap("moduleVersion")
    public String moduleVersion;

    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    public static UpdateExplorerTaskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExplorerTaskAttributeRequest self = new UpdateExplorerTaskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExplorerTaskAttributeRequest setAutoApply(Boolean autoApply) {
        this.autoApply = autoApply;
        return this;
    }
    public Boolean getAutoApply() {
        return this.autoApply;
    }

    public UpdateExplorerTaskAttributeRequest setExplorerTaskName(String explorerTaskName) {
        this.explorerTaskName = explorerTaskName;
        return this;
    }
    public String getExplorerTaskName() {
        return this.explorerTaskName;
    }

    public UpdateExplorerTaskAttributeRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public UpdateExplorerTaskAttributeRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public UpdateExplorerTaskAttributeRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

}
