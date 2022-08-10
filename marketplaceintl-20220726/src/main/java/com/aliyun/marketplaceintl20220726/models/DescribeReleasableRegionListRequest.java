// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeReleasableRegionListRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uid")
    public String uid;

    public static DescribeReleasableRegionListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReleasableRegionListRequest self = new DescribeReleasableRegionListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReleasableRegionListRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReleasableRegionListRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
