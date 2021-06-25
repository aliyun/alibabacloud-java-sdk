// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DeleteScmConfigRequest extends TeaModel {
    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    public static DeleteScmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScmConfigRequest self = new DeleteScmConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScmConfigRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

}
