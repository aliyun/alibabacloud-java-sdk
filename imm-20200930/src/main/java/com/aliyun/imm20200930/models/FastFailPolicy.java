// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FastFailPolicy extends TeaModel {
    /**
     * <p>The action when the batch processor or trigger encounters an error.</p>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>abort: stops running.</li>
     * <li>ignore: ignores the error and keeps running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>abort</p>
     */
    @NameInMap("Action")
    public String action;

    public static FastFailPolicy build(java.util.Map<String, ?> map) throws Exception {
        FastFailPolicy self = new FastFailPolicy();
        return TeaModel.build(map, self);
    }

    public FastFailPolicy setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}
