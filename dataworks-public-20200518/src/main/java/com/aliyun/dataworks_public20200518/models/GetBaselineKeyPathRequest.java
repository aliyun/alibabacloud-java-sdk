// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineKeyPathRequest extends TeaModel {
    @NameInMap("BaselineId")
    @Validation(required = true)
    public Long baselineId;

    @NameInMap("Bizdate")
    @Validation(required = true)
    public String bizdate;

    @NameInMap("InGroupId")
    @Validation(required = true)
    public Integer inGroupId;

    public static GetBaselineKeyPathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineKeyPathRequest self = new GetBaselineKeyPathRequest();
        return TeaModel.build(map, self);
    }

}
