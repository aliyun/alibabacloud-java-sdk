// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateAccessConfigurationResponseBody extends TeaModel {
    /**
     * <p>The information about the access configuration.</p>
     */
    @NameInMap("AccessConfiguration")
    public UpdateAccessConfigurationResponseBodyAccessConfiguration accessConfiguration;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAccessConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessConfigurationResponseBody self = new UpdateAccessConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAccessConfigurationResponseBody setAccessConfiguration(UpdateAccessConfigurationResponseBodyAccessConfiguration accessConfiguration) {
        this.accessConfiguration = accessConfiguration;
        return this;
    }
    public UpdateAccessConfigurationResponseBodyAccessConfiguration getAccessConfiguration() {
        return this.accessConfiguration;
    }

    public UpdateAccessConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAccessConfigurationResponseBodyAccessConfiguration extends TeaModel {
        /**
         * <p>The ID of the access configuration.</p>
         */
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        /**
         * <p>The name of the access configuration.</p>
         */
        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        /**
         * <p>The time when the access configuration was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the access configuration.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The initial web page that is displayed after a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
         */
        @NameInMap("RelayState")
        public String relayState;

        /**
         * <p>The duration of a session in which a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
         * <br>
         * <p>Unit: seconds.</p>
         */
        @NameInMap("SessionDuration")
        public Integer sessionDuration;

        /**
         * <p>The status notification.</p>
         */
        @NameInMap("StatusNotifications")
        public java.util.List<String> statusNotifications;

        /**
         * <p>The time when the information about the access configuration was modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static UpdateAccessConfigurationResponseBodyAccessConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateAccessConfigurationResponseBodyAccessConfiguration self = new UpdateAccessConfigurationResponseBodyAccessConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateAccessConfigurationResponseBodyAccessConfiguration setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public UpdateAccessConfigurationResponseBodyAccessConfiguration setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public UpdateAccessConfigurationResponseBodyAccessConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateAccessConfigurationResponseBodyAccessConfiguration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAccessConfigurationResponseBodyAccessConfiguration setRelayState(String relayState) {
            this.relayState = relayState;
            return this;
        }
        public String getRelayState() {
            return this.relayState;
        }

        public UpdateAccessConfigurationResponseBodyAccessConfiguration setSessionDuration(Integer sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public Integer getSessionDuration() {
            return this.sessionDuration;
        }

        public UpdateAccessConfigurationResponseBodyAccessConfiguration setStatusNotifications(java.util.List<String> statusNotifications) {
            this.statusNotifications = statusNotifications;
            return this;
        }
        public java.util.List<String> getStatusNotifications() {
            return this.statusNotifications;
        }

        public UpdateAccessConfigurationResponseBodyAccessConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
