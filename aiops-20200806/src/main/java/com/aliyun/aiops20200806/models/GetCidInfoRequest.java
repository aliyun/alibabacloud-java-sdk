// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCidInfoRequest extends TeaModel {
    @NameInMap("Uid")
    public Long uid;

    public static GetCidInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCidInfoRequest self = new GetCidInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCidInfoRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
