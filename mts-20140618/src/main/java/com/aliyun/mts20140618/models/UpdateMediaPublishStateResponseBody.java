// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaPublishStateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91B6CAB9-034C-4E4E-A40B-E7F5C81E688C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaPublishStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaPublishStateResponseBody self = new UpdateMediaPublishStateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaPublishStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
