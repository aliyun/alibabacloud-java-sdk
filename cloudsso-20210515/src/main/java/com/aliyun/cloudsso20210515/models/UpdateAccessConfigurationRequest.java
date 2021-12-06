// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateAccessConfigurationRequest extends TeaModel {
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("NewDescription")
    public String newDescription;

    @NameInMap("NewRelayState")
    public String newRelayState;

    @NameInMap("NewSessionDuration")
    public Integer newSessionDuration;

    public static UpdateAccessConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessConfigurationRequest self = new UpdateAccessConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccessConfigurationRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public UpdateAccessConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateAccessConfigurationRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdateAccessConfigurationRequest setNewRelayState(String newRelayState) {
        this.newRelayState = newRelayState;
        return this;
    }
    public String getNewRelayState() {
        return this.newRelayState;
    }

    public UpdateAccessConfigurationRequest setNewSessionDuration(Integer newSessionDuration) {
        this.newSessionDuration = newSessionDuration;
        return this;
    }
    public Integer getNewSessionDuration() {
        return this.newSessionDuration;
    }

}
