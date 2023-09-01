// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StartConfigurationRecorderResponseBody extends TeaModel {
    /**
     * <p>The details of the configuration recorder that monitors resources.</p>
     */
    @NameInMap("ConfigurationRecorder")
    public StartConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartConfigurationRecorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartConfigurationRecorderResponseBody self = new StartConfigurationRecorderResponseBody();
        return TeaModel.build(map, self);
    }

    public StartConfigurationRecorderResponseBody setConfigurationRecorder(StartConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public StartConfigurationRecorderResponseBodyConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public StartConfigurationRecorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartConfigurationRecorderResponseBodyConfigurationRecorder extends TeaModel {
        /**
         * <p>The ID of your Alibaba Cloud account.</p>
         * <br>
         * <p>>  This parameter is returned only when the operation was called by an ordinary account.</p>
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
         * <p>The upgrade status of Cloud Config for Enterprise. Valid values:</p>
         * <br>
         * <p>*   REGISTRABLE: Cloud Config for Enterprise is not upgraded.</p>
         * <p>*   BUILDING: Cloud Config for Enterprise is being upgraded.</p>
         * <p>*   REGISTERED: Cloud Config for Enterprise is upgraded.</p>
         */
        @NameInMap("OrganizationEnableStatus")
        public String organizationEnableStatus;

        /**
         * <p>The ID of the management account.</p>
         * <br>
         * <p>>  This parameter is returned only when the operation was called by a management account.</p>
         */
        @NameInMap("OrganizationMasterId")
        public Long organizationMasterId;

        /**
         * <p>The types of resources that are monitored by Cloud Config.</p>
         * <br>
         * <p>>  By default, Cloud Config returns all resource types. In the following sample responses, `ACS::ECS::Instance` and `ACS::ECS::NetworkInterface` are returned.</p>
         */
        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static StartConfigurationRecorderResponseBodyConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            StartConfigurationRecorderResponseBodyConfigurationRecorder self = new StartConfigurationRecorderResponseBodyConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setOrganizationEnableStatus(String organizationEnableStatus) {
            this.organizationEnableStatus = organizationEnableStatus;
            return this;
        }
        public String getOrganizationEnableStatus() {
            return this.organizationEnableStatus;
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setOrganizationMasterId(Long organizationMasterId) {
            this.organizationMasterId = organizationMasterId;
            return this;
        }
        public Long getOrganizationMasterId() {
            return this.organizationMasterId;
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
