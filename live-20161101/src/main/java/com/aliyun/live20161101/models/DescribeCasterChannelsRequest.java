// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterChannelsRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    public static DescribeCasterChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterChannelsRequest self = new DescribeCasterChannelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterChannelsRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
