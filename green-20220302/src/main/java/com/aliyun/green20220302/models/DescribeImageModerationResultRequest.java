// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeImageModerationResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B0963D30-BAB4-562F-9ED0-7A23AEC51C7C</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    public static DescribeImageModerationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageModerationResultRequest self = new DescribeImageModerationResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageModerationResultRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

}
