// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigurationRecorderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigurationRecorder")
    public PutConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    public static PutConfigurationRecorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutConfigurationRecorderResponseBody self = new PutConfigurationRecorderResponseBody();
        return TeaModel.build(map, self);
    }

    public PutConfigurationRecorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutConfigurationRecorderResponseBody setConfigurationRecorder(PutConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public PutConfigurationRecorderResponseBodyConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public static class PutConfigurationRecorderResponseBodyConfigurationRecorder extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ConfigurationRecorderStatus")
        public String configurationRecorderStatus;

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
