// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectDetailRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    public static GetProjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDetailRequest self = new GetProjectDetailRequest();
        return TeaModel.build(map, self);
    }

}
