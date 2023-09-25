// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDIJobRequest extends TeaModel {
    @NameInMap("DIJobId")
    public Long DIJobId;

    public static DeleteDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIJobRequest self = new DeleteDIJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

}
