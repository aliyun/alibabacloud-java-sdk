// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ConfirmDisburseRequest extends TeaModel {
    @NameInMap("body")
    public ConfirmDisburseCmd body;

    public static ConfirmDisburseRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDisburseRequest self = new ConfirmDisburseRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmDisburseRequest setBody(ConfirmDisburseCmd body) {
        this.body = body;
        return this;
    }
    public ConfirmDisburseCmd getBody() {
        return this.body;
    }

}
