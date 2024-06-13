// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootAndroidInstancesInGroupRequest extends TeaModel {
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

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

}
