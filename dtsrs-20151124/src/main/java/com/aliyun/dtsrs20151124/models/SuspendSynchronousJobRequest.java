// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class SuspendSynchronousJobRequest extends TeaModel {
    @NameInMap("SynchronousJobId")
    public String synchronousJobId;

    public static SuspendSynchronousJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendSynchronousJobRequest self = new SuspendSynchronousJobRequest();
        return TeaModel.build(map, self);
    }

    public SuspendSynchronousJobRequest setSynchronousJobId(String synchronousJobId) {
        this.synchronousJobId = synchronousJobId;
        return this;
    }
    public String getSynchronousJobId() {
        return this.synchronousJobId;
    }

}
