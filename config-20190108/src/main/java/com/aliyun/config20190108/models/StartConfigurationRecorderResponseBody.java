// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StartConfigurationRecorderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigurationRecorder")
    public StartConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    public static StartConfigurationRecorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartConfigurationRecorderResponseBody self = new StartConfigurationRecorderResponseBody();
        return TeaModel.build(map, self);
    }

    public StartConfigurationRecorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartConfigurationRecorderResponseBody setConfigurationRecorder(StartConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public StartConfigurationRecorderResponseBodyConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public static class StartConfigurationRecorderResponseBodyConfigurationRecorder extends TeaModel {
        @NameInMap("OrganizationEnableStatus")
        public String organizationEnableStatus;

        @NameInMap("ConfigurationRecorderStatus")
        public String configurationRecorderStatus;

        @NameInMap("OrganizationMasterId")
        public Long organizationMasterId;

        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static StartConfigurationRecorderResponseBodyConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            StartConfigurationRecorderResponseBodyConfigurationRecorder self = new StartConfigurationRecorderResponseBodyConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setOrganizationEnableStatus(String organizationEnableStatus) {
            this.organizationEnableStatus = organizationEnableStatus;
            return this;
        }
        public String getOrganizationEnableStatus() {
            return this.organizationEnableStatus;
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setOrganizationMasterId(Long organizationMasterId) {
            this.organizationMasterId = organizationMasterId;
            return this;
        }
        public Long getOrganizationMasterId() {
            return this.organizationMasterId;
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

}
