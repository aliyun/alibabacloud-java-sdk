// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityFollowerRequest extends TeaModel {
    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("EntityId")
    @Validation(required = true)
    public Long entityId;

    public static GetQualityFollowerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityFollowerRequest self = new GetQualityFollowerRequest();
        return TeaModel.build(map, self);
    }

}
