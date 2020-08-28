// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeOnBaselineRequest extends TeaModel {
    @NameInMap("BaselineId")
    @Validation(required = true)
    public Long baselineId;

    public static GetNodeOnBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOnBaselineRequest self = new GetNodeOnBaselineRequest();
        return TeaModel.build(map, self);
    }

}
