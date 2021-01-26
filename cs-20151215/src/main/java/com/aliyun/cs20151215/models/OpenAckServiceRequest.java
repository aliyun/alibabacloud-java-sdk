// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class OpenAckServiceRequest extends TeaModel {
    // 要开通的服务类型
    @NameInMap("type")
    public String type;

    public static OpenAckServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAckServiceRequest self = new OpenAckServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenAckServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
