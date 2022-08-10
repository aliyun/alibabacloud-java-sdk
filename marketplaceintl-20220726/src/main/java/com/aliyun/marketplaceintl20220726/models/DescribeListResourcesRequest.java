// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeListResourcesRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uid")
    public String uid;

    public static DescribeListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeListResourcesRequest self = new DescribeListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeListResourcesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeListResourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeListResourcesRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
