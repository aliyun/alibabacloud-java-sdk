// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultRequest extends TeaModel {
    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static GetAsyncJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultRequest self = new GetAsyncJobResultRequest();
        return TeaModel.build(map, self);
    }

}
