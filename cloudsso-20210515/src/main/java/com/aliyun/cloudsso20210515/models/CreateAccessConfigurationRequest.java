// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessConfigurationRequest extends TeaModel {
    @NameInMap("AccessConfigurationName")
    public String accessConfigurationName;

    @NameInMap("Description")
    public String description;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("RelayState")
    public String relayState;

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
