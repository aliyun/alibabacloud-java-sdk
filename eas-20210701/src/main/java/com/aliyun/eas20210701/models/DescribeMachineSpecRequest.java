// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeMachineSpecRequest extends TeaModel {
    @NameInMap("InstanceTypes")
    @Deprecated
    public java.util.List<String> instanceTypes;

    public static DescribeMachineSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineSpecRequest self = new DescribeMachineSpecRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DescribeMachineSpecRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

}
