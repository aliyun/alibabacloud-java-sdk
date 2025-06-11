// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateAccessConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00jhtfl8thteu6uj****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The new description of the access configuration.</p>
     * <p>The description can be up to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an access configuration.</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The new initial web page</p>
     * <p>that is displayed after a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
     * <p>The web page must be a page of the Alibaba Cloud Management Console.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cloudsso.console.aliyun.com">https://cloudsso.console.aliyun.com</a></p>
     */
    @NameInMap("NewRelayState")
    public String newRelayState;

    /**
     * <p>The new duration of a session</p>
     * <p>in which a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
     * <p>Unit: seconds.</p>
     * <p>Valid values: 900 to 43200. The value 900 indicates 15 minutes. The value 43200 indicates 12 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
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
