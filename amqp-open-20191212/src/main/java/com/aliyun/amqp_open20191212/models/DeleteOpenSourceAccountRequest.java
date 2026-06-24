// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteOpenSourceAccountRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-v0h1kb9n***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>KcUt5e5TbhkwaLyLl</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DeleteOpenSourceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSourceAccountRequest self = new DeleteOpenSourceAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSourceAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteOpenSourceAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
