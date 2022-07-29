// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeleteSubRequest extends TeaModel {
    @NameInMap("SubId")
    public Long subId;

    public static DeleteSubRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubRequest self = new DeleteSubRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubRequest setSubId(Long subId) {
        this.subId = subId;
        return this;
    }
    public Long getSubId() {
        return this.subId;
    }

}
