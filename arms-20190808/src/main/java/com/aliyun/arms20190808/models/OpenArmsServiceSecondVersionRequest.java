// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenArmsServiceSecondVersionRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the service. Valid values:</p>
     * <ul>
     * <li><code>arms</code>: ARMS</li>
     * <li><code>arms_app</code>: Application Monitoring</li>
     * <li><code>arms_web</code>: Browser Monitoring</li>
     * <li><code>prometheus_monitor</code>: Managed Service for Prometheus</li>
     * <li><code>synthetic_post</code>: Synthetic Monitoring</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arms</p>
     */
    @NameInMap("Type")
    public String type;

    public static OpenArmsServiceSecondVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsServiceSecondVersionRequest self = new OpenArmsServiceSecondVersionRequest();
        return TeaModel.build(map, self);
    }

    public OpenArmsServiceSecondVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OpenArmsServiceSecondVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
