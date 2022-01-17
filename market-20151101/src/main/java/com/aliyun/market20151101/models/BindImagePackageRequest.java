// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class BindImagePackageRequest extends TeaModel {
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    @NameInMap("ImagePackageInstanceId")
    public String imagePackageInstanceId;

    public static BindImagePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        BindImagePackageRequest self = new BindImagePackageRequest();
        return TeaModel.build(map, self);
    }

    public BindImagePackageRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public BindImagePackageRequest setImagePackageInstanceId(String imagePackageInstanceId) {
        this.imagePackageInstanceId = imagePackageInstanceId;
        return this;
    }
    public String getImagePackageInstanceId() {
        return this.imagePackageInstanceId;
    }

}
