// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartTerminalSessionShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The command to run after the session is initiated. The command can be up to 512 characters in length.</p>
     * <blockquote>
     * <p>After you specify <code>CommandLine</code>, you cannot specify <code>PortNumber</code> or <code>TargetServer</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ssh <a href="mailto:root@192.168.0.246">root@192.168.0.246</a></p>
     */
    @NameInMap("CommandLine")
    public String commandLine;

    /**
     * <p>The network type of the WebSocket URL required for the remote connection to the instance. Valid values:</p>
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
     * <p>The session encryption configuration.</p>
     */
    @NameInMap("EncryptionOptions")
    public String encryptionOptionsShrink;

    /**
     * <p>The instance ID list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the password for the user when you use Session Manager on a Windows instance. The name can be up to 255 characters in length.
     * When you want to use Session Manager on a Windows instance as a non-default user (System), specify both Username and this parameter. To reduce the risk of password leaks, store the plaintext password in the parameter repository of operations management and specify only the password name here. For more information, see <a href="https://help.aliyun.com/document_detail/186828.html">Encryption parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("PasswordName")
    public String passwordName;

    /**
     * <p>The port number of the ECS instance for data forwarding. After this parameter is specified, Cloud Assistant Agent forwards data to the specified port for port forwarding. For example, SSH uses port 22.</p>
     * <p>Default value: empty, which indicates that no port number is specified for data forwarding.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("PortNumber")
    public Integer portNumber;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
     * <p>The address of the destination server in the VPC that you want to access through the instance.</p>
     * <blockquote>
     * <p>If this parameter is not empty, <code>PortNumber</code> specifies the port number of the destination server in the VPC that you want to access through the managed instance.</p>
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

    public static StartTerminalSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTerminalSessionShrinkRequest self = new StartTerminalSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartTerminalSessionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartTerminalSessionShrinkRequest setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }
    public String getCommandLine() {
        return this.commandLine;
    }

    public StartTerminalSessionShrinkRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public StartTerminalSessionShrinkRequest setEncryptionOptionsShrink(String encryptionOptionsShrink) {
        this.encryptionOptionsShrink = encryptionOptionsShrink;
        return this;
    }
    public String getEncryptionOptionsShrink() {
        return this.encryptionOptionsShrink;
    }

    public StartTerminalSessionShrinkRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public StartTerminalSessionShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StartTerminalSessionShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartTerminalSessionShrinkRequest setPasswordName(String passwordName) {
        this.passwordName = passwordName;
        return this;
    }
    public String getPasswordName() {
        return this.passwordName;
    }

    public StartTerminalSessionShrinkRequest setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
        return this;
    }
    public Integer getPortNumber() {
        return this.portNumber;
    }

    public StartTerminalSessionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartTerminalSessionShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartTerminalSessionShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public StartTerminalSessionShrinkRequest setTargetServer(String targetServer) {
        this.targetServer = targetServer;
        return this;
    }
    public String getTargetServer() {
        return this.targetServer;
    }

    public StartTerminalSessionShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
