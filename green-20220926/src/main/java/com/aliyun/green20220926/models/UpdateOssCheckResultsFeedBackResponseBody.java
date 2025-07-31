// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsFeedBackResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOssCheckResultsFeedBackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsFeedBackResponseBody self = new UpdateOssCheckResultsFeedBackResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsFeedBackResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateOssCheckResultsFeedBackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
