// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StartConfigurationRecorderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ConfigurationRecorder")
    @Validation(required = true)
    public StartConfigurationRecorderResponseConfigurationRecorder configurationRecorder;

    public static StartConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        StartConfigurationRecorderResponse self = new StartConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public StartConfigurationRecorderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartConfigurationRecorderResponse setConfigurationRecorder(StartConfigurationRecorderResponseConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public StartConfigurationRecorderResponseConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public static class StartConfigurationRecorderResponseConfigurationRecorder extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public Long accountId;

        @NameInMap("ConfigurationRecorderStatus")
        @Validation(required = true)
        public String configurationRecorderStatus;

        @NameInMap("OrganizationMasterId")
        @Validation(required = true)
        public Long organizationMasterId;

        @NameInMap("OrganizationEnableStatus")
        @Validation(required = true)
        public String organizationEnableStatus;

        @NameInMap("ResourceTypes")
        @Validation(required = true)
        public java.util.List<String> resourceTypes;

        public static StartConfigurationRecorderResponseConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            StartConfigurationRecorderResponseConfigurationRecorder self = new StartConfigurationRecorderResponseConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public StartConfigurationRecorderResponseConfigurationRecorder setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public StartConfigurationRecorderResponseConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public StartConfigurationRecorderResponseConfigurationRecorder setOrganizationMasterId(Long organizationMasterId) {
            this.organizationMasterId = organizationMasterId;
            return this;
        }
        public Long getOrganizationMasterId() {
            return this.organizationMasterId;
        }

        public StartConfigurationRecorderResponseConfigurationRecorder setOrganizationEnableStatus(String organizationEnableStatus) {
            this.organizationEnableStatus = organizationEnableStatus;
            return this;
        }
        public String getOrganizationEnableStatus() {
            return this.organizationEnableStatus;
        }

        public StartConfigurationRecorderResponseConfigurationRecorder setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

}
