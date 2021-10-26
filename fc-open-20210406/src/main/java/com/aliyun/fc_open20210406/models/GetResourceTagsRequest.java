// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetResourceTagsRequest extends TeaModel {
    // Resource ARN 全称或者简称
    @NameInMap("resourceArn")
    public String resourceArn;

    public static GetResourceTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTagsRequest self = new GetResourceTagsRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTagsRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

}
