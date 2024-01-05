// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetTableLastBackflowRequest extends TeaModel {
    @NameInMap("partition")
    public String partition;

    public static GetTableLastBackflowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableLastBackflowRequest self = new GetTableLastBackflowRequest();
        return TeaModel.build(map, self);
    }

    public GetTableLastBackflowRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

}
