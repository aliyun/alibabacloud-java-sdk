// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeSynchronousJobConfigurationRequest extends TeaModel {
    @NameInMap("SynchronousJobId")
    public String synchronousJobId;

    public static DescribeSynchronousJobConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronousJobConfigurationRequest self = new DescribeSynchronousJobConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronousJobConfigurationRequest setSynchronousJobId(String synchronousJobId) {
        this.synchronousJobId = synchronousJobId;
        return this;
    }
    public String getSynchronousJobId() {
        return this.synchronousJobId;
    }

}
