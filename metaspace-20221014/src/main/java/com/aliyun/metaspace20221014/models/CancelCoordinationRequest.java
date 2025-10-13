// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014.models;

import com.aliyun.tea.*;

public class CancelCoordinationRequest extends TeaModel {
    @NameInMap("CoIds")
    public java.util.List<String> coIds;

    public static CancelCoordinationRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCoordinationRequest self = new CancelCoordinationRequest();
        return TeaModel.build(map, self);
    }

    public CancelCoordinationRequest setCoIds(java.util.List<String> coIds) {
        this.coIds = coIds;
        return this;
    }
    public java.util.List<String> getCoIds() {
        return this.coIds;
    }

}
