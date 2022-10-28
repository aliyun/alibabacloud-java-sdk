// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListEffectiveOrdersRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    public static ListEffectiveOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEffectiveOrdersRequest self = new ListEffectiveOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListEffectiveOrdersRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
