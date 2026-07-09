// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyStrategyIdFilter extends TeaModel {
    /**
     * <p>The exact ID of the notification strategy to retrieve.</p>
     */
    @NameInMap("eq")
    public String eq;

    public static NotifyStrategyIdFilter build(java.util.Map<String, ?> map) throws Exception {
        NotifyStrategyIdFilter self = new NotifyStrategyIdFilter();
        return TeaModel.build(map, self);
    }

    public NotifyStrategyIdFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}
