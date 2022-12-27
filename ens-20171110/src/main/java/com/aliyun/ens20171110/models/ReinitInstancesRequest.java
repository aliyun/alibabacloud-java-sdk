// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReinitInstancesRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("Password")
    public String password;

    public static ReinitInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitInstancesRequest self = new ReinitInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ReinitInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ReinitInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ReinitInstancesRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
