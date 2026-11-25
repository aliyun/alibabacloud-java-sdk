// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchDeleteHttpApiRoutesRequest extends TeaModel {
    @NameInMap("deleteAll")
    public Boolean deleteAll;

    @NameInMap("routeIds")
    public java.util.List<String> routeIds;

    public static BatchDeleteHttpApiRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteHttpApiRoutesRequest self = new BatchDeleteHttpApiRoutesRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteHttpApiRoutesRequest setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }
    public Boolean getDeleteAll() {
        return this.deleteAll;
    }

    public BatchDeleteHttpApiRoutesRequest setRouteIds(java.util.List<String> routeIds) {
        this.routeIds = routeIds;
        return this;
    }
    public java.util.List<String> getRouteIds() {
        return this.routeIds;
    }

}
