// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeMultimodalModerationResultRequest extends TeaModel {
    @NameInMap("ReqId")
    public String reqId;

    public static DescribeMultimodalModerationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultimodalModerationResultRequest self = new DescribeMultimodalModerationResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMultimodalModerationResultRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

}
