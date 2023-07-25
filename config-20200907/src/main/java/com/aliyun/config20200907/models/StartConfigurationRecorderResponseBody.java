// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigurationRecorderResponseBody extends TeaModel {
    @NameInMap("ConfigurationRecorder")
    public StartConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

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
        @NameInMap("ConfigurationRecorderStatus")
        public String configurationRecorderStatus;

        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static StartConfigurationRecorderResponseBodyConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            StartConfigurationRecorderResponseBodyConfigurationRecorder self = new StartConfigurationRecorderResponseBodyConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public StartConfigurationRecorderResponseBodyConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
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
