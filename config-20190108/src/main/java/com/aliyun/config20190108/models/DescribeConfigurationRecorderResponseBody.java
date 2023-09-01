// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigurationRecorderResponseBody extends TeaModel {
    /**
     * <p>The details of the configuration recorder that monitors resources.</p>
     */
    @NameInMap("ConfigurationRecorder")
    public DescribeConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of your Alibaba Cloud account.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The status of the configuration recorder. Valid values:</p>
         * <br>
         * <p>*   REGISTRABLE: The configuration recorder has not been registered.</p>
         * <p>*   BUILDING: The configuration recorder is being deployed.</p>
         * <p>*   REGISTERED: The configuration recorder has been registered.</p>
         * <p>*   REBUILDING: The configuration recorder is being redeployed.</p>
         */
        @NameInMap("ConfigurationRecorderStatus")
        public String configurationRecorderStatus;

        /**
         * <p>Indicates whether Cloud Config is upgraded to Cloud Config for Enterprise. Valid values:</p>
         * <br>
         * <p>*   REGISTRABLE: Cloud Config is not upgraded to Cloud Config for Enterprise.</p>
         * <p>*   BUILDING: Cloud Config is being upgraded to Cloud Config for Enterprise.</p>
         * <p>*   REGISTERED: Cloud Config is upgraded to Cloud Config for Enterprise.</p>
         */
        @NameInMap("OrganizationEnableStatus")
        public String organizationEnableStatus;

        /**
         * <p>The ID of the management account.</p>
         * <br>
         * <p>>  This parameter is returned only when the operation is called by a management account.</p>
         */
        @NameInMap("OrganizationMasterId")
        public Long organizationMasterId;

        /**
         * <p>The types of resources that are monitored by Cloud Config.</p>
         */
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
