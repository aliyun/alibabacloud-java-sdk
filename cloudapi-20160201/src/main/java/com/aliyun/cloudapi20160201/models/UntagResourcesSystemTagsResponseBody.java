// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class UntagResourcesSystemTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UntagResourcesSystemTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesSystemTagsResponseBody self = new UntagResourcesSystemTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesSystemTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
