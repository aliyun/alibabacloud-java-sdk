// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdatePerformanceDataCollectionRequest extends TeaModel {
    /**
     * <p>Enables or disables Performance Data Collection. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the Feature.</p>
     * </li>
     * <li><p><code>off</code>: Disables the Feature.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The ID of the Site. You can get this ID by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
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
