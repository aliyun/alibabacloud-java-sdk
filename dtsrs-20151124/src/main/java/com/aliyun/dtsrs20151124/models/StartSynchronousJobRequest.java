// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class StartSynchronousJobRequest extends TeaModel {
    @NameInMap("SynchronousJobId")
    public String synchronousJobId;

    public static StartSynchronousJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSynchronousJobRequest self = new StartSynchronousJobRequest();
        return TeaModel.build(map, self);
    }

    public StartSynchronousJobRequest setSynchronousJobId(String synchronousJobId) {
        this.synchronousJobId = synchronousJobId;
        return this;
    }
    public String getSynchronousJobId() {
        return this.synchronousJobId;
    }

}
