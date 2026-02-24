// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigurationRecorderResponseBody extends TeaModel {
    /**
     * <p>The resource monitoring information.</p>
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
         * <p>The status of resource monitoring. Valid values:</p>
         * <ul>
         * <li><p>REGISTRABLE: Not registered.</p>
         * </li>
         * <li><p>BUILDING: Building.</p>
         * </li>
         * <li><p>REGISTERED: Registered.</p>
         * </li>
         * <li><p>REBUILDING: Rebuilding.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
         */
        @NameInMap("ConfigurationRecorderStatus")
        public String configurationRecorderStatus;

        /**
         * <p>A list of monitored resource types.</p>
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
