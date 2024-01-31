// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeUrlModerationResultRequest extends TeaModel {
    @NameInMap("ReqId")
    public String reqId;

    public static DescribeUrlModerationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUrlModerationResultRequest self = new DescribeUrlModerationResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUrlModerationResultRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

}
