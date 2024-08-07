// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class WAFConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableWAF")
    public Boolean enableWAF;

    public static WAFConfig build(java.util.Map<String, ?> map) throws Exception {
        WAFConfig self = new WAFConfig();
        return TeaModel.build(map, self);
    }

    public WAFConfig setEnableWAF(Boolean enableWAF) {
        this.enableWAF = enableWAF;
        return this;
    }
    public Boolean getEnableWAF() {
        return this.enableWAF;
    }

}
