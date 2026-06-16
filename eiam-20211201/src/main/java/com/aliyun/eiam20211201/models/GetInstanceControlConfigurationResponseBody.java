// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceControlConfigurationResponseBody extends TeaModel {
    /**
     * <p>The instance control configuration.</p>
     */
    @NameInMap("InstanceControlConfiguration")
    public GetInstanceControlConfigurationResponseBodyInstanceControlConfiguration instanceControlConfiguration;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceControlConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceControlConfigurationResponseBody self = new GetInstanceControlConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceControlConfigurationResponseBody setInstanceControlConfiguration(GetInstanceControlConfigurationResponseBodyInstanceControlConfiguration instanceControlConfiguration) {
        this.instanceControlConfiguration = instanceControlConfiguration;
        return this;
    }
    public GetInstanceControlConfigurationResponseBodyInstanceControlConfiguration getInstanceControlConfiguration() {
        return this.instanceControlConfiguration;
    }

    public GetInstanceControlConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElementsHumanVerificationConfig extends TeaModel {
        /**
         * <p>The human verification type.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:humanverification:alibaba-cloud-jigsaw-verification</p>
         */
        @NameInMap("HumanVerificationType")
        public String humanVerificationType;

        public static GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElementsHumanVerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElementsHumanVerificationConfig self = new GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElementsHumanVerificationConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElementsHumanVerificationConfig setHumanVerificationType(String humanVerificationType) {
            this.humanVerificationType = humanVerificationType;
            return this;
        }
        public String getHumanVerificationType() {
            return this.humanVerificationType;
        }

    }

    public static class GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements extends TeaModel {
        /**
         * <p>The element name.</p>
         * 
         * <strong>example:</strong>
         * <p>human_verification</p>
         */
        @NameInMap("ElementName")
        public String elementName;

        /**
         * <p>The human verification configuration.</p>
         */
        @NameInMap("HumanVerificationConfig")
        public GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElementsHumanVerificationConfig humanVerificationConfig;

        /**
         * <p>The status of the control element.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements self = new GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements();
            return TeaModel.build(map, self);
        }

        public GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements setElementName(String elementName) {
            this.elementName = elementName;
            return this;
        }
        public String getElementName() {
            return this.elementName;
        }

        public GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements setHumanVerificationConfig(GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElementsHumanVerificationConfig humanVerificationConfig) {
            this.humanVerificationConfig = humanVerificationConfig;
            return this;
        }
        public GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElementsHumanVerificationConfig getHumanVerificationConfig() {
            return this.humanVerificationConfig;
        }

        public GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceControlConfigurationResponseBodyInstanceControlConfiguration extends TeaModel {
        /**
         * <p>The list of control elements.</p>
         */
        @NameInMap("ControlElements")
        public java.util.List<GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements> controlElements;

        public static GetInstanceControlConfigurationResponseBodyInstanceControlConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceControlConfigurationResponseBodyInstanceControlConfiguration self = new GetInstanceControlConfigurationResponseBodyInstanceControlConfiguration();
            return TeaModel.build(map, self);
        }

        public GetInstanceControlConfigurationResponseBodyInstanceControlConfiguration setControlElements(java.util.List<GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements> controlElements) {
            this.controlElements = controlElements;
            return this;
        }
        public java.util.List<GetInstanceControlConfigurationResponseBodyInstanceControlConfigurationControlElements> getControlElements() {
            return this.controlElements;
        }

    }

}
