// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessConfigurationResponseBody extends TeaModel {
    /**
     * <p>The information about the access configuration.</p>
     */
    @NameInMap("AccessConfiguration")
    public CreateAccessConfigurationResponseBodyAccessConfiguration accessConfiguration;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3A41736-A050-50B6-ABC5-590F376A0044</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessConfigurationResponseBody self = new CreateAccessConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessConfigurationResponseBody setAccessConfiguration(CreateAccessConfigurationResponseBodyAccessConfiguration accessConfiguration) {
        this.accessConfiguration = accessConfiguration;
        return this;
    }
    public CreateAccessConfigurationResponseBodyAccessConfiguration getAccessConfiguration() {
        return this.accessConfiguration;
    }

    public CreateAccessConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAccessConfigurationResponseBodyAccessConfigurationTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAccessConfigurationResponseBodyAccessConfigurationTags build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessConfigurationResponseBodyAccessConfigurationTags self = new CreateAccessConfigurationResponseBodyAccessConfigurationTags();
            return TeaModel.build(map, self);
        }

        public CreateAccessConfigurationResponseBodyAccessConfigurationTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAccessConfigurationResponseBodyAccessConfigurationTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAccessConfigurationResponseBodyAccessConfiguration extends TeaModel {
        /**
         * <p>The ID of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        /**
         * <p>The name of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS-Admin</p>
         */
        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        /**
         * <p>The time when the access configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-02T08:44:23Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an access configuration.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The initial web page</p>
         * <p>that is displayed after a CloudSSO user uses the access configuration to access an account in your resource directory.</p>
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
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("SessionDuration")
        public Integer sessionDuration;

        /**
         * <p>The status notifications.</p>
         */
        @NameInMap("StatusNotifications")
        public java.util.List<String> statusNotifications;

        @NameInMap("Tags")
        public java.util.List<CreateAccessConfigurationResponseBodyAccessConfigurationTags> tags;

        /**
         * <p>The time when the information about the access configuration was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-02T08:44:23Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static CreateAccessConfigurationResponseBodyAccessConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessConfigurationResponseBodyAccessConfiguration self = new CreateAccessConfigurationResponseBodyAccessConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateAccessConfigurationResponseBodyAccessConfiguration setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public CreateAccessConfigurationResponseBodyAccessConfiguration setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public CreateAccessConfigurationResponseBodyAccessConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAccessConfigurationResponseBodyAccessConfiguration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAccessConfigurationResponseBodyAccessConfiguration setRelayState(String relayState) {
            this.relayState = relayState;
            return this;
        }
        public String getRelayState() {
            return this.relayState;
        }

        public CreateAccessConfigurationResponseBodyAccessConfiguration setSessionDuration(Integer sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public Integer getSessionDuration() {
            return this.sessionDuration;
        }

        public CreateAccessConfigurationResponseBodyAccessConfiguration setStatusNotifications(java.util.List<String> statusNotifications) {
            this.statusNotifications = statusNotifications;
            return this;
        }
        public java.util.List<String> getStatusNotifications() {
            return this.statusNotifications;
        }

        public CreateAccessConfigurationResponseBodyAccessConfiguration setTags(java.util.List<CreateAccessConfigurationResponseBodyAccessConfigurationTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateAccessConfigurationResponseBodyAccessConfigurationTags> getTags() {
            return this.tags;
        }

        public CreateAccessConfigurationResponseBodyAccessConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
