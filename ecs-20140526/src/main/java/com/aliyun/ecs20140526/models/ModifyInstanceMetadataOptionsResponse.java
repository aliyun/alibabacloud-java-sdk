// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMetadataOptionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyInstanceMetadataOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMetadataOptionsResponse self = new ModifyInstanceMetadataOptionsResponse();
        return TeaModel.build(map, self);
    }

}
