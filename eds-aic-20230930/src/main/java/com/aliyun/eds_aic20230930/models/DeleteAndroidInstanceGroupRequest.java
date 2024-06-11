// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteAndroidInstanceGroupRequest extends TeaModel {
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    public static DeleteAndroidInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAndroidInstanceGroupRequest self = new DeleteAndroidInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAndroidInstanceGroupRequest setInstanceGroupIds(java.util.List<String> instanceGroupIds) {
        this.instanceGroupIds = instanceGroupIds;
        return this;
    }
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

}
