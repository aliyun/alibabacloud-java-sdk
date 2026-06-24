// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteOpenSourcePermissionRequest extends TeaModel {
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
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The vhost name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Vhost")
    public String vhost;

    public static DeleteOpenSourcePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSourcePermissionRequest self = new DeleteOpenSourcePermissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSourcePermissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteOpenSourcePermissionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DeleteOpenSourcePermissionRequest setVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }
    public String getVhost() {
        return this.vhost;
    }

}
