// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetAccessConfigurationResponseBody extends TeaModel {
    /**
     * <p>The information about the access configuration.</p>
     */
    @NameInMap("AccessConfiguration")
    public GetAccessConfigurationResponseBodyAccessConfiguration accessConfiguration;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D5E40508-483B-52F6-993C-D880B0F87591</p>
     */
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

    public static class GetAccessConfigurationResponseBodyAccessConfigurationTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetAccessConfigurationResponseBodyAccessConfigurationTags build(java.util.Map<String, ?> map) throws Exception {
            GetAccessConfigurationResponseBodyAccessConfigurationTags self = new GetAccessConfigurationResponseBodyAccessConfigurationTags();
            return TeaModel.build(map, self);
        }

        public GetAccessConfigurationResponseBodyAccessConfigurationTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAccessConfigurationResponseBodyAccessConfigurationTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAccessConfigurationResponseBodyAccessConfiguration extends TeaModel {
        /**
         * <p>The ID of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00ccule7tadaijxc****</p>
         */
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        /**
         * <p>The name of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC-Admin</p>
         */
        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        /**
         * <p>The time when the access configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-30T09:39:44Z</p>
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
         * <p>displayed after a CloudSSO user uses the access configuration to access an account in your resource directory.</p>
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
        public java.util.List<GetAccessConfigurationResponseBodyAccessConfigurationTags> tags;

        /**
         * <p>The time when the information about the access configuration was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-26T03:02:11Z</p>
         */
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

        public GetAccessConfigurationResponseBodyAccessConfiguration setTags(java.util.List<GetAccessConfigurationResponseBodyAccessConfigurationTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetAccessConfigurationResponseBodyAccessConfigurationTags> getTags() {
            return this.tags;
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
