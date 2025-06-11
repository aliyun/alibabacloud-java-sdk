// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The new default URL for a CloudSSO user who logs on to the Alibaba Cloud Management Console.</p>
     * <p>Default value: <a href="https://homenew.console.aliyun.com">https://homenew.console.aliyun.com</a>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://home.console.aliyun.com/home/dashboard/ProductAndService">https://home.console.aliyun.com/home/dashboard/ProductAndService</a></p>
     */
    @NameInMap("NewDefaultLandingPage")
    public String newDefaultLandingPage;

    /**
     * <p>The new duration of the logon session.</p>
     * <p>Unit: hours.</p>
     * <p>Valid values: 1 to 24.</p>
     * <p>Default value: 6.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
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
