// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetAccessConfigurationResponseBody extends TeaModel {
    @NameInMap("AccessConfiguration")
    public GetAccessConfigurationResponseBodyAccessConfiguration accessConfiguration;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessConfigurationResponseBody self = new GetAccessConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessConfigurationResponseBody setAccessConfiguration(GetAccessConfigurationResponseBodyAccessConfiguration accessConfiguration) {
        this.accessConfiguration = accessConfiguration;
        return this;
    }
    public GetAccessConfigurationResponseBodyAccessConfiguration getAccessConfiguration() {
        return this.accessConfiguration;
    }

    public GetAccessConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessConfigurationResponseBodyAccessConfiguration extends TeaModel {
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

        public static GetAccessConfigurationResponseBodyAccessConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetAccessConfigurationResponseBodyAccessConfiguration self = new GetAccessConfigurationResponseBodyAccessConfiguration();
            return TeaModel.build(map, self);
        }

        public GetAccessConfigurationResponseBodyAccessConfiguration setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public GetAccessConfigurationResponseBodyAccessConfiguration setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public GetAccessConfigurationResponseBodyAccessConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAccessConfigurationResponseBodyAccessConfiguration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAccessConfigurationResponseBodyAccessConfiguration setRelayState(String relayState) {
            this.relayState = relayState;
            return this;
        }
        public String getRelayState() {
            return this.relayState;
        }

        public GetAccessConfigurationResponseBodyAccessConfiguration setSessionDuration(Integer sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public Integer getSessionDuration() {
            return this.sessionDuration;
        }

        public GetAccessConfigurationResponseBodyAccessConfiguration setStatusNotifications(java.util.List<String> statusNotifications) {
            this.statusNotifications = statusNotifications;
            return this;
        }
        public java.util.List<String> getStatusNotifications() {
            return this.statusNotifications;
        }

        public GetAccessConfigurationResponseBodyAccessConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
