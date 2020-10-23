// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigurationRecorderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ConfigurationRecorder")
    @Validation(required = true)
    public PutConfigurationRecorderResponseConfigurationRecorder configurationRecorder;

    public static PutConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        PutConfigurationRecorderResponse self = new PutConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public PutConfigurationRecorderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutConfigurationRecorderResponse setConfigurationRecorder(PutConfigurationRecorderResponseConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public PutConfigurationRecorderResponseConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public static class PutConfigurationRecorderResponseConfigurationRecorder extends TeaModel {
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

        public static PutConfigurationRecorderResponseConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            PutConfigurationRecorderResponseConfigurationRecorder self = new PutConfigurationRecorderResponseConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public PutConfigurationRecorderResponseConfigurationRecorder setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public PutConfigurationRecorderResponseConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public PutConfigurationRecorderResponseConfigurationRecorder setOrganizationMasterId(Long organizationMasterId) {
            this.organizationMasterId = organizationMasterId;
            return this;
        }
        public Long getOrganizationMasterId() {
            return this.organizationMasterId;
        }

        public PutConfigurationRecorderResponseConfigurationRecorder setOrganizationEnableStatus(String organizationEnableStatus) {
            this.organizationEnableStatus = organizationEnableStatus;
            return this;
        }
        public String getOrganizationEnableStatus() {
            return this.organizationEnableStatus;
        }

        public PutConfigurationRecorderResponseConfigurationRecorder setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

}
