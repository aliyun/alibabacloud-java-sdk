// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessConfigurationRequest extends TeaModel {
    /**
     * <p>The name of the access configuration.</p>
     * <p>The name can contain letters, digits, and hyphens (-).</p>
     * <p>The name can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS-Admin</p>
     */
    @NameInMap("AccessConfigurationName")
    public String accessConfigurationName;

    /**
     * <p>The description of the access configuration.</p>
     * <p>The description can be up to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an access configuration.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The initial web page</p>
     * <p>that is displayed after a CloudSSO user uses the access configuration to access an account in your resource directory.</p>
     * <p>The web page must be a page of the Alibaba Cloud Management Console. By default, this parameter is empty, which indicates that the initial web page is the homepage of the Alibaba Cloud Management Console.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cloudsso.console.aliyun.com">https://cloudsso.console.aliyun.com</a></p>
     */
    @NameInMap("RelayState")
    public String relayState;

    /**
     * <p>The duration of a session</p>
     * <p>in which a CloudSSO user uses the access configuration to access an account in your resource directory.</p>
     * <p>Unit: seconds.</p>
     * <p>Valid values: 900 to 43200. The value 900 indicates 15 minutes. The value 43200 indicates 12 hours.</p>
     * <p>Default value: 3600. The value indicates 1 hour.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("SessionDuration")
    public Integer sessionDuration;

    @NameInMap("Tags")
    public java.util.List<CreateAccessConfigurationRequestTags> tags;

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

    public CreateAccessConfigurationRequest setTags(java.util.List<CreateAccessConfigurationRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateAccessConfigurationRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateAccessConfigurationRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAccessConfigurationRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessConfigurationRequestTags self = new CreateAccessConfigurationRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateAccessConfigurationRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAccessConfigurationRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
