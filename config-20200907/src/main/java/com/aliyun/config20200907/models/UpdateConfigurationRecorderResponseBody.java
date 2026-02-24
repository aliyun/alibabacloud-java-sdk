// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigurationRecorderResponseBody extends TeaModel {
    @NameInMap("ConfigurationRecorder")
    public UpdateConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConfigurationRecorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationRecorderResponseBody self = new UpdateConfigurationRecorderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationRecorderResponseBody setConfigurationRecorder(UpdateConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public UpdateConfigurationRecorderResponseBodyConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public UpdateConfigurationRecorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateConfigurationRecorderResponseBodyConfigurationRecorder extends TeaModel {
        @NameInMap("ConfigurationRecorderStatus")
        public String configurationRecorderStatus;

        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static UpdateConfigurationRecorderResponseBodyConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigurationRecorderResponseBodyConfigurationRecorder self = new UpdateConfigurationRecorderResponseBodyConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public UpdateConfigurationRecorderResponseBodyConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public UpdateConfigurationRecorderResponseBodyConfigurationRecorder setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

}
