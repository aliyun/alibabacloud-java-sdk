// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ListServiceSettingsResponseBody extends TeaModel {
    @NameInMap("CloudAssistantDeliverySettings")
    public CloudAssistantDeliverySettings cloudAssistantDeliverySettings;

    @NameInMap("RequestId")
    public String requestId;

    public static ListServiceSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSettingsResponseBody self = new ListServiceSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceSettingsResponseBody setCloudAssistantDeliverySettings(CloudAssistantDeliverySettings cloudAssistantDeliverySettings) {
        this.cloudAssistantDeliverySettings = cloudAssistantDeliverySettings;
        return this;
    }
    public CloudAssistantDeliverySettings getCloudAssistantDeliverySettings() {
        return this.cloudAssistantDeliverySettings;
    }

    public ListServiceSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudAssistantDeliverySettings extends TeaModel {
        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssEnabled")
        public Boolean ossEnabled;

        @NameInMap("OssKeyPrefix")
        public String ossKeyPrefix;

        @NameInMap("SlsEnabled")
        public Boolean slsEnabled;

        @NameInMap("SlsLogstoreName")
        public String slsLogstoreName;

        @NameInMap("SlsProjectName")
        public String slsProjectName;

        public static CloudAssistantDeliverySettings build(java.util.Map<String, ?> map) throws Exception {
            CloudAssistantDeliverySettings self = new CloudAssistantDeliverySettings();
            return TeaModel.build(map, self);
        }

        public CloudAssistantDeliverySettings setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public CloudAssistantDeliverySettings setOssEnabled(Boolean ossEnabled) {
            this.ossEnabled = ossEnabled;
            return this;
        }
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        public CloudAssistantDeliverySettings setOssKeyPrefix(String ossKeyPrefix) {
            this.ossKeyPrefix = ossKeyPrefix;
            return this;
        }
        public String getOssKeyPrefix() {
            return this.ossKeyPrefix;
        }

        public CloudAssistantDeliverySettings setSlsEnabled(Boolean slsEnabled) {
            this.slsEnabled = slsEnabled;
            return this;
        }
        public Boolean getSlsEnabled() {
            return this.slsEnabled;
        }

        public CloudAssistantDeliverySettings setSlsLogstoreName(String slsLogstoreName) {
            this.slsLogstoreName = slsLogstoreName;
            return this;
        }
        public String getSlsLogstoreName() {
            return this.slsLogstoreName;
        }

        public CloudAssistantDeliverySettings setSlsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }
        public String getSlsProjectName() {
            return this.slsProjectName;
        }

    }

}
