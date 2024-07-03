// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootAndroidInstancesInGroupRequest extends TeaModel {
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    @NameInMap("ForceStop")
    public Boolean forceStop;

    public static RebootAndroidInstancesInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootAndroidInstancesInGroupRequest self = new RebootAndroidInstancesInGroupRequest();
        return TeaModel.build(map, self);
    }

    public RebootAndroidInstancesInGroupRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public RebootAndroidInstancesInGroupRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

}
