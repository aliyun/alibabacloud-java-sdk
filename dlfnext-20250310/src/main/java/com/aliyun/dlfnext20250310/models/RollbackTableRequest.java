// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class RollbackTableRequest extends TeaModel {
    @NameInMap("instant")
    public FullInstant instant;

    public static RollbackTableRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackTableRequest self = new RollbackTableRequest();
        return TeaModel.build(map, self);
    }

    public RollbackTableRequest setInstant(FullInstant instant) {
        this.instant = instant;
        return this;
    }
    public FullInstant getInstant() {
        return this.instant;
    }

}
