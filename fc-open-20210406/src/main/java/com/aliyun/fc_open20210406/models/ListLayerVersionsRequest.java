// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListLayerVersionsRequest extends TeaModel {
    @NameInMap("limit")
    public Integer limit;

    @NameInMap("startVersion")
    public Integer startVersion;

    public static ListLayerVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLayerVersionsRequest self = new ListLayerVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListLayerVersionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListLayerVersionsRequest setStartVersion(Integer startVersion) {
        this.startVersion = startVersion;
        return this;
    }
    public Integer getStartVersion() {
        return this.startVersion;
    }

}
