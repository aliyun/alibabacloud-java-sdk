// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class SubmitRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static SubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRequest self = new SubmitRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
