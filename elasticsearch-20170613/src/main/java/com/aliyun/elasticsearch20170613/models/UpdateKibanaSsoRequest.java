// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaSsoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public String enable;

    /**
     * <p>PUBLIC, PRIVATE</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC, PRIVATE</p>
     */
    @NameInMap("networkType")
    public String networkType;

    public static UpdateKibanaSsoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaSsoRequest self = new UpdateKibanaSsoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaSsoRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateKibanaSsoRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

}
