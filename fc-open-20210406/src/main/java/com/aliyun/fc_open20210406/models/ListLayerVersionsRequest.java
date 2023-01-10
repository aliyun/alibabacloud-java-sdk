// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListLayerVersionsRequest extends TeaModel {
    // The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number.
    @NameInMap("limit")
    public Integer limit;

    // The initial version of the layer.
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
