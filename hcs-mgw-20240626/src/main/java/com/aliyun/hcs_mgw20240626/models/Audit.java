// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class Audit extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LogMode")
    public String logMode;

    public static Audit build(java.util.Map<String, ?> map) throws Exception {
        Audit self = new Audit();
        return TeaModel.build(map, self);
    }

    public Audit setLogMode(String logMode) {
        this.logMode = logMode;
        return this;
    }
    public String getLogMode() {
        return this.logMode;
    }

}
