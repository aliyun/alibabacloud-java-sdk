// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReinitInstanceRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Password")
    public String password;

    public static ReinitInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitInstanceRequest self = new ReinitInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReinitInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ReinitInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReinitInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
