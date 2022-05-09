// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class CreateSynchronousJobResponseBody extends TeaModel {
    @NameInMap("SynchronousJobId")
    public String synchronousJobId;

    public static CreateSynchronousJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSynchronousJobResponseBody self = new CreateSynchronousJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSynchronousJobResponseBody setSynchronousJobId(String synchronousJobId) {
        this.synchronousJobId = synchronousJobId;
        return this;
    }
    public String getSynchronousJobId() {
        return this.synchronousJobId;
    }

}
