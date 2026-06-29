// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdatePerformanceDataCollectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable quality data collection. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The site ID. You can obtain the ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34003500310****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdatePerformanceDataCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePerformanceDataCollectionRequest self = new UpdatePerformanceDataCollectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePerformanceDataCollectionRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdatePerformanceDataCollectionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
