// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetInstanceControlConfigurationRequest extends TeaModel {
    /**
     * <p>实例控制项。</p>
     */
    @NameInMap("ControlElements")
    public java.util.List<SetInstanceControlConfigurationRequestControlElements> controlElements;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SetInstanceControlConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceControlConfigurationRequest self = new SetInstanceControlConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetInstanceControlConfigurationRequest setControlElements(java.util.List<SetInstanceControlConfigurationRequestControlElements> controlElements) {
        this.controlElements = controlElements;
        return this;
    }
    public java.util.List<SetInstanceControlConfigurationRequestControlElements> getControlElements() {
        return this.controlElements;
    }

    public SetInstanceControlConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class SetInstanceControlConfigurationRequestControlElementsHumanVerificationConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:humanverification:alibaba-cloud-slider-verification</p>
         */
        @NameInMap("HumanVerificationType")
        public String humanVerificationType;

        public static SetInstanceControlConfigurationRequestControlElementsHumanVerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            SetInstanceControlConfigurationRequestControlElementsHumanVerificationConfig self = new SetInstanceControlConfigurationRequestControlElementsHumanVerificationConfig();
            return TeaModel.build(map, self);
        }

        public SetInstanceControlConfigurationRequestControlElementsHumanVerificationConfig setHumanVerificationType(String humanVerificationType) {
            this.humanVerificationType = humanVerificationType;
            return this;
        }
        public String getHumanVerificationType() {
            return this.humanVerificationType;
        }

    }

    public static class SetInstanceControlConfigurationRequestControlElements extends TeaModel {
        /**
         * <p>实例控制项名称，如human_verification。</p>
         * 
         * <strong>example:</strong>
         * <p>human_verification</p>
         */
        @NameInMap("ElementName")
        public String elementName;

        @NameInMap("HumanVerificationConfig")
        public SetInstanceControlConfigurationRequestControlElementsHumanVerificationConfig humanVerificationConfig;

        /**
         * <p>实例控制项状态。</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static SetInstanceControlConfigurationRequestControlElements build(java.util.Map<String, ?> map) throws Exception {
            SetInstanceControlConfigurationRequestControlElements self = new SetInstanceControlConfigurationRequestControlElements();
            return TeaModel.build(map, self);
        }

        public SetInstanceControlConfigurationRequestControlElements setElementName(String elementName) {
            this.elementName = elementName;
            return this;
        }
        public String getElementName() {
            return this.elementName;
        }

        public SetInstanceControlConfigurationRequestControlElements setHumanVerificationConfig(SetInstanceControlConfigurationRequestControlElementsHumanVerificationConfig humanVerificationConfig) {
            this.humanVerificationConfig = humanVerificationConfig;
            return this;
        }
        public SetInstanceControlConfigurationRequestControlElementsHumanVerificationConfig getHumanVerificationConfig() {
            return this.humanVerificationConfig;
        }

        public SetInstanceControlConfigurationRequestControlElements setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
