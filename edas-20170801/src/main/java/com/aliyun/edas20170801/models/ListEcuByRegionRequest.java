// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcuByRegionRequest extends TeaModel {
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("Act")
    public String act;

    public static ListEcuByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcuByRegionRequest self = new ListEcuByRegionRequest();
        return TeaModel.build(map, self);
    }

    public ListEcuByRegionRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public ListEcuByRegionRequest setAct(String act) {
        this.act = act;
        return this;
    }
    public String getAct() {
        return this.act;
    }

}
