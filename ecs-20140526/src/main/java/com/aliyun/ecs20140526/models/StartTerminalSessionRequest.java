// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartTerminalSessionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command to be executed after the session is initiated. The command cannot exceed 512 characters in length.</p>
     * <blockquote>
     * <p>After CommandLine is specified, you cannot specify PortNumber or TargetServer.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ssh <a href="mailto:root@192.168.0.246">root@192.168.0.246</a></p>
     */
    @NameInMap("CommandLine")
    public String commandLine;

    /**
     * <p>The network type of the WebSocket URL required for a remote connection to the instance. Valid values:</p>
     * <ul>
     * <li>Internet: the Internet. This is the default value.</li>
     * <li>Intranet: the internal network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The session encryption configurations.</p>
     */
    @NameInMap("EncryptionOptions")
    public StartTerminalSessionRequestEncryptionOptions encryptionOptions;

    /**
     * <p>The list of instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the user password used when Session Manager is used on a Windows instance. The name cannot exceed 255 characters in length.
     * If you want to use Session Manager on a Windows instance as a non-default user (System), you must specify both the Username parameter and this parameter. To reduce the risk of password leakage, the plaintext password must be hosted in the operations management parameter repository, and only the password name is passed here. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encrypted parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("PasswordName")
    public String passwordName;

    /**
     * <p>The port number of the ECS instance, which is used for data forwarding. After this parameter is specified, data forwarding of Cloud Assistant Agent is directed to the specified port number for port forwarding. For example, SSH uses port 22.</p>
     * <p>Default value: null, which indicates that the port number for data forwarding is not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("PortNumber")
    public Integer portNumber;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The destination service address in the VPC that is accessed through the instance.</p>
     * <blockquote>
     * <p>When this parameter is not empty, PortNumber specifies the port number of the destination service in the VPC that is accessed through the managed instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.246</p>
     */
    @NameInMap("TargetServer")
    public String targetServer;

    /**
     * <p>The username used for the connection.</p>
     * 
     * <strong>example:</strong>
     * <p>testUser</p>
     */
    @NameInMap("Username")
    public String username;

    public static StartTerminalSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTerminalSessionRequest self = new StartTerminalSessionRequest();
        return TeaModel.build(map, self);
    }

    public StartTerminalSessionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartTerminalSessionRequest setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }
    public String getCommandLine() {
        return this.commandLine;
    }

    public StartTerminalSessionRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public StartTerminalSessionRequest setEncryptionOptions(StartTerminalSessionRequestEncryptionOptions encryptionOptions) {
        this.encryptionOptions = encryptionOptions;
        return this;
    }
    public StartTerminalSessionRequestEncryptionOptions getEncryptionOptions() {
        return this.encryptionOptions;
    }

    public StartTerminalSessionRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public StartTerminalSessionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StartTerminalSessionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartTerminalSessionRequest setPasswordName(String passwordName) {
        this.passwordName = passwordName;
        return this;
    }
    public String getPasswordName() {
        return this.passwordName;
    }

    public StartTerminalSessionRequest setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
        return this;
    }
    public Integer getPortNumber() {
        return this.portNumber;
    }

    public StartTerminalSessionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartTerminalSessionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartTerminalSessionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public StartTerminalSessionRequest setTargetServer(String targetServer) {
        this.targetServer = targetServer;
        return this;
    }
    public String getTargetServer() {
        return this.targetServer;
    }

    public StartTerminalSessionRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public static class StartTerminalSessionRequestEncryptionOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable end-to-end encryption for the session connection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The ID of the KMS key.
         * Precautions:</p>
         * <ul>
         * <li>Only KMS symmetric keys are supported.</li>
         * <li>This parameter is supported only when the encryption mode is set to Kms.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The encryption pattern. Valid values:</p>
         * <ul>
         * <li>Auto: uses an automatically negotiated key to perform secret key encryption on the session.</li>
         * <li>Kms: uses a KMS key to perform secret key encryption on the session.</li>
         * <li>Default value: Auto.</li>
         * </ul>
         * <p>Precautions:</p>
         * <ul>
         * <li>This parameter is supported only when session encryption is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static StartTerminalSessionRequestEncryptionOptions build(java.util.Map<String, ?> map) throws Exception {
            StartTerminalSessionRequestEncryptionOptions self = new StartTerminalSessionRequestEncryptionOptions();
            return TeaModel.build(map, self);
        }

        public StartTerminalSessionRequestEncryptionOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public StartTerminalSessionRequestEncryptionOptions setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public StartTerminalSessionRequestEncryptionOptions setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

}
