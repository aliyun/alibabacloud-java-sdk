// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class StatusFilter extends TeaModel {
    /**
     * <p>The exact match condition for the alert status. Only alert rules whose status equals the specified value are returned. Valid values:</p>
     * <ul>
     * <li>Alarm: The alert rule is in the alerting state.</li>
     * <li>Ok: The alert rule is in the normal state.</li>
     * <li>InsufficientData: Insufficient data is available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Alarm</p>
     */
    @NameInMap("eq")
    public String eq;

    public static StatusFilter build(java.util.Map<String, ?> map) throws Exception {
        StatusFilter self = new StatusFilter();
        return TeaModel.build(map, self);
    }

    public StatusFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}
