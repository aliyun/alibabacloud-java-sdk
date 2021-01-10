// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpaceRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpaceRequest self = new DescribeSpaceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpaceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
