// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcuByRegionRequest extends TeaModel {
    /**
     * <p>Set the value to `pop-query`.</p>
     */
    @NameInMap("Act")
    public String act;

    /**
     * <p>The ID of the namespace.</p>
     * <br>
     * <p>*   The ID of a custom namespace is in the `region ID:namespace identifier` format. Example: cn-beijing:tdy218.</p>
     * <p>*   The ID of the default namespace is in the `region ID` format. Example: cn-beijing.</p>
     */
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
