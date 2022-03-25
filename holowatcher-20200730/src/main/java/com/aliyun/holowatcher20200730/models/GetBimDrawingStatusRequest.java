// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingStatusRequest extends TeaModel {
    // 原图纸id
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static GetBimDrawingStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingStatusRequest self = new GetBimDrawingStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingStatusRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
