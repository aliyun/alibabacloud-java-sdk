// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipFillProductRequest extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static EipFillProductRequest build(java.util.Map<String, ?> map) throws Exception {
        EipFillProductRequest self = new EipFillProductRequest();
        return TeaModel.build(map, self);
    }

}
