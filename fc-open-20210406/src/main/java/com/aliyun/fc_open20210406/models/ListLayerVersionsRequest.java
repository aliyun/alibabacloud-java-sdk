// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListLayerVersionsRequest extends TeaModel {
    /**
     * <p>The maximum number of resources to return. Default value: 20. The value cannot exceed 100. The number of returned configurations is less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The initial version of the layer.</p>
     */
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
