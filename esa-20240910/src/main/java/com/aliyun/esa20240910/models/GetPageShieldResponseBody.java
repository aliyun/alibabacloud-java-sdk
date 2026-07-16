// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPageShieldResponseBody extends TeaModel {
    /**
     * <p>The switch status. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The report URI.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("ReportUri")
    public String reportUri;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F32C57AA-7BF8-49AE-A2CC-9F42390F5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version number of the site. For sites with version management enabled, you can use this parameter to specify the site version on which the configuration takes effect. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetPageShieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPageShieldResponseBody self = new GetPageShieldResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPageShieldResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public GetPageShieldResponseBody setReportUri(String reportUri) {
        this.reportUri = reportUri;
        return this;
    }
    public String getReportUri() {
        return this.reportUri;
    }

    public GetPageShieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPageShieldResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
