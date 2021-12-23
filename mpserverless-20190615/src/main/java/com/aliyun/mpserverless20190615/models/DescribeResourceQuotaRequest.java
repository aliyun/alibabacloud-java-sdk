// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeResourceQuotaRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeResourceQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceQuotaRequest self = new DescribeResourceQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceQuotaRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
