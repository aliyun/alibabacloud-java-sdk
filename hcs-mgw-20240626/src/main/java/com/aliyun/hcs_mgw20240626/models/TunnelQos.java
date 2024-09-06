// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class TunnelQos extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("MaxBandwidth")
    public Long maxBandwidth;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxQps")
    public Integer maxQps;

    public static TunnelQos build(java.util.Map<String, ?> map) throws Exception {
        TunnelQos self = new TunnelQos();
        return TeaModel.build(map, self);
    }

    public TunnelQos setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }
    public Long getMaxBandwidth() {
        return this.maxBandwidth;
    }

    public TunnelQos setMaxQps(Integer maxQps) {
        this.maxQps = maxQps;
        return this;
    }
    public Integer getMaxQps() {
        return this.maxQps;
    }

}
