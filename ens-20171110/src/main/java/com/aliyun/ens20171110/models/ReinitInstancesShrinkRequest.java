// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReinitInstancesShrinkRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("Password")
    public String password;

    public static ReinitInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitInstancesShrinkRequest self = new ReinitInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReinitInstancesShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ReinitInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public ReinitInstancesShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
