// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteOuterAccountRequest extends TeaModel {
    @NameInMap("OuterAccountId")
    public String outerAccountId;

    @NameInMap("OuterAccountType")
    public String outerAccountType;

    public static DeleteOuterAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOuterAccountRequest self = new DeleteOuterAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOuterAccountRequest setOuterAccountId(String outerAccountId) {
        this.outerAccountId = outerAccountId;
        return this;
    }
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    public DeleteOuterAccountRequest setOuterAccountType(String outerAccountType) {
        this.outerAccountType = outerAccountType;
        return this;
    }
    public String getOuterAccountType() {
        return this.outerAccountType;
    }

}
