// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StartAndroidInstanceRequest extends TeaModel {
    /**
     * <p>List of instances.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    @NameInMap("SaleMode")
    public String saleMode;

    public static StartAndroidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAndroidInstanceRequest self = new StartAndroidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartAndroidInstanceRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public StartAndroidInstanceRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

}
