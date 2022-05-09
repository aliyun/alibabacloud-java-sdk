// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeSynchronousJobDetailsRequest extends TeaModel {
    @NameInMap("SynchronousJobId")
    public String synchronousJobId;

    public static DescribeSynchronousJobDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronousJobDetailsRequest self = new DescribeSynchronousJobDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronousJobDetailsRequest setSynchronousJobId(String synchronousJobId) {
        this.synchronousJobId = synchronousJobId;
        return this;
    }
    public String getSynchronousJobId() {
        return this.synchronousJobId;
    }

}
