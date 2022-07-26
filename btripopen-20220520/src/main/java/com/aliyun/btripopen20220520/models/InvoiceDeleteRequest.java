// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceDeleteRequest extends TeaModel {
    @NameInMap("third_part_id")
    public String thirdPartId;

    @NameInMap("user_id")
    public String userId;

    public static InvoiceDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceDeleteRequest self = new InvoiceDeleteRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceDeleteRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public InvoiceDeleteRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
