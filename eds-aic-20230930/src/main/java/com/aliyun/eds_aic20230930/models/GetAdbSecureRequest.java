// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GetAdbSecureRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static GetAdbSecureRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdbSecureRequest self = new GetAdbSecureRequest();
        return TeaModel.build(map, self);
    }

    public GetAdbSecureRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
