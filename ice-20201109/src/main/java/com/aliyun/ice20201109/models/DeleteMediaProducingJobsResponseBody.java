// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaProducingJobsResponseBody extends TeaModel {
    @NameInMap("IgnoreList")
    public String ignoreList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaProducingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaProducingJobsResponseBody self = new DeleteMediaProducingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaProducingJobsResponseBody setIgnoreList(String ignoreList) {
        this.ignoreList = ignoreList;
        return this;
    }
    public String getIgnoreList() {
        return this.ignoreList;
    }

    public DeleteMediaProducingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
