// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigurationRecorderResponseBody extends TeaModel {
    @NameInMap("ConfigurationRecorder")
    public DescribeConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConfigurationRecorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationRecorderResponseBody self = new DescribeConfigurationRecorderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationRecorderResponseBody setConfigurationRecorder(DescribeConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public DescribeConfigurationRecorderResponseBodyConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public DescribeConfigurationRecorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeConfigurationRecorderResponseBodyConfigurationRecorder extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ConfigurationRecorderStatus")
        public String configurationRecorderStatus;

        @NameInMap("OrganizationEnableStatus")
        public String organizationEnableStatus;

        @NameInMap("OrganizationMasterId")
        public Long organizationMasterId;

        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static DescribeConfigurationRecorderResponseBodyConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationRecorderResponseBodyConfigurationRecorder self = new DescribeConfigurationRecorderResponseBodyConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationRecorderResponseBodyConfigurationRecorder setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeConfigurationRecorderResponseBodyConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public DescribeConfigurationRecorderResponseBodyConfigurationRecorder setOrganizationEnableStatus(String organizationEnableStatus) {
            this.organizationEnableStatus = organizationEnableStatus;
            return this;
        }
        public String getOrganizationEnableStatus() {
            return this.organizationEnableStatus;
        }

        public DescribeConfigurationRecorderResponseBodyConfigurationRecorder setOrganizationMasterId(Long organizationMasterId) {
            this.organizationMasterId = organizationMasterId;
            return this;
        }
        public Long getOrganizationMasterId() {
            return this.organizationMasterId;
        }

        public DescribeConfigurationRecorderResponseBodyConfigurationRecorder setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

}
