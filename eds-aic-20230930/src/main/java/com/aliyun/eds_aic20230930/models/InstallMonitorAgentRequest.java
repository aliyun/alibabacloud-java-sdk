// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstallMonitorAgentRequest extends TeaModel {
    /**
     * <p>A list of instance IDs.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>The monitoring type.</p>
     * <ul>
     * <li><p>Instance mode: Instance</p>
     * </li>
     * <li><p>Node mode: Node</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NODE</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    public static InstallMonitorAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallMonitorAgentRequest self = new InstallMonitorAgentRequest();
        return TeaModel.build(map, self);
    }

    public InstallMonitorAgentRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public InstallMonitorAgentRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

}
