// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallMonitorAgentRequest extends TeaModel {
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <strong>example:</strong>
     * <p>Node</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    public static UninstallMonitorAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallMonitorAgentRequest self = new UninstallMonitorAgentRequest();
        return TeaModel.build(map, self);
    }

    public UninstallMonitorAgentRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public UninstallMonitorAgentRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

}
