// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningConfigurationRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("NewDefaultLandingPage")
    public String newDefaultLandingPage;

    @NameInMap("NewSessionDuration")
    public Integer newSessionDuration;

    public static UpdateUserProvisioningConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserProvisioningConfigurationRequest self = new UpdateUserProvisioningConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserProvisioningConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateUserProvisioningConfigurationRequest setNewDefaultLandingPage(String newDefaultLandingPage) {
        this.newDefaultLandingPage = newDefaultLandingPage;
        return this;
    }
    public String getNewDefaultLandingPage() {
        return this.newDefaultLandingPage;
    }

    public UpdateUserProvisioningConfigurationRequest setNewSessionDuration(Integer newSessionDuration) {
        this.newSessionDuration = newSessionDuration;
        return this;
    }
    public Integer getNewSessionDuration() {
        return this.newSessionDuration;
    }

}
