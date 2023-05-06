// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListRegionIdsRequest extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    public static ListRegionIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegionIdsRequest self = new ListRegionIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListRegionIdsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
