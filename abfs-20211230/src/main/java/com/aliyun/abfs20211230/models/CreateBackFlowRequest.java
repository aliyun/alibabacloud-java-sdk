// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class CreateBackFlowRequest extends TeaModel {
    @NameInMap("odpsPartition")
    public String odpsPartition;

    @NameInMap("timestamp")
    public String timestamp;

    public static CreateBackFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackFlowRequest self = new CreateBackFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackFlowRequest setOdpsPartition(String odpsPartition) {
        this.odpsPartition = odpsPartition;
        return this;
    }
    public String getOdpsPartition() {
        return this.odpsPartition;
    }

    public CreateBackFlowRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
