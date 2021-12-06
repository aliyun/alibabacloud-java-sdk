// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateAccessConfigurationResponseBody extends TeaModel {
    @NameInMap("AccessConfiguration")
    public CreateAccessConfigurationResponseBodyAccessConfiguration accessConfiguration;

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

    public static class CreateAccessConfigurationResponseBodyAccessConfiguration extends TeaModel {
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("RelayState")
        public String relayState;

        @NameInMap("SessionDuration")
        public Integer sessionDuration;

        @NameInMap("StatusNotifications")
        public java.util.List<String> statusNotifications;

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

        public CreateAccessConfigurationResponseBodyAccessConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
