// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigurationRecorderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ConfigurationRecorder")
    @Validation(required = true)
    public DescribeConfigurationRecorderResponseConfigurationRecorder configurationRecorder;

    public static DescribeConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationRecorderResponse self = new DescribeConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationRecorderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigurationRecorderResponse setConfigurationRecorder(DescribeConfigurationRecorderResponseConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public DescribeConfigurationRecorderResponseConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public static class DescribeConfigurationRecorderResponseConfigurationRecorder extends TeaModel {
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

        public static DescribeConfigurationRecorderResponseConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationRecorderResponseConfigurationRecorder self = new DescribeConfigurationRecorderResponseConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationRecorderResponseConfigurationRecorder setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeConfigurationRecorderResponseConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public DescribeConfigurationRecorderResponseConfigurationRecorder setOrganizationMasterId(Long organizationMasterId) {
            this.organizationMasterId = organizationMasterId;
            return this;
        }
        public Long getOrganizationMasterId() {
            return this.organizationMasterId;
        }

        public DescribeConfigurationRecorderResponseConfigurationRecorder setOrganizationEnableStatus(String organizationEnableStatus) {
            this.organizationEnableStatus = organizationEnableStatus;
            return this;
        }
        public String getOrganizationEnableStatus() {
            return this.organizationEnableStatus;
        }

        public DescribeConfigurationRecorderResponseConfigurationRecorder setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

}
