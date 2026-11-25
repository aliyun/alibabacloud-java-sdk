// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchUndeployHttpApiRoutesRequest extends TeaModel {
    @NameInMap("async")
    public Boolean async;

    @NameInMap("routeIds")
    public java.util.List<String> routeIds;

    @NameInMap("undeployAll")
    public Boolean undeployAll;

    public static BatchUndeployHttpApiRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUndeployHttpApiRoutesRequest self = new BatchUndeployHttpApiRoutesRequest();
        return TeaModel.build(map, self);
    }

    public BatchUndeployHttpApiRoutesRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public BatchUndeployHttpApiRoutesRequest setRouteIds(java.util.List<String> routeIds) {
        this.routeIds = routeIds;
        return this;
    }
    public java.util.List<String> getRouteIds() {
        return this.routeIds;
    }

    public BatchUndeployHttpApiRoutesRequest setUndeployAll(Boolean undeployAll) {
        this.undeployAll = undeployAll;
        return this;
    }
    public Boolean getUndeployAll() {
        return this.undeployAll;
    }

}
