// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetWebAuthnConfigurationRequest extends TeaModel {
    /**
     * <p>AAGUID及其名称列表</p>
     */
    @NameInMap("Aaguids")
    public java.util.List<SetWebAuthnConfigurationRequestAaguids> aaguids;

    /**
     * <p>是否开启AAGUID校验</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAaguidVerification")
    public Boolean enableAaguidVerification;

    /**
     * <p>是否开启WebAuthn认证器MDS校验</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableMetadataServiceVerification")
    public Boolean enableMetadataServiceVerification;

    /**
     * <p>是否允许用户自注册WebAuthn认证器</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserSelfRegistration")
    public Boolean enableUserSelfRegistration;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SetWebAuthnConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetWebAuthnConfigurationRequest self = new SetWebAuthnConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetWebAuthnConfigurationRequest setAaguids(java.util.List<SetWebAuthnConfigurationRequestAaguids> aaguids) {
        this.aaguids = aaguids;
        return this;
    }
    public java.util.List<SetWebAuthnConfigurationRequestAaguids> getAaguids() {
        return this.aaguids;
    }

    public SetWebAuthnConfigurationRequest setEnableAaguidVerification(Boolean enableAaguidVerification) {
        this.enableAaguidVerification = enableAaguidVerification;
        return this;
    }
    public Boolean getEnableAaguidVerification() {
        return this.enableAaguidVerification;
    }

    public SetWebAuthnConfigurationRequest setEnableMetadataServiceVerification(Boolean enableMetadataServiceVerification) {
        this.enableMetadataServiceVerification = enableMetadataServiceVerification;
        return this;
    }
    public Boolean getEnableMetadataServiceVerification() {
        return this.enableMetadataServiceVerification;
    }

    public SetWebAuthnConfigurationRequest setEnableUserSelfRegistration(Boolean enableUserSelfRegistration) {
        this.enableUserSelfRegistration = enableUserSelfRegistration;
        return this;
    }
    public Boolean getEnableUserSelfRegistration() {
        return this.enableUserSelfRegistration;
    }

    public SetWebAuthnConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class SetWebAuthnConfigurationRequestAaguids extends TeaModel {
        /**
         * <p>AAGUID</p>
         * 
         * <strong>example:</strong>
         * <p>adce0002-35bc-c60a-648b-0b25f1f05503</p>
         */
        @NameInMap("Aaguid")
        public String aaguid;

        /**
         * <p>AAGUID名称</p>
         * 
         * <strong>example:</strong>
         * <p>Touch ID</p>
         */
        @NameInMap("Name")
        public String name;

        public static SetWebAuthnConfigurationRequestAaguids build(java.util.Map<String, ?> map) throws Exception {
            SetWebAuthnConfigurationRequestAaguids self = new SetWebAuthnConfigurationRequestAaguids();
            return TeaModel.build(map, self);
        }

        public SetWebAuthnConfigurationRequestAaguids setAaguid(String aaguid) {
            this.aaguid = aaguid;
            return this;
        }
        public String getAaguid() {
            return this.aaguid;
        }

        public SetWebAuthnConfigurationRequestAaguids setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
