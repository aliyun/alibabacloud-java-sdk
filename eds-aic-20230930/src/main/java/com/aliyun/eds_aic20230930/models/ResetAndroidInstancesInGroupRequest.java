// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResetAndroidInstancesInGroupRequest extends TeaModel {
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    public static ResetAndroidInstancesInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAndroidInstancesInGroupRequest self = new ResetAndroidInstancesInGroupRequest();
        return TeaModel.build(map, self);
    }

    public ResetAndroidInstancesInGroupRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

}
