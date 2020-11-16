// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterLayoutsRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("LayoutId")
    public String layoutId;

    public static DescribeCasterLayoutsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterLayoutsRequest self = new DescribeCasterLayoutsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterLayoutsRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterLayoutsRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

}
