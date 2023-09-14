// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ReplacementStrategy extends TeaModel {
    @NameInMap("InstanceCategories")
    public java.util.List<InstanceCategory> instanceCategories;

    public static ReplacementStrategy build(java.util.Map<String, ?> map) throws Exception {
        ReplacementStrategy self = new ReplacementStrategy();
        return TeaModel.build(map, self);
    }

    public ReplacementStrategy setInstanceCategories(java.util.List<InstanceCategory> instanceCategories) {
        this.instanceCategories = instanceCategories;
        return this;
    }
    public java.util.List<InstanceCategory> getInstanceCategories() {
        return this.instanceCategories;
    }

}
