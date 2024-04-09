// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CloneServiceRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static CloneServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneServiceRequest self = new CloneServiceRequest();
        return TeaModel.build(map, self);
    }

    public CloneServiceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
