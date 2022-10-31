// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeStudioLayoutsRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeStudioLayoutsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStudioLayoutsRequest self = new DescribeStudioLayoutsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStudioLayoutsRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeStudioLayoutsRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public DescribeStudioLayoutsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
