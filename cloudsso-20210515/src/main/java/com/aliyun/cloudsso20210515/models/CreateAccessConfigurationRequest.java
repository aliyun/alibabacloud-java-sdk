// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessConfigurationRequest extends TeaModel {
    /**
     * <p>The name of the access configuration.</p>
     * <br>
     * <p>The name can contain letters, digits, and hyphens (-).</p>
     * <br>
     * <p>The name can be up to 32 characters in length.</p>
     */
    @NameInMap("AccessConfigurationName")
    public String accessConfigurationName;

    /**
     * <p>The description of the access configuration.</p>
     * <br>
     * <p>The description can be up to 1,024 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The initial web page that is displayed after a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
     * <br>
     * <p>The web page must be a page of the Alibaba Cloud Management Console. By default, this parameter is empty, which indicates that the initial web page is the homepage of the Alibaba Cloud Management Console.</p>
     */
    @NameInMap("RelayState")
    public String relayState;

    /**
     * <p>The duration of a session in which a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
     * <br>
     * <p>Unit: seconds.</p>
     * <br>
     * <p>Valid values: 900 to 43200. The value 900 indicates 15 minutes. The value 43200 indicates 12 hours.</p>
     * <br>
     * <p>Default value: 3600. The value indicates 1 hour.</p>
     */
    @NameInMap("SessionDuration")
    public Integer sessionDuration;

    public static CreateAccessConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessConfigurationRequest self = new CreateAccessConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessConfigurationRequest setAccessConfigurationName(String accessConfigurationName) {
        this.accessConfigurationName = accessConfigurationName;
        return this;
    }
    public String getAccessConfigurationName() {
        return this.accessConfigurationName;
    }

    public CreateAccessConfigurationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAccessConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateAccessConfigurationRequest setRelayState(String relayState) {
        this.relayState = relayState;
        return this;
    }
    public String getRelayState() {
        return this.relayState;
    }

    public CreateAccessConfigurationRequest setSessionDuration(Integer sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }
    public Integer getSessionDuration() {
        return this.sessionDuration;
    }

}
