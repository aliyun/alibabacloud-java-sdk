// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigurationRecorderResponseBody extends TeaModel {
    /**
     * <p>The details of the configuration recorder that monitors resources.</p>
     */
    @NameInMap("ConfigurationRecorder")
    public GetConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE43696A-B3AF-5E55-9845-11393127E6D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetConfigurationRecorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigurationRecorderResponseBody self = new GetConfigurationRecorderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigurationRecorderResponseBody setConfigurationRecorder(GetConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public GetConfigurationRecorderResponseBodyConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public GetConfigurationRecorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConfigurationRecorderResponseBodyConfigurationRecorder extends TeaModel {
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
         * <p>The types of resources that are monitored.</p>
         */
        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static GetConfigurationRecorderResponseBodyConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            GetConfigurationRecorderResponseBodyConfigurationRecorder self = new GetConfigurationRecorderResponseBodyConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public GetConfigurationRecorderResponseBodyConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public GetConfigurationRecorderResponseBodyConfigurationRecorder setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

}
