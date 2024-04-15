// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListLayerVersionsRequest extends TeaModel {
    /**
     * <p>The number of versions to be returned.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The initial version of the layer.</p>
     */
    @NameInMap("startVersion")
    public String startVersion;

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

    public ListLayerVersionsRequest setStartVersion(String startVersion) {
        this.startVersion = startVersion;
        return this;
    }
    public String getStartVersion() {
        return this.startVersion;
    }

}
