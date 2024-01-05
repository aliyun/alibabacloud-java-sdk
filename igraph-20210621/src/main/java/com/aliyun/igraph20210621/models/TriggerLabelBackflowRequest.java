// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class TriggerLabelBackflowRequest extends TeaModel {
    @NameInMap("odpsPartition")
    public String odpsPartition;

    @NameInMap("timestamp")
    public String timestamp;

    public static TriggerLabelBackflowRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerLabelBackflowRequest self = new TriggerLabelBackflowRequest();
        return TeaModel.build(map, self);
    }

    public TriggerLabelBackflowRequest setOdpsPartition(String odpsPartition) {
        this.odpsPartition = odpsPartition;
        return this;
    }
    public String getOdpsPartition() {
        return this.odpsPartition;
    }

    public TriggerLabelBackflowRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
