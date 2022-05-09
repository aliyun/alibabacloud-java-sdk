// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DeleteSynchronousJobRequest extends TeaModel {
    @NameInMap("SynchronousJobId")
    public String synchronousJobId;

    public static DeleteSynchronousJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSynchronousJobRequest self = new DeleteSynchronousJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSynchronousJobRequest setSynchronousJobId(String synchronousJobId) {
        this.synchronousJobId = synchronousJobId;
        return this;
    }
    public String getSynchronousJobId() {
        return this.synchronousJobId;
    }

}
