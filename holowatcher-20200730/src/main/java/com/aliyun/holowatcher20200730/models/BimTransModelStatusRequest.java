// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimTransModelStatusRequest extends TeaModel {
    // 转换图纸集合
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static BimTransModelStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BimTransModelStatusRequest self = new BimTransModelStatusRequest();
        return TeaModel.build(map, self);
    }

    public BimTransModelStatusRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
