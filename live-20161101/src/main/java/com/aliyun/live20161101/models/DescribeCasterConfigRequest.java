// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterConfigRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    public static DescribeCasterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterConfigRequest self = new DescribeCasterConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterConfigRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
