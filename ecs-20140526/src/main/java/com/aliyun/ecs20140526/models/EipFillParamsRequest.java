// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipFillParamsRequest extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static EipFillParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        EipFillParamsRequest self = new EipFillParamsRequest();
        return TeaModel.build(map, self);
    }

}
