// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcuByRegionRequest extends TeaModel {
    /**
     * <p>Set the value to <code>pop-query</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pop-query</p>
     */
    @NameInMap("Act")
    public String act;

    /**
     * <p>The ID of the namespace.</p>
     * <ul>
     * <li>The ID of a custom namespace is in the <code>region ID:namespace identifier</code> format. Example: cn-beijing:tdy218.</li>
     * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: cn-beijing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing or cn-beijing:tdy218</p>
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
