// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateOpenSourcePermissionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>f6af6bb123988d191bfe01c9a9b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The regular expression for the configure permission.</p>
     * 
     * <strong>example:</strong>
     * <p>^$</p>
     */
    @NameInMap("Configure")
    public String configure;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-v0h1kb9nu***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The regular expression for the read permission.</p>
     * 
     * <strong>example:</strong>
     * <p>^$</p>
     */
    @NameInMap("Read")
    public String read;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The vhost name.</p>
     * 
     * <strong>example:</strong>
     * <p>vhostName</p>
     */
    @NameInMap("Vhost")
    public String vhost;

    /**
     * <p>The regular expression for the write permission.</p>
     * 
     * <strong>example:</strong>
     * <p>order_exchange</p>
     */
    @NameInMap("Write")
    public String write;

    public static CreateOpenSourcePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSourcePermissionRequest self = new CreateOpenSourcePermissionRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpenSourcePermissionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOpenSourcePermissionRequest setConfigure(String configure) {
        this.configure = configure;
        return this;
    }
    public String getConfigure() {
        return this.configure;
    }

    public CreateOpenSourcePermissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOpenSourcePermissionRequest setRead(String read) {
        this.read = read;
        return this;
    }
    public String getRead() {
        return this.read;
    }

    public CreateOpenSourcePermissionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateOpenSourcePermissionRequest setVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }
    public String getVhost() {
        return this.vhost;
    }

    public CreateOpenSourcePermissionRequest setWrite(String write) {
        this.write = write;
        return this;
    }
    public String getWrite() {
        return this.write;
    }

}
