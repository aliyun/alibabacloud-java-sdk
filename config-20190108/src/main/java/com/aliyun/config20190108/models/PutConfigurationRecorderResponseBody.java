// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigurationRecorderResponseBody extends TeaModel {
    /**
     * <p>The details of the configuration recorder that monitors resources.</p>
     */
    @NameInMap("ConfigurationRecorder")
    public PutConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutConfigurationRecorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutConfigurationRecorderResponseBody self = new PutConfigurationRecorderResponseBody();
        return TeaModel.build(map, self);
    }

    public PutConfigurationRecorderResponseBody setConfigurationRecorder(PutConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public PutConfigurationRecorderResponseBodyConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public PutConfigurationRecorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PutConfigurationRecorderResponseBodyConfigurationRecorder extends TeaModel {
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
         * <p>The types of resources that are monitored by Cloud Config.</p>
         */
        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static PutConfigurationRecorderResponseBodyConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            PutConfigurationRecorderResponseBodyConfigurationRecorder self = new PutConfigurationRecorderResponseBodyConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public PutConfigurationRecorderResponseBodyConfigurationRecorder setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public PutConfigurationRecorderResponseBodyConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public PutConfigurationRecorderResponseBodyConfigurationRecorder setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

}
