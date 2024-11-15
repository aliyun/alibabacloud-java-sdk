// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateHaVipResponseBody extends TeaModel {
    @NameInMap("HaVipIds")
    public java.util.List<String> haVipIds;

    /**
     * <strong>example:</strong>
     * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHaVipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHaVipResponseBody self = new CreateHaVipResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHaVipResponseBody setHaVipIds(java.util.List<String> haVipIds) {
        this.haVipIds = haVipIds;
        return this;
    }
    public java.util.List<String> getHaVipIds() {
        return this.haVipIds;
    }

    public CreateHaVipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
