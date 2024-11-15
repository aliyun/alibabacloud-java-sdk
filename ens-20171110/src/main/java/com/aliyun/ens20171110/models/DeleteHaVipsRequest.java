// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteHaVipsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HaVipIds")
    public java.util.List<String> haVipIds;

    public static DeleteHaVipsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHaVipsRequest self = new DeleteHaVipsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHaVipsRequest setHaVipIds(java.util.List<String> haVipIds) {
        this.haVipIds = haVipIds;
        return this;
    }
    public java.util.List<String> getHaVipIds() {
        return this.haVipIds;
    }

}
