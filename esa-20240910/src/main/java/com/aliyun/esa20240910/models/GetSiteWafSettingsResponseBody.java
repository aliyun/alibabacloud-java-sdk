// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteWafSettingsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The WAF configurations of the website.</p>
     */
    @NameInMap("Settings")
    public WafSiteSettings settings;

    public static GetSiteWafSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSiteWafSettingsResponseBody self = new GetSiteWafSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSiteWafSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSiteWafSettingsResponseBody setSettings(WafSiteSettings settings) {
        this.settings = settings;
        return this;
    }
    public WafSiteSettings getSettings() {
        return this.settings;
    }

}
