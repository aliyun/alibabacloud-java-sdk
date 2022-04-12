// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcuByRegionRequest extends TeaModel {
    @NameInMap("Act")
    public String act;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static ListEcuByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcuByRegionRequest self = new ListEcuByRegionRequest();
        return TeaModel.build(map, self);
    }

    public ListEcuByRegionRequest setAct(String act) {
        this.act = act;
        return this;
    }
    public String getAct() {
        return this.act;
    }

    public ListEcuByRegionRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
