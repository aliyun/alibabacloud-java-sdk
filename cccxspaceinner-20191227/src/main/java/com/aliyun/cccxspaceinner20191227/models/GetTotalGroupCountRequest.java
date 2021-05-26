// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetTotalGroupCountRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    public static GetTotalGroupCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTotalGroupCountRequest self = new GetTotalGroupCountRequest();
        return TeaModel.build(map, self);
    }

    public GetTotalGroupCountRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

}
