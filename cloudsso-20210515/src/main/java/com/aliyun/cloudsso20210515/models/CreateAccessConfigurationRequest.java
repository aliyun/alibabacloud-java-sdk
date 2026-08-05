// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessConfigurationRequest extends TeaModel {
    /**
     * <p>The name of the access configuration.</p>
     * <p>Format: contains letters, digits, or hyphens (-).</p>
     * <p>Length: up to 32 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS-Admin</p>
     */
    @NameInMap("AccessConfigurationName")
    public String accessConfigurationName;

    /**
     * <p>The description of the access configuration.</p>
     * <p>Length: up to 1024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an access configuration.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The initial access page.</p>
     * <p>The page address that a CloudSSO user initially accesses when using the access configuration to access an account in a resource directory.</p>
     * <p>The page must be an Alibaba Cloud Management Console page. Default value: empty, which indicates that the user is redirected to the homepage of the Alibaba Cloud Management Console.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cloudsso.console.aliyun.com">https://cloudsso.console.aliyun.com</a></p>
     */
    @NameInMap("RelayState")
    public String relayState;

    /**
     * <p>The session duration.</p>
     * <p>The maximum duration of a session when a CloudSSO user uses the access configuration to access an account in a resource directory.</p>
     * <p>Unit: seconds.</p>
     * <p>Valid values: 900 to 43200 (15 minutes to 12 hours).</p>
     * <p>Default value: 3600 (1 hour).</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("SessionDuration")
    public Integer sessionDuration;

    /**
     * <p>The list of tags.</p>
     */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
