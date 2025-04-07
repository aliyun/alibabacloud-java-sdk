// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StopAndroidInstanceRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud phone instances.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>Specifies whether to enforce a stop operation. If a cloud phone instance fails to stop due to system or network issues, a forced stop can be triggered, though it may result in data loss.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    @NameInMap("SaleMode")
    public String saleMode;

    public static StopAndroidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAndroidInstanceRequest self = new StopAndroidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopAndroidInstanceRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public StopAndroidInstanceRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public StopAndroidInstanceRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

}
