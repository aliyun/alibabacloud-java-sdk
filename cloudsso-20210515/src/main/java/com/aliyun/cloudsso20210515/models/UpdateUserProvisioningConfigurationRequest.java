// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The new default URL for a CloudSSO user who logs on to the Alibaba Cloud Management Console.</p>
     * <br>
     * <p>Default value: https://homenew.console.aliyun.com.</p>
     */
    @NameInMap("NewDefaultLandingPage")
    public String newDefaultLandingPage;

    /**
     * <p>The new duration of the logon session.</p>
     * <br>
     * <p>Unit: hours.</p>
     * <br>
     * <p>Valid values: 1 to 24.</p>
     * <br>
     * <p>Default value: 6.</p>
     */
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
