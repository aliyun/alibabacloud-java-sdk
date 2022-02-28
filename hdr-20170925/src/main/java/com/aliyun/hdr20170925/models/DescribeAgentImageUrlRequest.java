// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAgentImageUrlRequest extends TeaModel {
    @NameInMap("PlatformType")
    public String platformType;

    public static DescribeAgentImageUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentImageUrlRequest self = new DescribeAgentImageUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAgentImageUrlRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

}
