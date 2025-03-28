// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceChanges extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}: 不进行修改</p>
     */
    @NameInMap("merge")
    public java.util.Map<String, ?> merge;

    public static ServiceChanges build(java.util.Map<String, ?> map) throws Exception {
        ServiceChanges self = new ServiceChanges();
        return TeaModel.build(map, self);
    }

    public ServiceChanges setMerge(java.util.Map<String, ?> merge) {
        this.merge = merge;
        return this;
    }
    public java.util.Map<String, ?> getMerge() {
        return this.merge;
    }

}
