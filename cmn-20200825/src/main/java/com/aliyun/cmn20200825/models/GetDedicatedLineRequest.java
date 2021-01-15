// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDedicatedLineRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    public static GetDedicatedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedLineRequest self = new GetDedicatedLineRequest();
        return TeaModel.build(map, self);
    }

    public GetDedicatedLineRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

}
