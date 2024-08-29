// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigurationRecorderResponseBody extends TeaModel {
    /**
     * <p>The details of the configuration recorder.</p>
     */
    @NameInMap("ConfigurationRecorder")
    public UpdateConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A1D5095-D1F9-56B6-A712-EA495608E79A</p>
     */
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
