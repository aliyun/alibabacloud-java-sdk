// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigurationRecorderResponseBody extends TeaModel {
    /**
     * <p>The details of the configuration recorder.</p>
     */
    @NameInMap("ConfigurationRecorder")
    public StartConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4D994662-6B27-536F-B320-38F4B3D58705</p>
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
         * <p>The status of the configuration recorder. Valid values:</p>
         * <ul>
         * <li>REGISTRABLE: The configuration recorder has not been registered.</li>
         * <li>BUILDING: The configuration recorder is being deployed.</li>
         * <li>REGISTERED: The configuration recorder has been registered.</li>
         * <li>REBUILDING: The configuration recorder is being redeployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
         */
        @NameInMap("ConfigurationRecorderStatus")
        public String configurationRecorderStatus;

        /**
         * <p>The types of the resources that are monitored by Cloud Config.</p>
         */
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
